package s04_operation;

public class Op03_ComparionOp {
	public static void main(String[] args) {

		int num1 = 350, num2 = 200;

		// 비교연산자 - 값을 boolean형으로 출력
		System.out.println("비교 연산 : Return boolean Type");
		System.out.println(num1 + " < " + num2 + " : Retrun " + (num1 < num2));
		System.out.println(num1 + " > " + num2 + " : Retrun " + (num1 > num2));
		System.out.println(num1 + " <= " + num2 + " : Retrun " + (num1 <= num2));
		System.out.println(num1 + " >= " + num2 + " : Retrun " + (num1 >= num2));
		System.out.println(num1 + " == " + num2 + " : Retrun " + (num1 = num2));
		System.out.println(num1 + " != " + num2 + " : Retrun " + (num1 != num2));

		System.out.println();

		boolean bool = (num1 != num2);
		// 비교연산자가 대입연산자보다 우선
		// 비교연산자 : boolean형 데이터 결과값 -> 변수 bool에 대입
		// 괄호 필요없으나 가시성을 위해서 넣어줌
		
		System.out.println(bool); // 데이터 출력
	}
}