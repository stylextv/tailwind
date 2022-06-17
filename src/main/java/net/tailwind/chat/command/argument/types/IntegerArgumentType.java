package net.tailwind.chat.command.argument.types;

import net.tailwind.chat.command.argument.ArgumentType;

public class IntegerArgumentType extends ArgumentType<Integer> {
	
	@Override
	public Integer parseValue(String value) {
		return Integer.parseInt(value);
	}
	
}
