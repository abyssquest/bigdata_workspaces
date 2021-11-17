package exam15;

public class EscapeSquence {
	public static void main(String[] args) {
		
		System.out.print("프로그램 ");
		System.out.println("시작.");
		
		System.out.println("친구가 어제 \"잘 다녀왔어?\"라고 물어서...");
		System.out.println("친구가 어제 '잘 다녀왔어?'라고 물어서...");
		System.out.println("친구가 어제\t\"잘 다녀왔어?\"라고 물어서...");
		System.out.println("친구가 어제\n\"잘 다녀왔어?\"라고 물어서...");
		
		System.out.println("줄바꿈 실행 시작....");
		System.out.println("줄바꿈 실행 끝....");
		
		System.out.print("줄바꿈 실행 시작....\n줄바꿈 실행 끝....");
		
		System.out.println("\\");
	}
}
