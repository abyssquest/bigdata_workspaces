package exam07;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderStream {
	public static void main(String[] args) {
		char[] cbuf = new char[10];
		
		try {
			Reader in = new FileReader("hyper.txt");
			int readCnt = in.read(cbuf, 0, cbuf.length);
			
			for(int i = 0; i < readCnt; i++) {
				System.out.println(cbuf[i]);
			}
			
			in.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
