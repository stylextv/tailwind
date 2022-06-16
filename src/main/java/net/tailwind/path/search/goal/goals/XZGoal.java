package net.tailwind.path.search.goal.goals;

import net.minecraft.util.math.BlockPos;
import net.tailwind.path.search.goal.Goal;

public class XZGoal extends Goal {
	
	private int x;
	private int z;
	
	@Override
	public double cost(BlockPos pos) {
		pos = pos.subtract(position);
		
		return absoluteCost(pos);
	}
	
	@Override
	public boolean isTerminal(BlockPos pos) {
		return pos.getX() == x && pos.getZ() == z;
	}
	
	@Override
	public String toString() {
		return String.format("XZGoal{x=%s, z=%s}", x, z);
	}
	
	public int getX() {
		return x;
	}
	
	public int getZ() {
		return z;
	}
	
	public static double absoluteCost(BlockPos pos) {
		
	}
	
}
