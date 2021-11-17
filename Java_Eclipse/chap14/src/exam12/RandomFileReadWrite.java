package exam12;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomFileReadWrite {
	public static void main(String[] args) {
		try {
			RandomAccessFile raf = new RandomAccessFile("data.bin", "rw"); // r - read w-write 가능하다 표시
			
			System.out.println("Write....................>>");
			System.out.printf("현재 입출력 위치 : %d바이트\n", raf.getFilePointer());
			
			raf.writeInt(200);
			System.out.printf("현재 입출력 위치 : %d바이트\n", raf.getFilePointer());
			raf.writeInt(500);
			System.out.printf("현재 입출력 위치 : %d바이트\n", raf.getFilePointer());
			
			raf.writeDouble(3.14);
			System.out.printf("현재 입출력 위치 : %d바이트\n", raf.getFilePointer());
			
			raf.seek(0);
			System.out.printf("현재 입출력 위치 : %d바이트\n", raf.getFilePointer());
			
			System.out.println(raf.readInt());
			System.out.println(raf.readInt());
			System.out.println(raf.readDouble());
			
			raf.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}
