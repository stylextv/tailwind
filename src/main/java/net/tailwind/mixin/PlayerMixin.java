package net.tailwind.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.tailwind.mixin.event.callbacks.SendMessageCallback;

@Mixin(ClientPlayerEntity.class)
public class PlayerMixin {
	
	@Inject(method = "sendChatMessage(Ljava/lang/String;Lnet/minecraft/text/Text;)V", at = @At("HEAD"), cancellable = true)
	private void sendChatMessage(String message, Text preview, CallbackInfo info) {
		SendMessageCallback invoker = SendMessageCallback.EVENT.invoker();
		
		ActionResult result = invoker.onMessageSent(SendMessageCallback.Type.MESSAGE, message, preview);
		
		if(result != ActionResult.PASS) info.cancel();
	}
	
	@Inject(method = "sendCommand(Ljava/lang/String;Lnet/minecraft/text/Text;)V", at = @At("HEAD"), cancellable = true)
	private void sendCommand(String message, Text preview, CallbackInfo info) {
		SendMessageCallback invoker = SendMessageCallback.EVENT.invoker();
		
		ActionResult result = invoker.onMessageSent(SendMessageCallback.Type.COMMAND, message, preview);
		
		if(result != ActionResult.PASS) info.cancel();
	}
	
}
