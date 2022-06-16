package net.tailwind.path.search.goal.goals;

import net.minecraft.util.math.BlockPos;
import net.tailwind.path.search.goal.Goal;

public class GetToBlockGoal extends Goal {
	
	private BlockPos position;
	
	public GetToBlockGoal(BlockPos pos) {
		this.position = pos;
	}
	
	@Override
	public double cost(BlockPos pos) {
		pos = pos.subtract(position);
		
		return BlockGoal.absoluteCost(pos);
	}
	
	@Override
	public boolean isTerminal(BlockPos pos) {
		return pos.getManhattanDistance(position) < 2;
	}
	
	@Override
	public String toString() {
		return String.format("GetToBlockGoal{pos=%s}", position);
	}
	
	public BlockPos getPosition() {
		return position;
	}
	
}
