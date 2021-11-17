package exam08;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class StringWriter {
	public static void main(String[] args) {
		
		try {
//			Writer out = new FileWriter("String.txt");
//			BufferedWriter bufferOut = new BufferedWriter(out);
			
			BufferedWriter bufferOut = new BufferedWriter(new FileWriter("String.txt"));
			
			bufferOut.write("더조은IT아카데미학원");
			bufferOut.newLine();
			bufferOut.write("서울시 종로구");
			bufferOut.newLine();
			bufferOut.write("데이터 입력 완료");
			bufferOut.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
