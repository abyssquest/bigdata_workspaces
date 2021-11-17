package exam14;

import java.io.File;

public class RelativePath {
	public static void main(String[] args) {
		// 절대 path(경로)
		File myFile = new File("c:" + File.separator + "MyJava" + File.separator + "my.bin");
		
		// 상대 path(경로)
		// File myFile = new File("tmp" + File.separator + "my.bin");
		// chap14의 소스이므로 chap14\tmp\my.bin
		
		if (myFile.exists() == false) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		
		System.out.println("파일 존재.");
		
		File reDir = new File("c:" + File.separator + "YourJava" + File.separator + "Java");
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