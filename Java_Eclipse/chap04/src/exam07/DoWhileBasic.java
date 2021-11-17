package exam07;

public class DoWhileBasic {
	public static void main(String[] args) {
		
		// 1 ~ 100의 합은?
		int num = 1, result = 0;
		
		do {
			System.out.println("카운팅 값 : " + num);
			result += num;
			num++;
			System.out.println("누적 값 : " + result);
		} while (num <= 100);
		
		System.out.println("1~100까지의 합 : " + result);
	}
}