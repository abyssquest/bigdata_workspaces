package exam02;

public class MethodReturn {
	public static void main(String[] args) {
		int result = 0;
		result = multifly(10,20); // 메서드 호출
		System.out.println(result);
		
		if(result >= 1000) {
			System.out.println("1000 이상 이군요");
		} else {
			System.out.println("1000 미만 이군요");
		}
		
		
		System.out.println("프로그램 종료...");
	}
	
	public static int multifly (int num1, int num2) { // 메서드 정의 형태
		int result = 0;
		result = num1 * num2;
		return result;
	}
}