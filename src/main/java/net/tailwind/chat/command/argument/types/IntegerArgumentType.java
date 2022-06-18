package net.tailwind.chat.command.argument.types;

import net.tailwind.chat.command.argument.ArgumentType;
import net.tailwind.chat.message.MessageReader;

public class IntegerArgumentType extends ArgumentType<Integer> {
	
	@Override
	public Integer parseMessage(MessageReader reader) {
		String s = reader.readString();
		
		return Integer.parseInt(s);
	}
	
}
