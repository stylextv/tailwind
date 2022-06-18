package net.tailwind.chat.command.argument;

import net.tailwind.chat.command.argument.types.IntegerArgumentType;
import net.tailwind.chat.command.argument.types.StringArgumentType;
import net.tailwind.chat.message.MessageReader;

public abstract class ArgumentType<T> {
	
	public static final StringArgumentType STRING = new StringArgumentType();
	public static final IntegerArgumentType INTEGER = new IntegerArgumentType();
	
	public abstract T parseMessage(MessageReader reader);
	
}
