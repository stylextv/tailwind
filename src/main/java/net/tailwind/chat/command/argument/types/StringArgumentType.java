package net.tailwind.chat.command.argument.types;

import net.tailwind.chat.command.argument.ArgumentType;

public class StringArgumentType extends ArgumentType<String> {
	
	@Override
	public String parseValue(String value) {
		return value;
	}
	
	@Override
	public boolean matchesValue(String value) {
		return true;
	}
	
}
