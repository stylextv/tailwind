package net.tailwind.path.search.goal;

import net.minecraft.util.math.BlockPos;
import net.tailwind.path.search.node.Node;

public abstract class Goal {
	
	public abstract double cost(BlockPos pos);
	public abstract boolean isTerminal(BlockPos pos);
	
	public double cost(Node node) {
		BlockPos pos = node.getPosition();
		
		return cost(pos);
	}
	
	public boolean isTerminal(Node node) {
		BlockPos pos = node.getPosition();
		
		return isTerminal(pos);
	}
	
	public boolean equals(Goal other) {
		return toString().equals(other.toString());
	}
	
}
