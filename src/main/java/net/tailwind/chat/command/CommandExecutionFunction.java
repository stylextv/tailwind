package net.tailwind.chat.command;

@FunctionalInterface
public interface CommandExecutionFunction {
	
	void execute(Object argument1, Object argument2);
	
}
