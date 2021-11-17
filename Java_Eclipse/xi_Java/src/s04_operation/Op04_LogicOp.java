package s04_operation;

public class Op04_LogicOp {
	public static void main(String[] args) {

		boolean X, Y;

		/* 논리연산자 */
		System.out.println("논리연산자");
		System.out.println();

		X = false;
		Y = false;
		System.out.println(X + " && " + Y + " = " + (X && Y));
		System.out.println(X + " || " + Y + " = " + (X || Y));
		System.out.println(X + " ^ " + Y + " = " + (X ^ Y));
		System.out.println();

		X = false;
		Y = true;
		System.out.println(X + " && " + Y + " = " + (X && Y));
		System.out.println(X + " || " + Y + " = " + (X || Y));
		System.out.println(X + " ^ " + Y + " = " + (X ^ Y));
		System.out.println();

		X = true;
		Y = false;
		System.out.println(X + " && " + Y + " = " + (X && Y));
		System.out.println(X + " || " + Y + " = " + (X || Y));
		System.out.println(X + " ^ " + Y + " = " + (X ^ Y));
		System.out.println();

		X = true;
		Y = true;
		System.out.println(X + " && " + Y + " = " + (X && Y));
		System.out.println(X + " || " + Y + " = " + (X || Y));
		System.out.println(X + " ^ " + Y + " = " + (X ^ Y));
		System.out.println();

		X = true;
		Y = false;
		System.out.println("!" + X + " = " + !X);
		System.out.println("!" + Y + " = " + !Y);
		System.out.println();

		/* SCE : Short-Circuit Evaluation */
		System.out.println("SCE : Short-Circuit Evaluation");
		System.out.println();

		int num1 = 0, num2 = 0;
		boolean result = false;

		result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
		System.out.println("결과 : " + result);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println();

		result = ((num1 += 10) > 0) || ((num2 += 10) < 0);
		System.out.println("결과 : " + result);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println();

		System.out.println("SCE 문제점");
		System.out.println("&& 연산자 조건1 false면 조건2 명령문 실행 안함");
		System.out.println("|| 연산자 조건1 true 면 조건2 명령문 실행 안함");
		System.out.println();

		System.out.println("SCE 문제점 수정본");
		num1 = 0;
		num2 = 0; // 변수 초기화

		num1 += 10;
		num2 += 10;
		result = (num1 < 0) && (num2 > 0);
		System.out.println("결과 : " + result);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println();

		num1 += 10;
		num2 += 10;
		result = (num1 > 0) || (num2 < 0);
		System.out.println("결과 : " + result);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
}