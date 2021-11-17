package s05_control;

public class E54_BreakContinue {
	public static void main(String[] args) {

		System.out.println("* 1 ~ 100사이의 (양의) 2의 배수이면서 5의 배수를 출력.");
		
		for (int i = 1; i <= 100; i++) { // 1 ~ 100 사이의 값
			if (i % 2 == 0 && i % 5 == 0) { // 2의 배수이면서 5의 배수
				System.out.println(i); // 출력
			}
		}
		System.out.println();
		
		// && 안쓰고 if 두번 쓰기
		for (int i = 1; i <= 100; i++) { // 1 ~ 100 사이의 값
			if (i % 2 == 0) { // 2의 배수
				if (i % 5 == 0) { // 5의 배수
					System.out.println(i); // 출력
				}
			}
		}
		System.out.println();
		
		/* break 의 이용 */
		// 2와 5의 최소 공배수를 출력 - 제어문을 멈추는 역할
		// 최소 공배수 출력시 제어문 멈추게 된다
		System.out.println("break; 를 이용하는 예문 - 제어문을 멈추는 역할");
		System.out.println("* 1 ~ 100사이의 (양의) 2와 5의 최소공배수를 출력.");
		for (int i = 1; i <= 100; i++) { // 1 ~ 100 사이의 값
			if (i % 2 == 0 && i % 5 == 0) { // 2의 배수이면서 5의 배수
				System.out.println(i); // 출력
				break;	// 실행시 제어문 멈춘다
			}
		}
		System.out.println();
		
		// 2와 5의 공배수를 순서대로 4개 출력
		System.out.println("* 1 ~ 100사이의 (양의) 2와 5의 공배수를 순서대로 4개 출력.");
		for (int i = 1, count = 0; i <= 100; i++) { // 1 ~ 100 사이의 값
			if (i % 2 == 0 && i % 5 == 0) { // 2의 배수이면서 5의 배수
				System.out.println(i); // 출력
				count++; // if 범위가 실행 될때만 count 올라간다
			}
			if (count == 4) {
				break;
				}
		}
		System.out.println();
		
		/* continue; 의 이용 */
		System.out.println("continue; 를 이용하는 예문 - 제어문의 제일 앞으로 이동");
		System.out.println("5의 배수이면서 7의 배수는 1 ~ 100사이에 몇개가 있는가");
		int num = 0, count1 = 0;
		while(num++ < 100) { // 1. num에 따라 조건문 판별 2. while범위로 내려가기전 ++동작
			if(num % 5 != 0 || num % 7 != 0) { // 5의 배수가 아니거나 7의 배수가 아닌 수
				continue; // 이후 명령문 무시하고 while 조건문으로 돌아간다
			}
			count1++; // 5의 배수이면서 7의 배수 count++
			System.out.println(num); // 5의 배수이면서 7의 배수 출력 
		}
		System.out.println("count : " + count1);
	}
}