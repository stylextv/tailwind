package net.tailwind.mixin.anchor;

import java.util.function.Supplier;

import net.minecraft.client.MinecraftClient;
import net.tailwind.mixin.anchor.anchors.client.ClientAnchor;
import net.tailwind.mixin.anchor.anchors.world.WorldAnchor;
import net.tailwind.mixin.anchor.anchors.world.entity.player.PlayerAnchor;

public class Anchor<T> {
	
	public static final ClientAnchor CLIENT = new ClientAnchor(() -> MinecraftClient.getInstance());
	
	public static final WorldAnchor WORLD = new WorldAnchor(() -> CLIENT.world());
	public static final PlayerAnchor PLAYER = new PlayerAnchor(() -> CLIENT.player());
	
	private T object;
	
	private Supplier<T> supplier;
	
	public Anchor(T object) {
		this.object = object;
	}
	
	public Anchor(Supplier<T> supplier) {
		this.supplier = supplier;
	}
	
	public T object() {
		if(object != null) return object;
		
		return supplier.get();
	}
	
}
