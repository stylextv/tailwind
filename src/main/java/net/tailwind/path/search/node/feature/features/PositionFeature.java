package net.tailwind.path.search.node.feature.features;

import net.minecraft.util.math.BlockPos;
import net.tailwind.path.search.node.feature.NodeFeature;

public class PositionFeature extends NodeFeature<BlockPos> {
	
	public PositionFeature() {
		super(true);
	}
	
	@Override
	public long hashValue(BlockPos pos) {
		return pos.asLong();
	}
	
}
