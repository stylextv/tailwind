package net.tailwind.chat.command.argument;

import net.tailwind.chat.command.argument.types.IntegerArgumentType;
import net.tailwind.chat.command.argument.types.StringArgumentType;

public abstract class ArgumentType<T> {
	
	public static final StringArgumentType STRING = new StringArgumentType();
	public static final IntegerArgumentType INTEGER = new IntegerArgumentType();
	
	public abstract T parseValue(String value);
	
	public boolean matchesValue(String value) {
		try {
			
			parseValue(value);
			
			return true;
			
		} catch(Exception ex) {}
		
		return false;
	}
	
}
