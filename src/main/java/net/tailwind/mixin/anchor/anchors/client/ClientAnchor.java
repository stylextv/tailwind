package net.tailwind.mixin.anchor.anchors.client;

import java.util.function.Supplier;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.tailwind.mixin.anchor.Anchor;

public class ClientAnchor extends Anchor<MinecraftClient> {
	
	public ClientAnchor(MinecraftClient client) {
		super(client);
	}
	
	public ClientAnchor(Supplier<MinecraftClient> supplier) {
		super(supplier);
	}
	
	@SuppressWarnings("resource")
	public ClientWorld world() {
		return client().world;
	}
	
	@SuppressWarnings("resource")
	public ClientPlayerEntity player() {
		return client().player;
	}
	
	public MinecraftClient client() {
		return object();
	}
	
}
