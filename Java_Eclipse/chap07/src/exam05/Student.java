package exam05;

class Student { // 참조자료형(class)
	// field(필드), 인스턴스 변수
	
	String name;	// 학생이름
	int quiz;		// quiz 점수
	int midScore;	// 중간고사 점수
	int finalScore;	// 기말고사 점수
	
	Student (String studentName, int studentQuiz, int studentMid, int studentFinal) {
		// 생성자(Constructor) : class 이름과 똑같아야 한다
		// 클래스 초기값 정할때만 한번 작동
		// 메서드와는 조금 다르다.
		
		name = studentName;
		quiz = studentQuiz;
		midScore = studentMid;
		finalScore = studentFinal;
	}
	
	public void displayStudentInfo () { // 멤버 메서드 (인스턴스 메서드) 정의
		System.out.println(name);
		System.out.println(quiz);
		System.out.println(midScore);
		System.out.println(finalScore);
	}
}