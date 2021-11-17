package exam11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamSer {
	public static void main(String[] args) {
		
		// 인스턴스 복원
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Object.ser"));
		
			Circle circle1 = (Circle)in.readObject();
			Circle circle2 = (Circle)in.readObject();
			String message = (String)in.readObject();
			in.close();
			
			// 정보 출력
			circle1.showCircleInfo();
			circle2.showCircleInfo();
			System.out.println(message);
			
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}
