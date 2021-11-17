package exam02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferFileCopy {
	public static void main(String[] args) {

		try {
			byte[] buf = new byte[1024];
			int readLen = 0;
			int copyByte = 0;
			
			InputStream in = new FileInputStream("eclipse-cpp-2021-06-R-win32-x86_64.zip");
			OutputStream out = new FileOutputStream("Copy_eclipse_cpp.zip");
			
			while(true) {
				readLen = in.read(buf);
				
				if(readLen == -1) { break; }
				
				out.write(buf, 0, readLen); // buf 에서 0인덱스부터 readLen인덱스까지 읽어와 작동해라
				
				copyByte += readLen;
			}
			
			in.close();
			out.close();
			
			System.out.println("복사된 바이트 크기 : " + copyByte);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
