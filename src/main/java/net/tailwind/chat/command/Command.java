package net.tailwind.chat.command;

import net.tailwind.chat.command.commands.HelpCommand;
import net.tailwind.chat.message.MessageReader;

public class Command {
	
	public static final Command HELP = new HelpCommand();
	
	private static final Command[] COMMANDS = new Command[] {
			HELP
	};
	
	private CommandPreset[] presets;
	
	public Command(CommandPreset[] presets) {
		this.presets = presets;
	}
	
	public void parseMessage(MessageReader reader) {
		for(CommandPreset preset : presets) {
			
			// TODO reader -> skip to the start
			
			try {
				
				preset.parseMessage(reader);
				
				return;
				
			} catch(Exception ex) {}
		}
	}
	
	public static Command[] getCommands() {
		return COMMANDS;
	}
	
	public CommandPreset[] getPresets() {
		return presets;
	}
	
}
