package net.tailwind.path.search;

import net.minecraft.util.math.BlockPos;
import net.tailwind.path.Path;
import net.tailwind.path.search.node.NodeData;
import net.tailwind.path.search.ps.PartialSolutions;

public class PathSearch {
	
	private PartialSolutions solutions = new PartialSolutions();
	
	public Path search(BlockPos start) {
		Path path = new Path();
		
		return search(start, path);
	}
	
	public Path search(BlockPos start, Path path) {
		NodeData data = NodeData.;
		
		return search(data, path);
	}
	
	public Path search(NodeData start, Path path) {
		
	}
	
	public PartialSolutions getSolutions() {
		return solutions;
	}
	
}
