package exam02;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

class SenderThread extends Thread {
	Socket socket;
	String name;
	
	SenderThread(Socket socket, String name) {
		this.socket = socket;
		this.name = name;
	}

	@Override
	public void run() {
		Scanner input = new Scanner(System.in);
				
		try {
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			writer.println(name);
			writer.flush();
			
			while(true) {
				String msg = input.nextLine();
				
				writer.println(msg);
				writer.flush(); // 버퍼가 쌓이기 전에 실행
				
				if(msg.equals("exit")) {
					break;
				}
			}
		
		} catch (IOException e) {
			//e.printStackTrace();
		}
	}
}