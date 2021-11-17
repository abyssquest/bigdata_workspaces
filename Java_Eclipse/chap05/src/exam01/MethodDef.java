package exam01;

public class MethodDef {
	public static void gugudan(int n) { // (1) 메서드 정의 방법
		for (int i = 1; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
	}

	public static void gugu2dan() { // (1) 메서드 정의 방법
		for (int i = 1; i < 10; i++) { // 구구단 2단 출력
			System.out.println("2 * " + i + " = " + (2 * i));
		}
	}

	public static void gugu5dan() { // (1) 메서드 정의 방법
		for (int i = 1; i < 10; i++) { // 구구단 5단 출력
			System.out.println("5 * " + i + " = " + (5 * i));
		}
	}
	
	public static void multiple(int p1,int p2, int max) { // 메서드 정의
		int sum = 0;
		for (int i = 1; i <= max; i++) { // 1 ~ max 사이의 값
			if (i % p1 == 0 && i % p2 == 0) { // p1의 배수이면서 p2의 배수
				System.out.println(i); // 출력
				sum += i;
			}
		}
		System.out.println("1 ~ " + max +" 사이의 " + p1 + "의 배수이면서 " + p2 + "의 배수인 수의 합 : " + sum);
	}

	public static void main(String[] args) {
		// 1) 프로그램 실행.

		gugu2dan();

		System.out.println("");
		gugu5dan(); // (2) 사용자가 정의한 메서드 호출 방법.

		System.out.println("");
		gugudan(7);
		
		System.out.println("");
		multiple(2,7,200);

		System.out.println("");
		System.out.println("프로그램 종료...");

		// 2) 프로그램 종료.
	}
}