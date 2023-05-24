package com.flansmod.client.model;

import com.flansmod.client.tmt.ModelRendererTurbo;

public abstract class ModelDefault extends ModelFlan
{
	public ModelRendererTurbo[] defaultModel = new ModelRendererTurbo[0];
	
	@Override
	public void render(float f) { render(defaultModel, f); }
	
	@Override
	public void renderWithoutGlow(float f) { render(f); }
	
	protected void flipAll() { flip(defaultModel); }
	
	protected void flipAllBy(boolean x, boolean y, boolean z) { flipBy(defaultModel, x, y, z); }
}
