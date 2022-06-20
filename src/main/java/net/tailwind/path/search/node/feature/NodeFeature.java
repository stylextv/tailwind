package net.tailwind.path.search.node.feature;

import net.tailwind.path.search.node.feature.features.CostFeature;
import net.tailwind.path.search.node.feature.features.ParentFeature;
import net.tailwind.path.search.node.feature.features.PositionFeature;

public abstract class NodeFeature<T> {
	
	public static final PositionFeature POSITION = new PositionFeature();
	
	public static final ParentFeature PARENT = new ParentFeature();
	
	public static final CostFeature COST = new CostFeature();
	public static final CostFeature PATH_COST = new CostFeature();
	public static final CostFeature GOAL_COST = new CostFeature();
	
	private boolean persistant;
	
	private T defaultValue;
	
	public NodeFeature(boolean persistant) {
		this(persistant, null);
	}
	
	public NodeFeature(boolean persistant, T defaultValue) {
		this.persistant = persistant;
		this.defaultValue = defaultValue;
	}
	
	public abstract long hashValue(T value);
	
	public boolean isPersistant() {
		return persistant;
	}
	
	public T getDefaultValue() {
		return defaultValue;
	}
	
}
