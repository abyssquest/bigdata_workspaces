package exam06;

class Adder {
	// Method Overloading : 연산하기 전에 구분이 되야한다
	// Method의 매개변수의 종류나 개수가 다르면 연산전에 구분
	// Return 값은 연산 후에 나오기 때문에 오버로드에 적용되지 않는다 
	public int add (int n1, int n2) { return n1 + n2; }
	public double add (double n1, double n2) {return n1 + n2; }
	public double add (int n1, double n2) {return n1 + n2; }
	public double add (double n1, int n2) {return n1 + n2; }
	public double add (double n1, int n2, int n3) { return n1 + n2 + n3; }
	
	/* 주의 1) 반환형 타입이 다른 것은 오버로딩에 영향을 미치지 않는다.
	public double add (int n1, int n2) {
		double result = 0.0;
		result = n1 + n2;
		return result; } */
}

public class MethodOverloading {
	public static void main(String[] args) {
		Adder adder = new Adder();
		int result1 = 0;
		double result2 = 0.0;
		
		result1 = adder.add(100, 200);
		System.out.println("100 + 200 = " + result1);
		
		result2 = adder.add(3.14, 5.45);
		System.out.println("3.14 + 5.45 = " + result2);
		
		result2 = adder.add(3, 5.45);
		System.out.println("3 + 5.45 = " + result2);
		
		result2 = adder.add(3.14, 5);
		System.out.println("3.14 + 5 = " + result2);
		
		result2 = adder.add(3.14, 5, 10);
		System.out.println("3.14 + 5 + 10 = " + result2);
		
		// 주의 2)
		System.out.println(adder.add('A', 10));
		// 매개변수 char, int 로 정의된 메소드가 없다
		// char가 가까운 int로 자동형변환
		// int, int로 정의된 메소드를 찾아본다
		// 정의된 메소드가 있으므로 int, int로 동작하는 메소드 동작
	}
}