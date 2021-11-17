package exam08;

public class BitOp { // 비트연산자
	public static void main(String[] args) {
		
		byte num1 = 5, num2 = 3;
		System.out.println(num1 & num2); // 비트 AND
		System.out.println(num1 | num2); // 비트 OR
		System.out.println(num1 ^ num2);
		// 비트 XOR = 같은 신호 : 0 다른 신호 : 1
				
		System.out.println(~num1); // 비트신호반전
		System.out.println(~num2);
		
	}
}