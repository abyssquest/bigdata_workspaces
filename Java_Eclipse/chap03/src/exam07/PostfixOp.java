package exam07;

public class PostfixOp {

	public static void main(String[] args) {
		
		int num1 = 7, num2 = 0, num3 = 0;
		
		num2 = num1++; // 후위증가연산자, num1 += 1;
		System.out.println(num1); // 8
		System.out.println(num2); // 7
		System.out.println("");
		
		num2 = num1++ + 10;
		System.out.println(num1); // 9
		System.out.println(num2); // 18
		System.out.println("");
		
		num3 = num1--; // 후위감소연산자, num1 -= 1;
		System.out.println(num1); // 8
		System.out.println(num3); // 9
		System.out.println("");
		
		num3 = num1-- +10;
		System.out.println(num1); // 7
		System.out.println(num3); // 18
		System.out.println("");
		
	}
}