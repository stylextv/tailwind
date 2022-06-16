package net.tailwind.routine;

import java.util.ArrayList;

public class Routine implements Runnable {
	
	private ArrayList<Runnable> children = new ArrayList<>();
	
	public Routine(Runnable... children) {
		for(Runnable r : children) {
			
			addChild(r);
		}
	}
	
	public void addChild(Runnable r) {
		children.add(r);
	}
	
	@Override
	public void run() {
		children.forEach((r) -> r.run());
	}
	
}
