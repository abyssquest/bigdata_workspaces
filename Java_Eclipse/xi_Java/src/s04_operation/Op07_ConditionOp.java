package s04_operation;

public class Op07_ConditionOp { // 삼항연산자
	public static void main(String[] args) {

		int num1 = 50, num2 = 100;
		int big = 0, diff = 0;

		/* 삼항 연산자 */
		System.out.println("삼항 연산자");

		// 조건식 ? 조건 true 명령문 : 조건false 명령문;
		big = (num1 > num2) ? num1 : num2;
		diff = (num1 > num2) ? num1 - num2 : num2 - num1;
		System.out.println("큰 값 : " + big + ", 두 값의 차 :" + diff);
		System.out.println();

		// 위 삼항연산자와 같은 효과를 내기 위해 if + else 응용
		if (num1 > num2) {
			System.out.println(num1 + "이 " + num2 + "보다 크다.");
			big = num1;
			diff = num1 - num2;
		} else {
			System.out.println(num1 + "이 " + num2 + "보다 작다.");
			big = num2;
			diff = num2 - num1;
		}
		System.out.println("큰 값 : " + big + ", 두 값의 차 :" + diff);
	}
}