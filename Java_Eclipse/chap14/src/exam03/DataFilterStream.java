package exam03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataFilterStream {
	public static void main(String[] args) {
		try {
			OutputStream out = new FileOutputStream("data.bin");
			DataOutputStream filterOut = new DataOutputStream(out);
			// out.write(365);
			// int형 4바이트 공간에 3바이트는 0으로 버리는 공간 1바이트는 데이터저장
			// 1바이트씩 동작하며 저장하는 메서드 설정이 필요함
			
			filterOut.writeInt(365);
			filterOut.writeDouble(3.14);
			filterOut.close();
			
			InputStream in = new FileInputStream("data.bin");
			DataInputStream filterIn = new DataInputStream(in);


			System.out.println(filterIn.readInt());
			System.out.println(filterIn.readDouble());
			filterIn.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
