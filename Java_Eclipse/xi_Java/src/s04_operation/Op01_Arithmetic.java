package s04_operation;

public class Op01_Arithmetic {
	public static void main(String[] args) {

		int num1 = 20, num2 = 8;
		int resultInt;
		
		// 산술 연산자
		resultInt = num1 + num2; // + 연산자
		System.out.println(num1 + " + " + num2 + " = " + resultInt);
		
		resultInt = num1 - num2; // - 연산자
		System.out.println(num1 + " - " + num2 + " = " + resultInt);
		
		resultInt = num1 * num2; // * 연산자
		System.out.println(num1 + " * " + num2 + " = " + resultInt);
		
		resultInt = num1 / num2; // / 연산자
		System.out.println(num1 + " / " + num2 + " = " + resultInt);
		
		resultInt = num1 % num2; // % 연산자 (나머지)
		System.out.println(num1 + " % " + num2 + " = " + resultInt);
		
		double num3 = 7.8, num4 = 3.2;
		double resultDouble;
		
		resultDouble = num3 + num4; // + 연산자
		System.out.println(num3 + " + " + num4 + " = " + resultDouble);
		
		resultDouble = num3 - num4; // - 연산자
		System.out.println(num3 + " - " + num4 + " = " + resultDouble);
		
		resultDouble = num3 * num4; // * 연산자
		System.out.println(num3 + " * " + num4 + " = " + resultDouble);
		
		resultDouble = num3 / num4; // / 연산자
		System.out.println(num3 + " / " + num4 + " = " + resultDouble);
		
		resultDouble = num3 % num4; // % 연산자 - 실수형에서는 나머지 연산은 의미 없다
		System.out.println(num3 + " % " + num4 + " = " + resultDouble);
		
	}
}