package s04_operation;

public class Op05_PrePostfixOp {
	public static void main(String[] args) {

		int num1, num2, num3;

		num1 = 7;
		num2 = 0;
		num3 = 0;

		/* 전위 증가 연산자 */
		num2 = ++num1; // num1 += 1;
		System.out.println(num1); // 8
		System.out.println(num2); // 8
		System.out.println();

		num2 = ++num1 + 10;
		System.out.println(num1); // 9
		System.out.println(num2); // 19
		System.out.println();

		/* 전위 감소 연산자 */
		num3 = --num1; // num1 -= 1;
		System.out.println(num1); // 8
		System.out.println(num3); // 8
		System.out.println();

		num3 = --num1 + 10;
		System.out.println(num1); // 7
		System.out.println(num3); // 17
		System.out.println();

		num1 = 7;
		num2 = 0;
		num3 = 0;

		/* 후위 증가 연산자 */
		num2 = num1++; // num1 += 1;
		System.out.println(num1); // 8
		System.out.println(num2); // 7
		System.out.println();

		num2 = num1++ + 10;
		System.out.println(num1); // 9
		System.out.println(num2); // 18
		System.out.println();

		/* 후위 감소 연산자 */
		num3 = num1--; // num1 -= 1;
		System.out.println(num1); // 8
		System.out.println(num3); // 9
		System.out.println();

		num3 = num1-- + 10;
		System.out.println(num1); // 7
		System.out.println(num3); // 18

		/* 전위증감 연산자와 후위 증감 연산자의 차이

		전위 증가 연산자 메소드 () {
			temp = n;
			n = n + 1;
			return = n; // 새로 대입된 n값이 리턴
		}

		전위 감소 연산자 메소드 () {
			temp = n;
			n = n - 1;
			return = n; // 새로 대입된 n값이 리턴
		}

		후위 증가 연산자 메소드 () {
			temp = n;
			n = n + 1;
			return = temp; // 원래 가지고 있던 n값이 리턴
		}

		후위 감소 연산자 메소드 () {
			temp = n;
			n = n - 1;
			return = temp; // 원래 가지고 있던 n값이 리턴
		}
		*/
	}
}