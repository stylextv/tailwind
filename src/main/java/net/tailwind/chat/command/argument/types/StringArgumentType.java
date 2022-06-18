package net.tailwind.chat.command.argument.types;

import net.tailwind.chat.command.argument.ArgumentType;
import net.tailwind.chat.message.MessageReader;

public class StringArgumentType extends ArgumentType<String> {
	
	@Override
	public String parseMessage(MessageReader reader) {
		return reader.readString();
	}
	
}
