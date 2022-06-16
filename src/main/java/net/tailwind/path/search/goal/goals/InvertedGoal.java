package net.tailwind.path.search.goal.goals;

import net.minecraft.util.math.BlockPos;
import net.tailwind.path.search.goal.Goal;

public class InvertedGoal extends Goal {
	
	private Goal goal;
	
	public InvertedGoal(Goal goal) {
		this.goal = goal;
	}
	
	@Override
	public double cost(BlockPos pos) {
		return -goal.cost(pos);
	}
	
	@Override
	public boolean isTerminal(BlockPos pos) {
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("InvertedGoal{goal=%s}", goal);
	}
	
	public Goal getGoal() {
		return goal;
	}
	
}
