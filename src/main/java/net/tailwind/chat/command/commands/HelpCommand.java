package net.tailwind.chat.command.commands;

import net.tailwind.chat.command.Command;
import net.tailwind.chat.command.CommandPreset;
import net.tailwind.chat.command.argument.ArgumentType;

public class HelpCommand extends Command {
	
	private static final CommandPreset DEFAULT_PRESET = new CommandPreset(ArgumentType.INTEGER);
	
	private static final CommandPreset[] PRESETS = new CommandPreset[] {
			DEFAULT_PRESET
	};
	
	public HelpCommand() {
		super(PRESETS);
	}
	
}
