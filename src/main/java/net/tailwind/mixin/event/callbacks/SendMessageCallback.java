package net.tailwind.mixin.event.callbacks;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

public interface SendMessageCallback {
	
	public enum Type {
		
		MESSAGE, COMMAND;
		
	}
	
	Event<SendMessageCallback> EVENT = EventFactory.createArrayBacked(SendMessageCallback.class, (listeners) -> (type, message, preview) -> {
		for(SendMessageCallback listener : listeners) {
			ActionResult result = listener.onMessageSent(type, message, preview);
			
			if(result != ActionResult.PASS) return result;
		}
		
		return ActionResult.PASS;
	});
	
	ActionResult onMessageSent(Type type, String message, Text preview);
	
}
