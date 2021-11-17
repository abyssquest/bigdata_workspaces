package s04_operation;

public class Op02_CompoundOp {
	public static void main(String[] args) {

		int num = 127;

		/* 복합대입 연산자 */
		System.out.println("산술연산 + 대입연산 => 복합대입");

		num += 50; // num = num + 50;
		System.out.println(num);

		num -= 50; // num = num - 50;
		System.out.println(num);

		num *= 50; // num = num * 50;
		System.out.println(num);

		num /= 50; // num = num / 50;
		System.out.println(num);

		num %= 50; // num = num % 50;
		System.out.println(num);
	}
}