package exam01;

public class StudentMain {
	public static void main(String[] args) {
		
		/*
		String name; // 변수 선언
		int quiz;
		
		name = "홍길동"; // 데이터 저장 (메모리 접근 방법)
		quiz = 90;
		System.out.println(name); // 데이터 읽어오는 방법
		*/
		
		Student hongkildong; // 참조(reference) 변수
		hongkildong = new Student(); // 인스턴스(instance)화 : 인스턴스(객체)
		// 1. 개발자가 만든 class Student 데이터타입(참조자료형)의 메모리 4byte를 할당받는다
		// 2. 할당받은 메모리의 이름은 Reference Variable(참조변수), 메모리의 내용은 아직 없다
		// 3. new ~ : class의 메모리할당, 인스턴스 변수가 붙어진다. 가장 앞의 메모리 주소를 참조변수 에 저장한다
		// 4. ()안의 인자argument를 만나면 class의 Conductor도 동작. conductor는 초기값 정할때 한번만 작동.
		// 5. Conductor의 parameter가 변수로 저장되며 메모리에 할당된다.
		// 6. argument가 parameter의 초기값으로 정장되며 class 인스턴스변수 메모리에 대입되는 동작 실행.
		// 7. conductor의 범위가 끝나며 할당된 conductor parameter 변수가 지워진다
		
		hongkildong.name = "홍길동"; // 데이터 저장(메모리 접근 방법)
		hongkildong.quiz = 85;
		hongkildong.midScore = 90;
		hongkildong.finalScore = 95;
		
		System.out.println(hongkildong.name); // 데이터 읽어오는 방법
		System.out.println(hongkildong.quiz);
		System.out.println(hongkildong.midScore);
		System.out.println(hongkildong.finalScore);
		
		Student leesunshin = new Student();
		leesunshin.name = "이순신";
		leesunshin.quiz = 95;
		leesunshin.midScore = 100;
		leesunshin.finalScore = 100;
		
		// new Class();
		// 1. 메모리 할당 (인스턴스 변수 선언)
		// 2. this(시작변수) = 메모리 주소;
		// 3. 생성자 호출 (인스턴스 변수 초기값 설정)
		// 4. return this; -> 참조변수에 저장
	}
}