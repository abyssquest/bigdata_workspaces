package exam02;

public class CompoundOp { // 복합대입연산자
	public static void main(String[] args) {
		
		int num = 125;
		
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