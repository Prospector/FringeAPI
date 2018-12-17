package io.github.prospector.fringe.client;

import io.github.prospector.fringe.element.ClientFringeElement;
import io.github.prospector.fringe.element.FringeElement;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.HitResult;
import net.minecraft.world.FluidRayTraceMode;

public abstract class ClientRaytraceElement extends FringeElement implements ClientFringeElement {
	@Override
	public void calc(MinecraftClient client) {
		HitResult result = client.player.rayTrace(client.interactionManager.getReachDistance(), 0, FluidRayTraceMode.NONE);
		if (result != null && result.type == HitResult.Type.BLOCK) {
			hide = !calc(client, client.world.getBlockState(result.getBlockPos()));
		} else {
			hide = true;
		}
	}

	/**
	 * Returns if the
	 */
	public abstract boolean calc(MinecraftClient client, BlockState blockState);
}
