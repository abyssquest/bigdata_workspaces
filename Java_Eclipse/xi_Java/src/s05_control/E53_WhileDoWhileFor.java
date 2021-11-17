package s05_control;

public class E53_WhileDoWhileFor {
	public static void main(String[] args) {
		int num, result;
		
		/* 1 ~ 100 까지 합 구하기 */
		
		// While (bool) {act}
		System.out.println("While문 예문 연습");
		num = 1; result = 0;	// 초기값 설정
		while (num <= 100) {
			result += num;
			num++; // num = num + 1; //무한반복 막기위해 중요
		}
		System.out.println("결과값 : " + result + "\n");

		// Do {act} While (bool) : while과 명령문 순서 차이
		System.out.println("Do While문 예문 연습");
		num = 1; result = 0;	// 초기값 설정
		do {
			result += num;
			num++; // num = num + 1; //무한반복 막기위해 중요
		} while (num <= 100);
		System.out.println("결과값 : " + result + "\n");

		// for (var 할당 및 초기값; var 범위조건; var 변화설정) {act}
		// 변수 가시성이 좋아 많이 쓴다
		System.out.println("For문 예문 연습");
		result = 0;
		for (int n = 1; n <= 100; n++) {
			result += n;
		}
		System.out.println("결과값 : " + result + "\n");
	}
}