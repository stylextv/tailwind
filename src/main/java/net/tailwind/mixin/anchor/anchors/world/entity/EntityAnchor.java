package net.tailwind.mixin.anchor.anchors.world.entity;

import java.util.function.Supplier;

import net.minecraft.entity.Entity;
import net.tailwind.mixin.anchor.Anchor;

public class EntityAnchor<T extends Entity> extends Anchor<T> {
	
	public EntityAnchor(T entity) {
		super(entity);
	}
	
	public EntityAnchor(Supplier<T> supplier) {
		super(supplier);
	}
	
	public T entity() {
		return object();
	}
	
}
