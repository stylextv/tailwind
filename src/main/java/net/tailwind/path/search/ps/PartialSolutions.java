package net.tailwind.path.search.ps;

public class PartialSolutions {
	
	private static final float[] COEFFICIENTS = new float[] {
			1.5f, 2, 2.5f, 3, 4, 5, 10
	};
	
	private PartialSolution[] solutions = new PartialSolution[COEFFICIENTS.length];
	
	public PartialSolutions() {
		for(int i = 0; i < COEFFICIENTS.length; i++) {
			
			float coefficient = COEFFICIENTS[i];
			
			solutions[i] = new PartialSolution(coefficient);
		}
	}
	
	
	
	public PartialSolution[] getSolutions() {
		return solutions;
	}
	
}
