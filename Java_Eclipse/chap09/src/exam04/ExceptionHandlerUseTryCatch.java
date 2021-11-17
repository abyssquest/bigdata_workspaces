package exam04;

import java.util.Scanner;

public class ExceptionHandlerUseTryCatch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		
		for (int i = 0; i < 3; i ++) {
			try {
				System.out.println("나누어지는 수(정수) 입력.");
				int num1 = input.nextInt();
				
				System.out.println("나누는 수(정수) 입력.");
				int num2 = input.nextInt();
				
				System.out.println("연산 결과를 저장할 배열의 인덱스 입력:");
				int index = input.nextInt();
				
				arr[i] = num1 / num2;
			}catch(ArithmeticException e) {
				System.out.println("나눗셈 불가능.");
				i--;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 값을 확인하세요.");
				System.out.println(e.getMessage());
				i--;
			}
		}
		
		for (int e : arr) {
			System.out.println(e);
		}
	}
}
