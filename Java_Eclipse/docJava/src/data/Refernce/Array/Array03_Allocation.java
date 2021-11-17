package data.Refernce.Array;

public class Array03_Allocation {

	public static void main(String[] args) {
		// 가정) class Student size : 100byte
		// new Student(); :참조변수 정의 - 인스턴스 메모리 할당 100byte
		
		Student[] student = new Student[5];
		// 1. student 참조변수 선언 : Classtype Student를 묶어서 관리하려는 배열
		// 2. 참조변수 student에 메모리 4byte가 할당되며 인스턴스의 메모리 주소가 저장된다
		// 3. 참조변수 정의 : C
		// 아직 인스턴스 만들어 지지 않음. 참조변수 선언 밖에 안되었다
		// 참조변수에 해당하는 4byte * 5개 = 20byte 할당됨

		
		
		// 참조자료형 : 참조변수의 메모리에 인스턴스의 메모리 주소를 저장
		// 참조자료형 인스턴스 메모리 할당 : new 참조자료형;

		// Array 배열 : 같은 타입의 데이터를 묶어서 관리
		// 기본자료형, 참조자료형 가리지 않는다.
		// byte, short, int, long, float, double, char, String, class, array

		/* 배열 선언과 데이터 할당 과정 */


		int[] arr;
		// int형 데이터를 관리할 배열만든다. 참조변수는 i.
		// 인스턴스 메모리 주소를 저장할 메모리 크기는 4byte.

		arr = new int[5];
		// 참조변수의 인스턴스 메모리를 할당한다.
		// 인스턴스엔 int형 데이터 5개가 담긴다.
		// int형은 4byte를 가지므로 인스턴스의 총 메모리 크기는 4 * 5 = 20byte

		arr[0] = 95;
		arr[1] = 90;
		arr[2] = 88;
		arr[3] = 92;
		arr[4] = 70;
		// 생성된 인스턴스는 각 구역을 0, 1, 2, 3, 4의 번호를 부여해 구별한다
		// 참조변수 i와 함께 []의 구역번호로 메모리로 접근해 데이터를 저장, 불러오기 한다.

		/* 배열 동시에 선언과 인스턴스 메모리 할당 : int형 예시 */
		int[] a = new int[3];
		int b[] = new int[7];
		b = new int[] { 35, 79, 53, 62, 55, 45, 55 };
		int[] c = new int[] { 35, 79, 53, 62, 55, 45 };
		int d[] = new int[] { 35, 79, 53, 62, 55, 45 };
		int[] e = { 35, 79, 53, 62, 55, 45 };
		int f[] = { 35, 79, 53, 62, 55, 45 };
	}

}

class Student {
	String name;
	int quiz;
	int midScore;
	int finalScore;

	Student (String name, int quiz, int midScore, int finalScore) {
		this.name = name;
		this.quiz = quiz;
		this.midScore = midScore;
		this.finalScore = finalScore;
	}
	
	public void displayStudentInfo () { // 멤버 메서드 (인스턴스 메서드) 정의
		System.out.println(name);
		System.out.println(quiz);
		System.out.println(midScore);
		System.out.println(finalScore);
	}
}