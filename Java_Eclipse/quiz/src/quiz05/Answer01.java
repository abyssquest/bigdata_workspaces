package quiz05;

public class Answer01 {
	
	public static void main(String[] args) {
		
		String name1 = "홍길동";
		int quiz1 = 85;
		int mid1 = 90;
		int last1 = 95;
		
		String name2 = "이순신";
		int quiz2 = 95;
		int mid2 = 100;
		int last2 = 100;
		
		String name3 = "강감찬";
		int quiz3 = 75;
		int mid3 = 80;
		int last3 = 80;
		
		student (name1, quiz1, mid1, last1);
		student (name2, quiz2, mid2, last2);
		student (name3, quiz3, mid3, last3);
	}
	
	public static void student(String name, int quiz, int mid, int last) {
		System.out.println("학생의 이름은 " + name + "입니다.");
		System.out.println(name + "의   quiz   점수는 : " + quiz + "점");
		System.out.println(name + "의 중간고사 점수는 : " + mid + "점");
		System.out.println(name + "의 기말고사 점수는 : " + last + "점");
		System.out.println("");
	}
}