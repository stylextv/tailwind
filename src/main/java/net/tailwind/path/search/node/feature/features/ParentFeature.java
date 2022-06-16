package net.tailwind.path.search.node.feature.features;

import net.tailwind.path.search.node.Node;
import net.tailwind.path.search.node.feature.NodeFeature;

public class ParentFeature extends NodeFeature<Node> {
	
	public ParentFeature() {
		super(false);
	}
	
	@Override
	public long hashValue(Node parent) {
		return parent.getHash();
	}
	
}
