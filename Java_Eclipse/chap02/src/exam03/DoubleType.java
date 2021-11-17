package exam03;

public class DoubleType { // 실수 (float / double)

	public static void main(String[] args) {
		double data1 = 3.14, data2 = 1.05; // 변수 선언 및 초기화
		
		System.out.println(data1 - data2);
		
		data1 = 2.24;    // 변수 재사용
		data2 = 1.22;    // 변수 재사용
		
		System.out.println(data1 - data2);    // 1.0200000000000002
		
		double e1 = 1.2e-3;  // e표기법(1.2 * 10^-3)
		double e2 = 1.2e+3;  // e표기법(1.2 * 10^3)
		
		System.out.println(e1);
		System.out.println(e2);
	}

}