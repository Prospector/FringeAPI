package io.github.prospector.fringe.client;

import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;

public abstract class ClientBlockRaytraceElement extends ClientRaytraceElement {
	public ClientBlockRaytraceElement() {
	}

	@Override
	public boolean calc(MinecraftClient client, BlockState blockState) {
		return false;
	}
}
