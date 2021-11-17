package exam01;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class SocketClient {
	public static void main(String[] args) {
		Socket socket = null;
		String name = "홍길동";
		
		try {
			socket = new Socket("localhost", 5001);
			// 참조변수 : 서버(localhost의 5001번 port를 점유한 프로그램)에게 신호 전달하는 변수
			
			ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
			// 오브젝트 단위 통로 + 네트워크 통로 만들기
			
			out.writeUTF(name); // 성능개선을 위해 버퍼 있음
			out.flush(); // 버퍼가 다 차지 않더라도 메세지를 바로 전달
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 클라이언트에서 소켓(고유번호 = IP)에 내용을 담아 서버에 전달
		// localhost = 내 ip의 주소로 되어있는 서버에 신호 요청해라
		
	}
}