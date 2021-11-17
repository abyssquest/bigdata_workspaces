package s06_method;

public class E03_Method_Return {

	public static void main(String[] args) {

		System.out.println("Return : Method Exit 역할");
		divide(42.19, 5.2);
		divide(56.82, 7.35);
		divide(100, 0); // if 조건절을 설정하지 않을 때는 무한(infinity)으로 출력

		System.out.println();

		System.out.println("Return : Method에서 출력값을 보내는 역할");
		int data = multifly(7, 8); // 메서드의 return 타입이 void가 아닐 경우, 메서드는 데이터를 가지고 있다.
		System.out.println(data);

	}

	public static void divide(double n1, double n2) { // return : Exit 역할
		if(n2 == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
			return;
			// return이 void 일 때, return은 메서드를 중지하고 main 메서드로 돌아가도록 한다.
		}
		System.out.printf("%.2f / %.2f = %.2f\n", n1, n2, n1 / n2);
	}

	public static int multifly (int num1, int num2) { // 메서드의 return 타입이 int형으로 설정
		int result = 0;
		result = num1 * num2;
		return result; // return 이후 실행문의 데이터를 main Method로 가지고 간다
	}
}
