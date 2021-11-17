package exam02;

public class UseVariableNotation {

	public static void main(String[] args) {
		
		byte num1;                   // 변수 선언 (1byte 메모리 할당 요청)
		int num2;                    // 4byte 메모리 할당 요청
		int num3;
		long result;                 // int result;
		
		// num1 = 300;               // error 범위 초과

		num1 = 55;                   //변수 초기화
		num2 = 2147483647;           // int형 변수 최대값
		num3 = 5;
		
		System.out.println(num1);
		
		result = num2 + num3;
		System.out.println(result);  // 오류값
		
		num2 = 0x15;                 // 16진수 표기법
		System.out.println(num2);    // 21 (10진수) = 16 * 1 + 5
		
		num3 = 010;                  // 8진수 표기법
		System.out.println(num3);    // 8 (10진수) = 8 * 1 + 5
	}
}