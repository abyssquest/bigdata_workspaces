package s06_method;

public class E01_Method_Define {
	/* 메서드 : 프로그램의 동작을 정의 */
	// 개발자가 미리 정의한 동작을 메서드로 만들어 놓고 필요할때 로딩한다
	// main 메서드는 가독성의 측면에서 class 영역의 가장 앞 or 뒤에 위치하는게 추천된다

	/* 메서드 정의 : 접근제어지시자 (static) returnType 메서드이름 (parameter) {act} */

	public static void sample_method () {
		// 개발자가 정의한 메서드 : main 메서드에서 불러와야만 java가 관심있다.
		// 실행문이 꼭 필요하지는 않는다
		
		System.out.println("개발자가 정의한 메서드가 실행됬습니다.");
	}

	public static void main(String[] args) { // main 메서드 : java가 관심 있는 부분
		// 1. 컴파일 후 .class 실행 -> 같은 이름의 class 찾는다
		// 2. class 내에서 main 메서드 찾아 실행
		// 3. main 메서드가 시작 = 프로그램 시작

		System.out.println("프로그램을 시작합니다.");
		System.out.println();
		
		sample_method(); // 개발자가 정의한 메서드 로드
		
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
		
		// 4. main 메서드내 모든 실행문 실행 완료되면 프로그램 종료
	}
}
