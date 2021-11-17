package exam05;

public class FinallyTest {
	public static void main(String[] args) {
		boolean divOk = divider(4,2);
		
		if(divOk) {
			System.out.println("연산 성공.");
		} else {
			System.out.println("연산 실패.");
		}
		
		divOk = divider(4,0);
		
		if(divOk) {
			System.out.println("연산 성공.");
		} else {
			System.out.println("연산 실패.");
		}
	}
	
	public static boolean divider(int n1, int n2) {
		boolean isCheck = false;
		try {
			
			int result = n1 / n2;
			isCheck = true;
			System.out.println("연산 실행.");
			return isCheck;
			
		} catch(ArithmeticException e) {
			
			System.out.println("나눗셈 불가능.");
			isCheck = false;
			return isCheck;
			
		} finally {
			
			System.out.println("finally 실행.");
			
		}
		
//		return isCheck;
	}
}
