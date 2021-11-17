package exam02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChatting {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(9001);
			
			while(true) {
				Socket socket = serverSocket.accept();
				Thread person = new PerClientThread(socket);
				person.start();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}