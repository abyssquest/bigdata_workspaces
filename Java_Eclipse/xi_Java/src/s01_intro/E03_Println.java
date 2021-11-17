package s01_intro;

public class E03_Println {
	public static void main(String[] args) {
		// System.out.println(); 실행문 동작 방식
		// ; (세미콜론) 마다 실행문 하나씩 동작

		System.out.println("문자열 출력");
		System.out.println("Hello, Java World!!!"); // 문자열 출력
		System.out.println("방가방가 햄토리");
		System.out.println();
		
		System.out.println("숫자 출력");
		System.out.println(100); // 숫자 출력
		System.out.println(3.14);
		System.out.println();
		
		System.out.println("숫자 연산 출력");
		System.out.println("100 + 35 = " + (100 + 35)); // 숫자 연산 출력
		System.out.println("100 - 35 = " + (100 - 35));
		System.out.println("100 * 35 = " + (100 * 35));
		System.out.println("100 / 35 = " + (100 / 35));
		System.out.println();
		
		System.out.println("100+35" + " : 문자열로 인식한 숫자 출력"); // 문자열로 인식한 숫자 출력
		System.out.println("Hello, " + "Java!!!" + " : 문자열 + 문자열 연산"); // 문자열 + 문자열 연산 출력
		System.out.println();
		
		System.out.println("숫자 + 문자열 연산 출력");
		System.out.println(3.14 + "는 실수입니다."); // 숫자 + 문자열 연산 출력 과정
		System.out.println("3.14" + "는 실수입니다.");
		System.out.println("3.14는 실수입니다.");
		System.out.println();
		
		System.out.println("() 괄호 없을 때 연산 과정");
		System.out.println("100 + 35 = " + 100 + 35); // ()괄호 없을때 연산 과정
		System.out.println();
		
		System.out.println("() 괄호 있을 때 연산 과정");
		System.out.println("100 + 35 = " + (100 + 35)); // ()괄호 우선 연산 과정
		System.out.println("100 + 35 = " + 135);
		System.out.println("100 + 35 = " + "135");
		System.out.println("100 + 35 = 135");
	}
}