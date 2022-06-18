package net.tailwind.chat.message;

public class MessageReader {
	
	private String message;
	
	private int pointer;
	
	public MessageReader(String message) {
		this.message = message;
	}
	
	public String readString() {
		// TODO read all characters up until the next whitespace
	}
	
	public char next() {
		char character = peek();
		
		skip();
		
		return character;
	}
	
	public char peek() {
		return message.charAt(pointer);
	}
	
	public void skip() {
		pointer++;
	}
	
	public String getMessage() {
		return message;
	}
	
	public int getPointer() {
		return pointer;
	}
	
	public void setPointer(int pointer) {
		this.pointer = pointer;
	}
	
}
