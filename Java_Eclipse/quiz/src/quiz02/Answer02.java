package quiz02;

public class Answer02 {
	public static void main(String[] args) {
		
		int num1 = 35, num2 = 28;
		int num3 = 0;
		
		num3 = ++num1 + num2--;
		
		System.out.println("num1 결과값 : " + num1); // 1. 36
		System.out.println("num2 결과값 : " + num2); // 3. 27
		System.out.println("num3 결과값 : " + num3); // 2. 64
		
	}
}