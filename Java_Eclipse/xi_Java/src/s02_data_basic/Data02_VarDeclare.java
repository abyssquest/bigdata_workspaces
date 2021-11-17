package s02_data_basic;

public class Data02_VarDeclare {

	/* 변수 선언 */
	
	//	DataType 변수명; - 변수명으로 메모리에 공간 할당 요청
	//	변수명 = 초기값; - 변수명 지정된 메모리에 Data 초기값 설정

	//	DataType 변수명 = 초기값; - 변수 선언 + 초기값 설정 동시에 가능
	
	
	/* 변수 이름 규칙 */
	//	1. 알파벳 대소문자(구분), 숫자, 한글 사용 가능
	//	2. 변수 선언시 숫자로 시작 불가능
	//	3. 변수 선언시 공백 불가능
	//	4. 특수문자 _ 가능
	//	5. 특수문자 $ 가능 but 자바가 쓰려고 놔둔것 (쓰지말자)
	//	6. 변수 선언시 키워드(예약어) 불가능
	
	
	/* 변수 이름 권고 사항 */
	//	1. 모두 대문자 피할 것
	//	2. 생략형 피할것
	//	3. 카멜 / 파스칼 / 헝가리언 표기법 사용 권장
	//	4. 클래스명은 첫자를 대문자로
	//	5. 상수(변하지 않는 수)는 모두 대문자로 (PI, MAX_NUMBER 등)

	public static void main(String[] args) {

		/* DataType
		
		//	기본자료형(Primitive Type)
		//		논리 - boolean	(기본은 false)
		//		문자 - char	(기본은 공백 \u0000)
		//		숫자형
		//			- 정수형 (기본은 int형) : byte, short, int, long
		//			- 실수형 (기본은 double형) : float, double
		
		//	참조자료형(Reference Type) : 기본자료형이 아닌것은 모두 참조자료형
		//		문자열 String
		//		배열
		//		클래스
		//		인터페이스
		
		*/
		
		byte num1;                   // 변수 선언 (1byte 메모리 할당 요청)
		int num2;                    // 4byte 메모리 할당 요청
		int num3;
		long result;                 // int result;
		
		// num1 = 300;               // error 범위 초과

		num1 = 55;                   //변수 초기화
		num2 = 2147483647;           // int형 변수 최대값
		num3 = 5;
		
		System.out.println(num1);
		
		result = num2 + num3;		 // +연산 결과값이 이미 범위 초과 error
		System.out.println(result);  // long형 변수에 이미 error난 결과값을 저장
		
		num2 = 0x15;                 // 16진수 표기법
		System.out.println(num2);    // 21 (10진수) = 16 * 1 + 5
		
		num3 = 010;                  // 8진수 표기법
		System.out.println(num3);    // 8 (10진수) = 8 * 1 + 5
		
	}
}
