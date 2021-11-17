package exam17;

public class StringScanner {

	public static void main(String[] args) {
		String source = "1 5 7";
		java.util.Scanner scanner = new java.util.Scanner(source);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		System.out.printf("저장된 숫자는 num1 = %d, num2 = %d, num3 = %d 입니다.", num1, num2, num3);
	}
}
