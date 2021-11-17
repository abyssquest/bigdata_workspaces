package exam19;

import java.util.StringTokenizer;

public class TokenizerString02 {

	public static void main(String[] args) {
		
		String phoneNum = "TEL 82-02-2578-5876";
		
		System.out.println("First Result ===");
		StringTokenizer st1 = new StringTokenizer(phoneNum); // (default 여백만) 식별자로 구분
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		System.out.println("Second Result ===");
		StringTokenizer st2 = new StringTokenizer(phoneNum, " -"); // (여백 & -) 식별자로 구분
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		

		System.out.println("Third Result ===");
		StringTokenizer st3 = new StringTokenizer(phoneNum, " -", true); // (여백 & -) 식별자로 구분, 식별자 출력 여부
		
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
	}
}