package net.tailwind.chat.command;

import net.tailwind.chat.command.commands.HelpCommand;

public class Command {
	
	public static final Command HELP = new HelpCommand();
	
	private static final Command[] COMMANDS = new Command[] {
			HELP
	};
	
	public Command() {
		
	}
	
	public static Command[] getCommands() {
		return COMMANDS;
	}
	
}
