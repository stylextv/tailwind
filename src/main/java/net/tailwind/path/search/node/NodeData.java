package net.tailwind.path.search.node;

import java.util.HashMap;

import net.tailwind.path.search.node.feature.NodeFeature;

public class NodeData {
	
	private HashMap<NodeFeature<?>, Object> values = new HashMap<>();
	
	private long hash;
	
	private boolean hashed;
	
	public boolean hasFeature(NodeFeature<?> feature) {
		return values.containsKey(feature);
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getValue(NodeFeature<T> feature) {
		return (T) values.get(feature);
	}
	
	public <T> void setValue(NodeFeature<T> feature, T value) {
		values.put(feature, value);
	}
	
	private void hashValues() {
		long hash = 0;
		
		for(NodeFeature<?> feature : values.keySet()) {
			
			if(!feature.isPersistant()) continue;
			
			Object value = getValue(feature);
			
			hash ^= feature.hashValue(value);
		}
		
		return hash;
	}
	
	public HashMap<NodeFeature<?>, ?> getValues() {
		return values;
	}
	
	public long getHash() {
		if(!hashed) hashValues();
		
		return hash;
	}
	
	public boolean isHashed() {
		return hashed;
	}
	
}
