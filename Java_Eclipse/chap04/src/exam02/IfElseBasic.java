package exam02;

public class IfElseBasic {
	public static void main(String[] args) {
		
		int num = 38;
		
		if (num % 2 == 0) {
			System.out.println(num + "값은 짝수입니다.");		
		}
		else {
			System.out.println(num + "값은 홀수입니다.");
		}
		
		System.out.println("프로그램 종료...");
	}
}