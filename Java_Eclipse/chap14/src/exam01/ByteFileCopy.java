package exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class ByteFileCopy {
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("newFonts.zip");
			OutputStream out = new FileOutputStream("Fonts_Copy.zip");
			
			while (true) {
				int bData = in.read(); // 1바이트씩 읽어옴
				if(bData == -1) { break; }
				out.write(bData);
			}
			
			in.close();
			out.close();
			
			System.out.println("복사 끝...");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
