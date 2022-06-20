package net.tailwind.path.search.node;

import net.minecraft.util.math.BlockPos;
import net.tailwind.path.search.goal.Goal;
import net.tailwind.path.search.node.feature.NodeFeature;

public class Node {
	
	private NodeData data = new NodeData();
	
	public Node(BlockPos pos, Goal goal) {
		setPosition(pos);
		updateGoalCost(goal);
	}
	
	private boolean updateParent(Node parent) {
		
	}
	
	private void updateCost() {
		double cost = getPathCost() + getGoalCost();
		
		setCost(cost);
	}
	
	private void updatePathCost(Node parent) {
		double cost = parent.getPathCost() + ;
		
		setPathCost(cost);
		updateCost();
	}
	
	private void updateGoalCost(Goal goal) {
		double cost = goal.;
		
		setGoalCost(cost);
		updateCost();
	}
	
	public BlockPos getPosition() {
		return data.getValue(NodeFeature.POSITION);
	}
	
	private void setPosition(BlockPos pos) {
		data.setValue(NodeFeature.POSITION, pos);
	}
	
	public boolean hasParent() {
		return data.hasFeature(NodeFeature.PARENT);
	}
	
	public Node getParent() {
		return data.getValue(NodeFeature.PARENT);
	}
	
	private void setParent(Node parent) {
		data.setValue(NodeFeature.PARENT, parent);
	}
	
	public double getCost() {
		return data.getValue(NodeFeature.COST);
	}
	
	private void setCost(double cost) {
		data.setValue(NodeFeature.COST, cost);
	}
	
	public double getPathCost() {
		return data.getValue(NodeFeature.PATH_COST);
	}
	
	private void setPathCost(double cost) {
		data.setValue(NodeFeature.PATH_COST, cost);
	}
	
	public double getGoalCost() {
		return data.getValue(NodeFeature.GOAL_COST);
	}
	
	private void setGoalCost(double cost) {
		data.setValue(NodeFeature.GOAL_COST, cost);
	}
	
	public long getHash() {
		return data.getHash();
	}
	
	public NodeData getData() {
		return data;
	}
	
}
