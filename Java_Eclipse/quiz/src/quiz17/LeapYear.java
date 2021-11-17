package quiz17;

import java.util.Scanner;

public class LeapYear {

	public static boolean divisible (int year, int divNum) {
		boolean result = false;
		if(year % divNum == 0) result = true;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("윤년 판별하는 프로그램입니다.");
		System.out.println("궁금하신 연도를 입력해주세요.");
		int year = input.nextInt();

		String leapYear = "평년";
		if (divisible(year, 4)) {
			leapYear = "윤년";
			if (divisible(year, 100)) {
				leapYear = "평년";
				if (divisible(year, 400)) {
					leapYear = "윤년";
				}
			}
		}

		System.out.printf("입력하신 %d년은 %s입니다.", year, leapYear);
	}
}

//키보드로부터 임의의 년도를 입력받아 윤년인지 아닌지 정보를 출력하는 프로그램을 작성하세요.
//
//윤년의 정의
//- 1년 365.242374
//- 평년 = 365일 (2월달 - 28일까지)
//- 윤년 = 366일 (2월달 - 29일까지)
//
//1. 해당 연도를 4로 나누어 떨어지면 윤년.
//2. 그 중에서 100으로 나누어 떨어지면 윤년이 아님.
//3. 그 중에서 400으로 나누어 떨어지면 윤년.