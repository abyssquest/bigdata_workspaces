package exam03;

public class Comment {
	// 주석문 방법 1 (단축키(토글) : ctrl + /)
	// 파일 이름 : Comment.java
	// 작 성 자  : 김민국
	// 작 성 일  : 2021. 7. 15 (목)
	// 프로그램 설명 : comment(주석문)에 대한 실습 내용입니다.

	/*주석문 방법 2 (단축키 : ctrl + shift + /, ctrl + shift + \)
	파일 이름 : Comment.java
	작 성 자  : 김민국
	작 성 일  : 2021. 7. 15 (목)
	프로그램 설명 : comment(주석문)에 대한 실습 내용입니다.
	*/
	
	public static void main(String[] args) {
		System.out.println("Hello, JavaWorld!!!");
		System.out.println("방가방가 햄토리");

		System.out.println(100);  // 정수 출력
		System.out.println(3.14); // 실수 출력

		// 산술 연산 가능
		/*System.out.println(100 + 35); // 합
		System.out.println(100 - 35); // 차
		//System.out.println(100 * 35); // 곱
		System.out.println(100 / 35); // 나누기 - 몫
		System.out.println(100 % 35); // 나누기 - 나머지 */
		
		
		System.out.println("100+35");
		System.out.println("Hello, " + "Java!!!");
		System.out.println("Hello, Java!!!");

		// 숫자와 문자열의 합 작동 방식
		System.out.println(3.14 + "는 실수입니다.");
		System.out.println("3.14" + "는 실수입니다.");
		System.out.println("3.14는 실수입니다.");

		System.out.println("100+35=" + (100 + 35));
		System.out.println("100+35=" + 135);
		System.out.println("100+35=" + "135");
		System.out.println("100+35=135");
	}
}
