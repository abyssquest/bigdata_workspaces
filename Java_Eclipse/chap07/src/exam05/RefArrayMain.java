package exam05;

public class RefArrayMain {
	public static void main(String[] args) {
		// 가정) class Student size : 100byte
		// new Student(); 인스턴스 메모리 할당 100byte 할당
		
		Student[] student = new Student[5];
		// 아직 인스턴스 만들어 지지 않음. 참조변수 선언 밖에 안되었다
		// 참조변수에 해당하는 4byte * 5개 = 20byte 할당됨
		
		// Student leesunshin = new Student("이순신", 75, 80, 90);
		// Student ganggamchan = new Student("강감찬", 80, 75, 90);
		// Student sejong = new Student("세종대왕", 100, 100, 100);
		// Student hongkildong = new Student("홍길동", 85, 90, 95);
		// Student hongkilnam = new Student("홍길남", 65, 80, 90);
		
		student[0] = new Student("이순신", 75, 80, 90);
		student[1] = new Student("강감찬", 80, 75, 90);
		student[2] = new Student("세종대왕", 100, 100, 100);
		student[3] = new Student("홍길동", 85, 90, 95);
		student[4] = new Student("홍길남", 65, 80, 90);
		// 참조변수 student의 인스턴스는 student[0], student[1], student[2], student[3], student[4]를 인스턴스 변수로 갖는다
		// student[0]의 인스턴스는 new Student(); 실행시 생성
		
		student[0].displayStudentInfo();
		student[1].displayStudentInfo();
		student[2].displayStudentInfo();
		student[3].displayStudentInfo();
		student[4].displayStudentInfo();

	}
}
