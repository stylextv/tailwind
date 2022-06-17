package net.tailwind.chat.command;

import net.tailwind.chat.command.argument.ArgumentType;

public abstract class CommandPreset {
	
	private ArgumentType<?>[] argumentTypes;
	
	public CommandPreset(ArgumentType<?>... argumentTypes) {
		this.argumentTypes = argumentTypes;
	}
	
	// TODO remove?
	public abstract boolean onExecute();
	
	// TODO rename?
	public boolean matchesArguments() {
		
	}
	
	public ArgumentType<?>[] getArgumentTypes() {
		return argumentTypes;
	}
	
}
