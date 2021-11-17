package exam07;

public class CastingOperation {

	public static void main(String[] args) {
		char alphabet = 'A';
		int unicode;
		long num1 = 1000000000000L;
		float num2;
		
		unicode = (int)alphabet;  // 자동형변환
		System.out.println(alphabet);
		System.out.println(unicode);
		
		num2 = num1;  // 자동형변환
		System.out.println(num2);  // 1.0E12 (1.0*10^12)
		
		// num1 = num2;  // error
		
		int score = (int)23.5;  // 강제형변환
		
		System.out.println(score);
		
		int score2;
		double score3;
		
		score3 = 23.5;
		
		score2 = (int)score3;
		
		System.out.println(score2);
		System.out.println(score3);
		
		// double result = 0.5 + 10;
		float result = (float)(0.5 + 10);
		System.out.println(result);
		
	}

}
