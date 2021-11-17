package exam13;

import java.io.File;

public class FileMov {
	public static void main(String[] args) {
		File myFile = new File("c:\\MyJava\\my.bin");
		
		if (myFile.exists() == false) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		
		System.out.println("파일 존재.");
		
		File reDir = new File("c:\\YourJava\\Java");
		reDir.mkdirs(); // 디렉토리 생성
		
//		File reFile = new File(reDir, "move.bin");
//		myFile.renameTo(reFile); // 파일 이동 + 이름 변경 기능.
		
		File reFile2 = new File(reDir, "my.bin");
		myFile.renameTo(reFile2); // 파일 이동 + 이름 변경 기능.
		
		if (reFile2.exists() == true) {
			System.out.println("파일 이동 성공.");
		} else {
			System.out.println("파일 이동 실패.");
		}
		
		System.out.println("프로그램 종료.");
		
	}
}
