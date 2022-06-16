package net.tailwind.path.search.goal.goals;

import net.minecraft.util.math.BlockPos;
import net.tailwind.path.search.goal.Goal;

public class YLevelGoal extends Goal {
	
	private int y;
	
	@Override
	public double cost(BlockPos pos) {
		pos = pos.subtract(position);
		
		return absoluteCost(pos);
	}
	
	@Override
	public boolean isTerminal(BlockPos pos) {
		return pos.getY() == y;
	}
	
	@Override
	public String toString() {
		return String.format("YGoal{y=%s}", y);
	}
	
	public int getY() {
		return y;
	}
	
	public static double absoluteCost(BlockPos pos) {
		
	}
	
}
