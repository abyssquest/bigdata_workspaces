package z.other;

public class E61_ClassBasic {
	public static void main(String[] args) {
		
		System.out.println("참조변수에 연결되는 인스턴스 메모리 할당 요청은 '= new 참조자료형;' 으로 한다");

		// 방법 1
		
		// 만들어둔 클래스타입에 따른 참조변수 선언 (stack 영역)
		ClassType_Student classA;
		
		// 참조변수에 연결되는 인스턴스 생성 (heap 영역)
		classA = new ClassType_Student("세종대왕", 100, 100, 100);
		
		
		// 방법 2
		// 참조변수 선언 및 연결되는 인스턴스 생성 동시에
		ClassType_Student classB = new ClassType_Student("이순신", 85, 95, 80); 

		classA.showScore();
		classB.showScore();
		
		/*
		// 인스턴스 생성되면서 참조변수에 연결되는 인스턴스변수 생성
		
		classA.teacherName = "이순신"; // 
		classA.numberOfStudent = 40;
		classB.teacherName = "곽재우";
		classB.numberOfStudent = 37;
		// field(속성) 설정된 클래스 타입에 따르는 참조변수 선언, 인스턴스 생성 - 속성 설정 
		
		Sample02_ClassType class03 = new Sample02_ClassType(); // 인스턴스 생성 > 인스턴스 변수 메모리 할당
		class03.teacherName = "이순신";
		class03.studentNumber = 25; // 참조변수.인스턴스변수 로 메모리 접근해 초기값 설정
		System.out.println(class03.teacherName);
		System.out.println(class03.studentNumber); // 참조변수.인스턴스변수 로 메모리 접근 - 데이터 로드
		System.out.println();
		
		//field, constructor 설정된 클래스 타입의 참조변수 선언과 인스턴스 변수 초기값 설정
		// 인스턴스 생성시에 constructor가 작동 : 속성에 parameter 대입연산이 작동한다
		
		Sample03_ClassType class04;
		class04 = new Sample03_ClassType("세종대왕", 28);
		System.out.println(class04.teacherName);
		System.out.println(class04.studentNumber);
		System.out.println();
		
		Sample03_ClassType class05 = new Sample03_ClassType("김유신", 20);
		System.out.println(class05.teacherName);
		System.out.println(class05.studentNumber);
		
		*/
	}
}