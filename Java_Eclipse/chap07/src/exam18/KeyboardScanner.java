package exam18;

import java.util.Scanner;

public class KeyboardScanner {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("덧셈 연산 수행 프로그램.");
		
		System.out.println("첫번째 정수값 입력 : ");
		int num1 = keyboard.nextInt();
		
		System.out.println("두번째 정수값 입력 : ");
		int num2 = keyboard.nextInt();
		
		int result = num1 + num2;
		
		System.out.printf("%d + %d = %d \n", num1, num2, result);
		
		System.out.println("뺄셈 실수 연산 프로그램.");
		
		System.out.println("첫번째 실수값 입력 :");
		double num3 = keyboard.nextDouble();
		
		System.out.println("두번째 실수값 입력 :");
		double num4 = keyboard.nextDouble();
		
		double result2 = num3 - num4;
		System.out.printf("%.2f - %.2f = %.2f \n", num3, num4, result2);
		
		keyboard.nextLine(); // 앞의 엔터값을 버리는 dummy code
		
		System.out.println("당신의 이름은?");
		String name = keyboard.nextLine();
		
		System.out.printf("당신의 이름은 %s이군요.", name);
	}
}