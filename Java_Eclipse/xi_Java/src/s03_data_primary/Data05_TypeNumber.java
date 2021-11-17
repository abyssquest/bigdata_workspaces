package s03_data_primary;

public class Data05_TypeNumber {
	/*	숫자형
	정수형 (기본은 int형)
		byte   : 1 Byte 할당 : 범위 -128 ~ 127 (3자리)
		short  : 2 Byte 할당 : 범위 -32768 ~ 32767 (5자리)
		int    : 4 Byte 할당 : 범위 -2147483648 ~ 2147483647 (10자리)
		long   : 8 Byte 할당 : 범위 -9223372036854775808 ~ 9223372036854775807 (19자리)
					
	실수형 (기본은 double형) : 애초에 실수는 일정범위에 무한히 존재하기 때문에 정확히 표현 불가능
		float  : 4 Byte 할당 : 범위 -3.40E38 ~ 3.40E38 (39자리)
		double : 8 Byte 할당 : 범위 -1.79E308 ~ 1.79E308 (309자리)
	*/
	
	public static void main(String[] args) {

		byte num1 = 15;				// 1byte 메모리를 할당해 num1 붙이고 int형 15를 저장한다
		short num2 = 5342;			// 2byte 메모리를 할당해 num2 붙이고 int형 5342를 저장한다
		int num3 = 52268845;		// 4byte 메모리를 할당해 num3 붙이고 int형 52268845를 저장한다
		// long num4 = 90000000000	// 오른쪽 90000000000는 정수이므로 기본int형이나 int 범위를 벗어나 error
		long num4 = 90000000000L;	// 8byte 메모리를 할당해 num4 붙이고 long형 Data 90000000000을 저장한다
									// 뒤에 L (대문자 또는 소문자 상관없음)을 붙여 long 형임을 알려준다
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println();
		
		// float num5 = 3.14;		// 4byte 메모리를 할당해 num5 붙였으나 오른쪽 자료가 double형이라 float에 저장 오류
		float num5 = 3.14F;			// 4byte 메모리를 할당해 num5 붙이고 float형 3.14를 저장한다
									// 뒤에 F (대문자 또는 소문자 상관없음)을 붙여 float 형임을 알려준다
		double num6 = 3.14;			// 8byte 메모리를 할당해 num6 붙이고 double형 3.14를 저장한다
		
		System.out.println(num5);
		System.out.println(num6);
		System.out.println();
		
		/* 실수 표현, 저장, 연산의 부정확함 */
		
		double data1 = 3.141592;	// 변수 선언 및 초기화
		double data2 = 1.414;
		
		System.out.println(data1 + data2);
		System.out.println(data1 - data2);	// 1.7275920000000002 실수 저장은 정확하지 않기 때문에
		System.out.println();
		
		/* e표기법 */
		
		data1 = 1.2e-3;	// e표기법 1.2 * 10^-3 (-는 생략 불가능)	// 변수 재사용
		data2 = 1.2e+3;	// e표기법 1.2 * 10^+3 (+는 생략 가능)
		
		System.out.println(data1 + data2);
		System.out.println(data2 - data1);
	}
}