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
	
	public NodeFeature(boolean persistant) {
		this.persistant = persistant;
	}
	
	public abstract long hashValue(T value);
	
	public boolean isPersistant() {
		return persistant;
	}
	
	public void setPersistant(boolean persistant) {
		this.persistant = persistant;
	}
	
}
