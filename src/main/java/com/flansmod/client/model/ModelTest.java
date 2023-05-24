package com.flansmod.client.model;

import com.flansmod.common.parts.ItemPart;

public abstract class ModelTest extends ModelFlan
{
	protected static float getActualProgress()
	{ return ItemPart.lastProgress + (ItemPart.progress - ItemPart.lastProgress) * RenderFlan.smoothing; }
}
