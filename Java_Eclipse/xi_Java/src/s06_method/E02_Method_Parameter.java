package s06_method;

public class E02_Method_Parameter {

	public static void main(String[] args) {
		System.out.println("프로그램을 시작합니다.");
		System.out.println();

		System.out.println("parameter 0개인 메서드");
		sample_gugu2dan(); // 구구단 2단 로드
		System.out.println();
		sample_gugu5dan(); // 구구단 5단 로드
		System.out.println();

		System.out.println("parameter 1개인 메서드");
		sample_gugudan(7); // parameter(매개변수)에 argument(전달인자, 인수) 7 적용
		System.out.println();
		sample_gugudan(3); // parameter(매개변수)에 argument(전달인자, 인수) 3 적용
		System.out.println();

		System.out.println("parameter 여러개인 메서드");
		// 1 ~ 인수1 까지의 숫자 중 인수2, 인수3 의 공배수의 합을 출력하는 메서드
		sample_SumCommonMultiple(500, 3, 5);
		sample_SumCommonMultiple(1000, 2, 7);
		sample_SumCommonMultiple(2000, 4, 9);

		System.out.println();
		System.out.println("프로그램을 종료합니다.");
	}

	public static void sample_gugu2dan() { // 구구단 2단 메서드
		for(int i = 1; i < 10; i++) {
			System.out.printf("2 * %d = %2d\n", i, 2 * i);
		}
	}

	public static void sample_gugu5dan() { // 구구단 5단 메서드
		for(int i = 1; i < 10; i++) {
			System.out.printf("5 * %d = %2d\n", i, 5 * i);
		}
	}

	public static void sample_gugudan(int n) { // 구구단 메서드
		// parameter(매개변수)가 적용된 메서드 정의
		// argument(전달인자, 인수)가 parameter에 적용되 실행문이 작동한다

		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %2d\n", n, i, n * i);
		}
	}

	public static void sample_SumCommonMultiple(int max, int n1, int n2) {
		// 여러개의 parameter가 적용된 메서드 정의
		
		int sum = 0;
		for(int i = 1; i < max; i++) {
			if (i % n1 == 0 && i % n2 == 0) {
				sum += i;
			}
		}
		System.out.printf("1 ~ %4d까지 %d, %d의 공배수의 합은 %6d이다.\n", max, n1, n2, sum);
	}

}
