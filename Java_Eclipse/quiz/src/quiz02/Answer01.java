package quiz02;

public class Answer01 {
	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0;
		boolean result = false;
		
		/* Short Circuit Evolution 으로 인해 발생되는 문제점
		
		result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
		System.out.println("결과 : " + result);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		result = ((num1 += 10) > 0) || ((num2 += 10) < 0);
		System.out.println("결과 : " + result);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		*/
		
		// 문제점 수정본
		num1 += 10; num2 += 10;
		result = (num1 < 0) && (num2 > 0);
		System.out.println("결과 : " + result);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		num1 += 10; num2 += 10;
		result = (num1 > 0) || (num2 < 0);
		System.out.println("결과 : " + result);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
	}
}