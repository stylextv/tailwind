package net.tailwind.path.search;

import net.minecraft.util.math.BlockPos;
import net.tailwind.path.Path;
import net.tailwind.path.search.node.NodeData;

public class PathSearch {
	
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
	
}
