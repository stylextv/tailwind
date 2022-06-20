package net.tailwind.mixin.anchor.anchors.world.entity.player;

import java.util.function.Supplier;

import net.minecraft.entity.player.PlayerEntity;
import net.tailwind.mixin.anchor.anchors.world.entity.EntityAnchor;

public class PlayerAnchor extends EntityAnchor<PlayerEntity> {
	
	public PlayerAnchor(PlayerEntity player) {
		super(player);
	}
	
	public PlayerAnchor(Supplier<PlayerEntity> supplier) {
		super(supplier);
	}
	
	public PlayerEntity player() {
		return entity();
	}
	
}
