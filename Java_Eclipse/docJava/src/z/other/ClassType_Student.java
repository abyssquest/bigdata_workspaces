package z.other;

class ClassType_Student {
	/* Class 설정 예시 */

	// 설정 형식 : class ClassType { field constructor method }
	// field, constructor, method로 구성되지만 각각 있어도 되고 없어도 된다
	// constructor(생성자)가 없어도 JAVA가 자동으로 내용없는 생성자를 만들어서 작동시킨다
	
	// field(속성) : 인스턴스 생성시(new) 할당된 메모리 내에서 작동하도록 설정
	// 참조변수.인스턴스변수 로 메모리 접근이 가능
	String studentName;
	int korean;
	int english;
	int math;
	
	
	ClassType_Student (String studentName, int korean, int english, int math) {
	// constructor(생성자) : 인스턴스 생성시(new)에만 작동
	// 형식 : ClassType (parameter) {act}
		
		this.studentName = studentName;
		this.korean = korean;
		this.english = english;
		this.math = math;
		// this.변수 : 인스턴스 생성시에만 작동, field와 constructor의 parameter를 구분하게 해준다
		// constructor parameter 이름을 따로 짓기 
		}
	
	public void showScore() {
		System.out.println(studentName + " 학생의 국어 점수는 " + korean + "입니다");
		System.out.println(studentName + " 학생의 영어 점수는 " + english + "입니다");
		System.out.println(studentName + " 학생의 수학 점수는 " + math + "입니다");
	}
	
	public int showScoreSum() {
		return korean + english + math;
	}
	
	public double showScoreAverage() {
		double sum = showScoreSum();
		return sum / 3;
	}
}