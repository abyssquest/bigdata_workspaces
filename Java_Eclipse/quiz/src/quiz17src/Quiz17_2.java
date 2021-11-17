package quiz17src;

import java.util.Scanner;

/*
 * 문제2)
       (로또 번호 추출) 1~45사이의 숫자를 6개 추출 하는 프로그램을 작성 하세요
       (단, 중복된 숫자는 1번만 출력한다).

 * 문제3)
       윤년의 정의
	  - 1년 365.242374
	  - 평년 = 365일 (2월달 - 28일까지)
	  - 윤년 = 366일 (2월달 - 29일까지)

	1. 해당 연도를 4로 나누어 떨어지면 윤년.
	2. 그 중에서 100으로 나누어 떨어지면 윤년이 아님.
	3. 그 중에서 400으로 나누어 떨어지면 윤년.
 */

public class Quiz17_2 {
	public static void main(String[] args) {
		// 문제 1.
		int num[] = new int[6];

		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 45) + 1;

			for(int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
		}

		for(int k = 0; k < num.length; k++) {
			System.out.print(num[k] + "  ");
		}
		
		System.out.println("\n=================");
		
		// 문제 2.
		System.out.println("연도를 입력하세요?");
		Scanner keyboard = new Scanner(System.in);
		
		int year = keyboard.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			System.out.println(year + "은 윤년");
		}else{
			System.out.println(year + "은 평년");
		}	
	}
}
