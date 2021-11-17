package quiz03;

public class Answer02 {
	public static void main(String[] args) {
		
		// 1 ~ 100 까지 2의 배수이면서 5의 배수인 숫자들의 합
		int num = 1, result = 0;
		
		// for
		for (int n = 1; n <= 100; n++) {
			if (n % 2 == 0 && n % 5 == 0) {
				System.out.println("2의 배수이면서 5의 배수 : " + n);
				result += n;
			}
		}
		System.out.println("결과값 : " + result);
		System.out.println("");
		
		// while
		num = 1; result = 0;
		
		while (num <= 100) {
			if (num % 2 == 0 && num % 5 == 0) {
				System.out.println("2의 배수이면서 5의 배수 : " + num);
				result += num;
			}
			num++;
		}
		System.out.println("결과값 : " + result);
		System.out.println("");
		
		// do while
		num = 1; result = 0;
		
		do {
			if (num % 2 == 0 && num % 5 == 0) {
				System.out.println("2의 배수이면서 5의 배수 : " + num);
				result += num;
			}
			num++;
		} while (num <= 100);
		System.out.println("결과값 : " + result);
		
	}
}