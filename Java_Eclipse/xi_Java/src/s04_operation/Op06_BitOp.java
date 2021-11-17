package s04_operation;

public class Op06_BitOp { // 비트 연산자, 비트시프트 연산자
	public static void main(String[] args) {

		/* 비트 연산자 : 비트단위로 연산 */
		System.out.println("비트 연산자");

		byte num1 = 5; // 0000 0101
		byte num2 = 3; // 0000 0011

		System.out.println(num1 & num2); // 비트단위 AND : 0000 0001 = 1
		System.out.println(num1 | num2); // 비트단위 OR : 0000 0111 = 7
		System.out.println();

		// 비트단위 XOR = 같은 신호 : 0 다른 신호 : 1
		System.out.println(num1 ^ num2); // 0000 0110 = 6
		System.out.println();

		// 비트신호 반전
		System.out.println(~num1); // 1111 1010 = -6
		System.out.println(~num2); // 1111 1100 = -4
		System.out.println();

		/* 비트시프트 연산자 : 비트 신호를 일정 간격 이동 */
		System.out.println("비트시프트 연산자");

		int num = 2;
		System.out.println(num << 1); // 비트신호 왼쪽 1칸씩 이동 = * 2의 1승
		System.out.println(num << 2); // 비트신호 왼쪽 2칸씩 이동 = * 2의 2승
		System.out.println(num << 3); // 비트신호 왼쪽 3칸씩 이동 = * 2의 3승
		System.out.println();

		num = 8;
		System.out.println(num >> 1); // 비트신호 오른쪽 1칸씩 이동 = / 2의 1승
		System.out.println(num >> 2); // 비트신호 오른쪽 1칸씩 이동 = / 2의 1승
		System.out.println(num >> 3); // 비트신호 오른쪽 1칸씩 이동 = / 2의 1승
		System.out.println();

		/* 2의 보수법
		~ (비트연산자) : 0 -> 1 / 1 -> 0

		~a		= a의 1의 보수
		~a + 1	= a의 2의 보수

		a + ~a		: 메모리상 모든 수가 1
		a + ~a + 1	: 메모리상 모든 수가 0	= 0

		a가 양수일 때 : a의 음의 정수 = ~a + 1
		a가 음수일 때 : a의 양의 정수 = ~a + 1
		*/

		System.out.println(-8 >> 1);

		/*
		1.	0000 1000	= 8				= 8
			1111 0111	= 8의 1의 보수	= ~8
			1111 1000	= 8의 2의 보수	= ~8 +1		= -8의 2진수 표현
		
		2.	메모리 오른쪽 한칸 이동 + 음수는 맨앞을 1로 채움
			1111 1000 -> 1111 1100
		
		3.	1111 1100	= a
			0000 0011	= a의 1의 보수	= ~a
			0000 0100	= a의 2의 보수	= ~a +1		= 10진수 4
		
		4.	1111 1100 은 10진수 -4
		*/
	}
}