package exam09;

public class LoopBreak {
	public static void main(String[] args) {

		System.out.println("* 1 ~ 100사이의 (양의) 짝수를 출력.");

		for (int i = 1; i <= 100; i++) { // 1 ~ 100 사이의 값
			if (i % 2 == 0) { // 짝수 조건
				System.out.println(i); // 출력
			}
		}

		System.out.println("");
		System.out.println("* 1 ~ 100사이의 (양의) 5의 배수를 출력.");

		for (int i = 1; i <= 100; i++) { // 1 ~ 100 사이의 값
			if (i % 5 == 0) { // 5의 배수 조건
				System.out.println(i); // 출력
			}
		}

		System.out.println("");
		System.out.println("* 1 ~ 100사이의 (양의) 5의 배수이면서 7의 배수를 출력.");

		for (int i = 1; i <= 100; i++) { // 1 ~ 100 사이의 값
			if (i % 5 == 0) { // 5의 배수
				if (i % 7 == 0) { // 7의 배수
					System.out.println(i); // 출력
				}
			}
		}

		for (int i = 1; i <= 100; i++) { // 1 ~ 100 사이의 값
			if (i % 5 == 0 && i % 7 == 0) { // 5의 배수이면서 7의 배수
				System.out.println(i); // 출력
			}
		}

		System.out.println("");
		System.out.println("* 1 ~ 100사이의 (양의) 5의 배수이거나 7의 배수를 출력.");

		for (int i = 1; i <= 100; i++) { // 1 ~ 100 사이의 값
			if (i % 5 == 0 || i % 7 == 0) { // 5의 배수 이거나 7의 배수
				System.out.println(i); // 출력
			}
		}

		System.out.println("");
		System.out.println("* 1 ~ 100사이의 (양의) 5와 7의 최소공배수를 출력.");

		for (int i = 1; i <= 100; i++) { // 1 ~ 100 사이의 값
			if (i % 5 == 0 && i % 7 == 0) { // 5의 배수이면서 7의 배수
				System.out.println(i); // 출력
				System.out.println("5와 7의 최소공배수 : " + i);
				break;
			}
		}

	}
}