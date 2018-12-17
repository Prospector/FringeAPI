package io.github.prospector.fringe.client.renderer;

import net.minecraft.util.Identifier;

public abstract class ElementRenderer {
	public abstract void calc();

	public abstract void draw();

	public abstract Identifier getRendererIdentifier();
}
