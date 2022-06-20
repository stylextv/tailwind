package net.tailwind.path;

import net.tailwind.path.search.node.Node;

public class Path {
	
	
	
	public static Path fromNode(Node node) {
		Path path = new Path();
		
		while(node != null) {
			
			// add node to path
			
			node = node.getParent();
		}
		
		return path;
	}
	
}
