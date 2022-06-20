package net.tailwind.path.search.node.feature.features;

import net.tailwind.path.search.node.feature.NodeFeature;

public class CostFeature extends NodeFeature<Double> {
	
	public CostFeature() {
		super(false, 0D);
	}
	
	@Override
	public long hashValue(Double value) {
		return Double.doubleToLongBits(value);
	}
	
}
