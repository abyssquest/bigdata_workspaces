package exam06;

public class WhileBasic {
	public static void main(String[] args) {

		int num = 1;

		/*
		하기 싫은 반복문
		System.out.println("명령문 실행 : " + num);
		System.out.println("명령문 실행 : " + num);
		System.out.println("명령문 실행 : " + num);
		System.out.println("명령문 실행 : " + num);
		System.out.println("명령문 실행 : " + num);
		 */

		while (num <= 3) {
			System.out.println("명령문 실행 : " + num);
			num++; // num += 1;
		}
		
		/* 1 ~ 100의 총합은? */
		long result = 0;
		num = 1;

		while (num <= 100) {
			result += num; // result = result + num;
			num++;
		}
		
		System.out.println("총합 : " + result);
		System.out.println("프로그램 종료 ...");

	}
}