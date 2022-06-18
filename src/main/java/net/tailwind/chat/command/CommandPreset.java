package net.tailwind.chat.command;

import net.tailwind.chat.command.argument.ArgumentType;
import net.tailwind.chat.message.MessageReader;

public class CommandPreset {
	
	private ArgumentType<?>[] argumentTypes;
	
	private CommandExecutionFunction executionFunction;
	
	public CommandPreset(ArgumentType<?>... argumentTypes) {
		this.argumentTypes = argumentTypes;
		
		this.executionFunction = (name, pos, pos2) -> {};
	}
	
	public void execute() {
		
	}
	
	public void parseMessage(MessageReader reader) {
		for(ArgumentType<?> type : argumentTypes) {
			
			type.parseMessage(reader);
		}
		
		
	}
	
	public ArgumentType<?>[] getArgumentTypes() {
		return argumentTypes;
	}
	
}
