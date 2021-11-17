package exam02;

import java.io.IOException;
import java.net.Socket;

public class ClientChatting {
	public static void main(String[] args) {
		String name = "침펄조아";
		
		try {
			Socket socket = new Socket("localhost", 9001);
			
			Thread sender = new SenderThread(socket, name);
			Thread receiver = new ReceiverThread(socket);
			
			sender.start();
			receiver.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}