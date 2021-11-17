package exam04;

public class LogicOp2 { // 논리연산자 2
	public static void main(String[] args) {
		
		int num1 = 10, num2 = 20;
		boolean result;
		
		result = (num1 == 10) && (num2 == 30);
		System.out.println(result);
		
		result = (num1 >= 10) || (num2 <= 30);
		System.out.println(result);
		
	}
}