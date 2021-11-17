package exam01;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null; // 서버에서 소켓을 받으려는 통로 생성
		
		try {
			serverSocket = new ServerSocket(5001);
			// 각각의 IP를 다른 process로 관리해야함
			// 각각의 process를 port로 나눠서 저장해줌
			// 1000이하 port는 운영체제가 씀
			// 기왕이면 port번호는 2000 이상을 추천
			
			// 내 프로그램을 5001번 port로 관리해줘
			
			Socket socket = serverSocket.accept();
			// 클라이언트로 전달받은 소켓입력받고 소켓반환 - 대입연산
			
			ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
			// 소켓에서 데이터 꺼내오기 - 소켓에 통로 만들기
			
			String msg = in.readUTF(); // 받아올때 writeUTF - 읽을때 readUTF
			
			System.out.println("클라이언트가 보내온 메세지 : " + msg);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
