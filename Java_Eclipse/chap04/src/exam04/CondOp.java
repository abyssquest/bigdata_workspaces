package exam04;

public class CondOp { // If(){} else if(){} else{} 문장
	public static void main(String[] args) {
		
		int num1 = 50, num2 = 100;
		int big = 0, diff = 0;
		
		if (num1 > num2) {
			System.out.println(num1 + "이 " + num2 + "보다 크다.");
			big = num1;
			diff = num1 - num2;
		} else {
			System.out.println(num1 + "이 " + num2 + "보다 작다.");
			big = num2;
			diff = num2 - num1;
		}
		System.out.println("큰 값 : " + big + ", 두 값의 차 :" + diff);
		
		// 삼항 연산자
		big = (num1 > num2) ? num1 : num2 ;
		diff = (num1 > num2) ? num1 - num2 : num2 - num1;
		System.out.println("큰 값 : " + big + ", 두 값의 차 :" + diff);
		
	}
}