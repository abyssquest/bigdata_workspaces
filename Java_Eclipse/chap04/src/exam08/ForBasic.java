package exam08;

public class ForBasic {
	public static void main(String[] args) {
		
		// 1~100의 합은?
		
		int result = 0;
		// 초기화
		// double num = 0.0;
		// char alphabet = ' ';
		// String name = "";
		// boolean isBool = false;
		
		for (int num = 1; num <= 100; num++) {
			System.out.println("카운팅 값 : " + num);
			result += num;
			System.out.println("누적 값 : " + result);
		}
		
	}
	
}