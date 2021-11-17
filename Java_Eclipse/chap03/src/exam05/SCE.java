package exam05;

public class SCE { // Short-Circuit Evaluation 단축평가값
	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0;
		boolean result = false;
		
		result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
		System.out.println("결과 : " + result);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		/* */
		
		result = ((num1 += 10) > 0) || ((num2 += 10) < 0);
		System.out.println("결과 : " + result);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
	}
}