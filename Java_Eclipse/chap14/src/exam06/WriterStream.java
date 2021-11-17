package exam06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterStream {
	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 'B';
		try {
			
			Writer out = new FileWriter("hyper.txt"); // 문자, 문자열 단위 데이터 처리 Writer
			out.write(ch1);
			out.write(ch2);
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
