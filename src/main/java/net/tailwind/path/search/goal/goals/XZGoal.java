package net.tailwind.path.search.goal.goals;

import net.minecraft.util.math.BlockPos;
import net.tailwind.path.search.goal.Goal;

public class XZGoal extends Goal {
	
	private int x;
	private int z;
	
	public XZGoal(int x, int z) {
		this.x = x;
		this.z = z;
	}
	
	@Override
	public double cost(BlockPos pos) {
		int x = pos.getX() - this.x;
		int z = pos.getZ() - this.z;
		
		return absoluteCost(x, z);
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
		int x = pos.getX();
		int z = pos.getZ();
		
		return absoluteCost(x, z);
	}
	
	public static double absoluteCost(int x, int z) {
		
	}
	
}
