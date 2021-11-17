package s03_data_primary;

public class VarData08_Casting {
	public static void main(String[] args) {
		
		/*
		
		- 자동 형변환
		큰 범위 자료형 Data = 작은 범위 자료형 Data : 작은 범위 자료형 Data를 큰 범위에 대입연산
		
		- 강제 형변환
		작은 범위 자료형 Data = (작은 범위 자료형) 큰 범위 자료형 Data
		
		*/
		
		byte num1;		short num2;		int num3;		long num4;
		float num5;		double num6;
		char alphabet;
		
		// 자동 형변환 예시
		
		num1 = 75;
		num2 = num1;
		num3 = num2;
		num4 = num3;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		num5 = 3.141592f;
		num6 = num5;
		
		System.out.println(num5);
		System.out.println(num6);
		
		alphabet = 'N';
		num3 = alphabet; // 문자형 char를 정수형 int로 자동형변환
		
		System.out.println(alphabet);
		System.out.println(num3);
				
		// 강제 형변환 예시
		
		num6 = 69.141592;
		num5 = (float) num6;
		num4 = (long) num5; // 실수형 data가 정수형으로 변환되면서 소수점 이하는 버려짐 
		num3 = (int) num4;
		num2 = (short) num3;
		num1 = (byte) num2;
		
		System.out.println(num6);
		System.out.println(num5);
		System.out.println(num4);
		System.out.println(num3);
		System.out.println(num2);
		System.out.println(num1);
				
		alphabet = (char) num3;
		System.out.println(alphabet);
		
		/* 연산에서 형변환
				
		float result = 10 + 0.2345;
		1. 메모리에 float형 result로 변수 할당 (4byte 실수)
		2. 대입연산 - 가장 마지막으로 미룸
		3. 10 (int형 정수)
		4. 0.2345 (double형 실수)
		5. + 연산 : 하지만 동일한 자료형끼리 연산이 이루어짐
		6. 동일한 자료형을 위해 int형 10이 double형 10으로 자동형변환
		7. double형으로 자료형이 일치되어 + 연산이 이루어짐 = 10.2345
		8. double형 10.2345가 float형 변수에 대입이 안되서 error
		
		*/
		
		// error 수정본
		double result1 = 10 + 0.2345; // result변수를 double형으로 수정
		System.out.println(result1);
		
		float result2 = (float)(10 + 0.2345); // +연산 결과를 float으로 강제형변환
		System.out.println(result2);
		
		float result3 = 10 + 0.2345f; // 실수부분을 float으로 지정 - 10은 float으로 자동형변환
		System.out.println(result3);
		
	}
}