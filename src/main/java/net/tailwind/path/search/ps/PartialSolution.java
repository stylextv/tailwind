package net.tailwind.path.search.ps;

import net.tailwind.path.search.node.Node;

public class PartialSolution {
	
	private float coefficient;
	
	private Node node;
	
	private double score;
	
	public PartialSolution(float coefficient) {
		this.coefficient = coefficient;
	}
	
	// TODO rename?
	public void updateNode() {
		
	}
	
	public float getCoefficient() {
		return coefficient;
	}
	
	public Node getNode() {
		return node;
	}
	
	public double getScore() {
		return score;
	}
	
}
