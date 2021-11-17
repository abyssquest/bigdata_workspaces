package exam10;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterClass {
	public static void main(String[] args) {
		try {
			// static PrintStream out; // System.out.
			PrintWriter out = new PrintWriter(new FileWriter("printf.txt"));
			
			out.printf("제 이름은 %s입니다", "홍길동");
			out.println();
			out.print("우리는 자바 입출력을 배우고 있어요.");
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
