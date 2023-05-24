package com.flansmod.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.network.PacketRequestDebug;
import com.flansmod.common.teams.TeamsManager;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class PlayerHandler
{
	//private static final Random rand = new Random();
	public static Map<String, PlayerData> serverSideData = new HashMap<String, PlayerData>();
	public static Map<String, PlayerData> clientSideData = new HashMap<String, PlayerData>();
	public static ArrayList<String> clientsToRemoveAfterThisRound = new ArrayList<String>();
	
	public PlayerHandler()
	{
		MinecraftForge.EVENT_BUS.register(this);
		FMLCommonHandler.instance().bus().register(this); 
	}

	@SubscribeEvent
	public void onEntityHurt(LivingAttackEvent event)
	{
		EntityLivingBase entity = event.entityLiving;
		if(event instanceof LivingAttackEvent && (entity.ridingEntity instanceof EntityDriveable || entity.ridingEntity instanceof EntitySeat))
		{
			event.setCanceled(true);
		}
	}

	@SubscribeEvent
	public void onLivingHurtEvent(LivingHurtEvent event)
	{
		//FlansMod.log("onLivingHurtEvent detected");
		if(event.source instanceof EntityDamageSourceIndirect && event.ammount > 0F)
		{
			Entity damageSourceEntity = ((EntityDamageSourceIndirect)event.source).getSourceOfDamage();
			//only deal with damage come from bullet hit, otherwise let default system to handle it
			if(damageSourceEntity instanceof EntityBullet)
			{
				float damage = event.ammount;
				EntityLivingBase entityBeenHit = event.entityLiving;
				//if breakableArmor == 3, the player shoot damage has been handled by PlayerHitBox, we just need to do damage to armor for other damage source
				if(FlansMod.breakableArmor == 3)
				{
					if(entityBeenHit instanceof EntityPlayer) //this part is copy from EntityPlayer damageEntity(DamageSource p_70665_1_, float p_70665_2_)
					{
						//FlansMod.log("on livingHurtEvent caught, hit player, breakableArmor = 3, this should block original damageArmor call");
						//don't care armor factor any more, but bullet damage is not absolut, so take in count of potion effect
						damage = applyPotionDamageCalculations(entityBeenHit, event.source, damage);
						float f1 = damage;
						damage = Math.max(damage - entityBeenHit.getAbsorptionAmount(), 0F);
						entityBeenHit.setAbsorptionAmount(entityBeenHit.getAbsorptionAmount() - f1 + damage);
						//if damage not equals 0, apply it
						if(damage != 0F)
						{
							((EntityPlayer)entityBeenHit).addExhaustion(event.source.getHungerDamage());
							float f2 = entityBeenHit.getHealth();
							entityBeenHit.setHealth(entityBeenHit.getHealth() - damage);
							entityBeenHit.func_110142_aN().func_94547_a(event.source, f2, damage);
						}
					}
					else //just normal LivingEntity //copy from EntityLivingBase damageEntity(DamageSource p_70665_1_, float p_70665_2_)
					{
						//FlansMod.log("on livingHurtEvent caught, hit living entity, breakableArmor = 3, this should block original damageArmor call");
						damage = applyPotionDamageCalculations(entityBeenHit, event.source, damage);
						float f1 = damage;
						damage = Math.max(damage - entityBeenHit.getAbsorptionAmount(), 0F);
						entityBeenHit.setAbsorptionAmount(entityBeenHit.getAbsorptionAmount() - f1 + damage);
						//same as upper one
						if(damage != 0F)
						{
							float f2 = entityBeenHit.getHealth();
							entityBeenHit.setHealth(f2 - damage);
							entityBeenHit.func_110142_aN().func_94547_a(event.source, f2, damage);
							entityBeenHit.setAbsorptionAmount(entityBeenHit.getAbsorptionAmount() - damage);
						}
					}
					//cancel event
					event.setCanceled(true);
					return;
				}
				//FlansMod.log("breakableArmor != 3");
				//if breakableArmor != 3, in original system, check ignoreArmorProbability
				ShootableType shootableType = ((EntityBullet)damageSourceEntity).type;
				if(shootableType.ignoreArmorProbability > 0F && FlansMod.rand.nextFloat() < shootableType.ignoreArmorProbability)
				{
					float f1 = damage;
					damage = Math.max(damage - entityBeenHit.getAbsorptionAmount(), 0F);
					entityBeenHit.setAbsorptionAmount(entityBeenHit.getAbsorptionAmount() - f1 + damage);
					damage *= shootableType.ignoreArmorDamageFactor;
					if(damage != 0F)
					{
						float health = entityBeenHit.getHealth();
						entityBeenHit.setHealth(health - damage);
						entityBeenHit.func_110142_aN().func_94547_a(event.source, health, damage);
						entityBeenHit.setAbsorptionAmount(entityBeenHit.getAbsorptionAmount() - damage);
					}
					event.setCanceled(true);
				}
			}
		}
		/** old codes
			if(event.source instanceof EntityDamageSourceGun && damage > 0)
			{
				EntityDamageSourceGun source = (EntityDamageSourceGun)event.source;
				
				ShootableType shootableType = null;
				Entity damageSouceEntity = source.getDamageSourceEntity();
				if(damageSouceEntity instanceof EntityBullet)
					shootableType = ((EntityBullet)damageSouceEntity).type;
				else if(damageSouceEntity instanceof EntityGrenade)
					shootableType = ((EntityGrenade)damageSouceEntity).type;
				
				if(shootableType != null && shootableType.ignoreArmorProbability > 0 && rand.nextFloat() < shootableType.ignoreArmorProbability)
				{
					EntityLivingBase entity = event.entityLiving;
					float f1 = damage;
					damage = Math.max(damage - entity.getAbsorptionAmount(), 0.0F);
					entity.setAbsorptionAmount(entity.getAbsorptionAmount() - (f1 - damage));
					
					damage *= shootableType.ignoreArmorDamageFactor;

					if (damage != 0.0F)
					{
						float health = entity.getHealth();
						entity.setHealth(health - damage);
						entity.func_110142_aN().func_94547_a(source, health, damage);
						entity.setAbsorptionAmount(entity.getAbsorptionAmount() - damage);
						
						//FlansMod.log("Ignore armor damage = " + damage);
					}

					event.setCanceled(true);
				}
			}
		}*/
	}
	
	/** copyed from entity living base, for it is protected in that file */
	private float applyPotionDamageCalculations(EntityLivingBase thisLivingEntity, DamageSource damageSource, float damageAmount)
    {
        if(damageSource.isDamageAbsolute())
            return damageAmount;
		/*if (this instanceof EntityZombie)
		{
			//par2 = par2; // Forge: Noop Warning
		}*/
		int i;
		int j;
		float f1;
		if(thisLivingEntity.isPotionActive(net.minecraft.potion.Potion.resistance) && damageSource != DamageSource.outOfWorld)
		{
			i = (thisLivingEntity.getActivePotionEffect(net.minecraft.potion.Potion.resistance).getAmplifier() + 1) * 5;
			j = 25 - i;
			f1 = damageAmount * (float)j;
			damageAmount = f1 / 25F;
		}
		if(damageAmount <= 0F)
			return 0F;
		i = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentModifierDamage(thisLivingEntity.getLastActiveItems(), damageSource);
		if(i > 20)
			i = 20;
		if(i > 0 && i <= 20)
		{
			j = 25 - i;
			f1 = damageAmount * (float)j;
			damageAmount = f1 / 25F;
		}
		return damageAmount;
    }
	
	@SubscribeEvent
	public void onEntityKilled(LivingDeathEvent event) 
	{
		EntityLivingBase entity = event.entityLiving;
		if(entity instanceof EntityPlayer)
		{
			getPlayerData((EntityPlayer)entity).playerKilled();
		}
	}
		
	public void serverTick()
	{
		for(WorldServer world : MinecraftServer.getServer().worldServers)
		{
			for(Object player : world.playerEntities)
			{
				getPlayerData((EntityPlayer)player).tick((EntityPlayer)player);
			}
		}
	}
	
	public void clientTick()
	{
		if(Minecraft.getMinecraft().theWorld != null)
		{
			for(Object player : Minecraft.getMinecraft().theWorld.playerEntities)
			{
				getPlayerData((EntityPlayer)player).tick((EntityPlayer)player);
			}	
		}
	}
	
	public static PlayerData getPlayerData(EntityPlayer player)
	{
		if(player == null)
			return null;
		return getPlayerData(player.getCommandSenderName(), player.worldObj.isRemote ? Side.CLIENT : Side.SERVER);
	}
	
	public static PlayerData getPlayerData(String username)
	{
		return getPlayerData(username, Side.SERVER);
	}

	public static PlayerData getPlayerData(EntityPlayer player, Side side)
	{
		if(player == null)
			return null;
		return getPlayerData(player.getCommandSenderName(), side);
	}
	
	public static PlayerData getPlayerData(String username, Side side)
	{
		if(side.isClient())
		{
			if(!clientSideData.containsKey(username))
				clientSideData.put(username, new PlayerData(username));
		}
		else
		{
			if(!serverSideData.containsKey(username))
				serverSideData.put(username, new PlayerData(username));
		}
		return side.isClient() ? clientSideData.get(username) : serverSideData.get(username);
	}

	@SubscribeEvent
	public void onPlayerEvent(PlayerEvent event) 
	{
		if(event instanceof PlayerLoggedInEvent)
		{
			if(event.player instanceof EntityPlayerMP)
			{
				FlansMod.packetHandler.sendTo(new PacketRequestDebug(false), (EntityPlayerMP)event.player);
			}
			
			EntityPlayer player = event.player;
			String username = player.getCommandSenderName();
			if(!serverSideData.containsKey(username))
				serverSideData.put(username, new PlayerData(username));
			if(clientsToRemoveAfterThisRound.contains(username))
				clientsToRemoveAfterThisRound.remove(username);
		}
		else if(event instanceof PlayerLoggedOutEvent)
		{
			EntityPlayer player = event.player;
			String username = player.getCommandSenderName();
			if(TeamsManager.getInstance().currentRound == null)
				serverSideData.remove(username);
			else clientsToRemoveAfterThisRound.add(username);
		}
		else if(event instanceof PlayerRespawnEvent)
		{
			EntityPlayer player = event.player;
			String username = player.getCommandSenderName();
			if(!serverSideData.containsKey(username))
				serverSideData.put(username, new PlayerData(username));
		}
	}
	
	/** Called by teams manager to remove lingering player data */
	public static void roundEnded()
	{
		for(String username : clientsToRemoveAfterThisRound)
		{
			serverSideData.remove(username);
		}
	}
}
