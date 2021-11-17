package exam04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteBufferedFileCopy {

	public static void main(String[] args) {

		try {
			InputStream in = new FileInputStream("eclipse-cpp-2021-06-R-win32-x86_64.zip");
			BufferedInputStream bufferIn = new BufferedInputStream(in); 
			
			OutputStream out = new FileOutputStream("Copy_BufferStream.zip");
			BufferedOutputStream bufferOut = new BufferedOutputStream(out);
			
			while(true) {
				int bData = bufferIn.read();
				if(bData == -1) { break; }
				
				bufferOut.write(bData);
				
			}
			
			bufferIn.close();
			bufferOut.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("복사 끝");

	}

}
