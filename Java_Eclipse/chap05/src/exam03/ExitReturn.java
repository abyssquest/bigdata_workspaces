package exam03;

public class ExitReturn {
	public static void main(String[] args) {
		divide(10, 5);
		divide(10, 3);
		divide(100, 0);  // error
	}

	public static void divide (double n1, double n2) {
		double result = 0;
		if (n2 == 0) {
			System.out.println("분모가 0이 될 수 없습니다.");
			return;
		}
		
		result = n1 / n2;
		System.out.println(n1 + " / " + n2 + " = " + result);
	}
}