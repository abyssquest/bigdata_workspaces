package data.Refernce.Array;

public class Array01_Intro {

	public static void main(String[] args) {

		// 배열 없는 데이터 관리
		// 같은 자료형 데이터 5개를 변수 5개로 나누어 관리하고 있는 상황

		int korean = 90, english = 95, math = 85, social = 95, science = 90;

		System.out.println(korean);
		System.out.println(english);
		System.out.println(math);
		System.out.println(social);
		System.out.println(science);
		System.out.println();

		System.out.println("배열은 같은 자료형 여러개를 한꺼번에 관리\n");

		/* 영희의 성적 데이터 관리 예시 */

		int[] younghee; // 참조변수 선언
		younghee = new int[5]; // 참조변수 정의

		// 국어 90, 영어 95, 수학 85, 사회 95, 과학 90

		younghee[0] = 90;
		younghee[1] = 95;
		younghee[2] = 85;
		younghee[3] = 75;
		younghee[4] = 80;

		// 배열 데이터 로드

		System.out.println(younghee[0]);
		System.out.println(younghee[1]);
		System.out.println(younghee[2]);
		System.out.println(younghee[3]);
		System.out.println(younghee[4]);

		// [0], [1], [2], [3], [4] 를 index라 한다
	}
}