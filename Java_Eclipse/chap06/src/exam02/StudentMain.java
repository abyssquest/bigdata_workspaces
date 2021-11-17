package exam02;

public class StudentMain {
	public static void main(String[] args) {
		Student hongkildong = new Student("홍길동", 85, 90, 95);
		Student leesunshin = new Student("이순신", 95, 100, 100);
		Student ganggamchan = new Student("강감찬", 75, 80, 80);
		
		// System.out.println(hongkildong.name);
		// System.out.println(hongkildong.quiz);
		// System.out.println(hongkildong.midScore);
		// System.out.println(hongkildong.finalScore);
		hongkildong.displayStudentInfo ();
		System.out.println("");
		
		// System.out.println(leesunshin.name);
		// System.out.println(leesunshin.quiz);
		// System.out.println(leesunshin.midScore);
		// System.out.println(leesunshin.finalScore);
		leesunshin.displayStudentInfo ();
		System.out.println("");
		
		// System.out.println(ganggamchan.name);
		// System.out.println(ganggamchan.quiz);
		// System.out.println(ganggamchan.midScore);
		// System.out.println(ganggamchan.finalScore);
		ganggamchan.displayStudentInfo ();
	}
	
	/*
	public static void displayStudentInfo (Student StudentName) {
		System.out.println(StudentName.name);
		System.out.println(StudentName.quiz);
		System.out.println(StudentName.midScore);
		System.out.println(StudentName.finalScore);
	}
	*/
}