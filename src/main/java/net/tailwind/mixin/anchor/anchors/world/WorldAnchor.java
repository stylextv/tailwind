package net.tailwind.mixin.anchor.anchors.world;

import java.util.function.Supplier;

import net.minecraft.world.World;
import net.tailwind.mixin.anchor.Anchor;

public class WorldAnchor extends Anchor<World> {
	
	public WorldAnchor(World world) {
		super(world);
	}
	
	public WorldAnchor(Supplier<World> supplier) {
		super(supplier);
	}
	
	public World world() {
		return object();
	}
	
}
