package exam01;

/*
컴퓨터는 CPU + 메모리로 구성
CPU는 빠른 연산을 위해서 설계되어있다.
CPU는 메모리를 통해서만 데이터를 읽어와 연산을 한다.
따라서 사람은 메모리에 데이터를 저장해서 CPU에게 데이터를 전달한다.

데이터의 일정부분을 할당받아 그곳에 데이터를 저장한다.
할당받은 데이터를 찾는 접근 방법으로 변수를 부여(선언)한다.
변수를 부여(선언)함으로서 저장된 데이터를 교체할 수 있기 때문에
변하는 수라고 "변수"라 이름 붙여짐

메모리에 데이터를 저장하고 저장한 데이터에 접근하기 위한 방법으로 변수를 쓴다
변수는 데이터 저장을 위한 메모리 공간의 할당 방법
변수는 메모리 공간의 접근(저장/참조) 방법
 */

public class DefineVariable {
	
	public static void main(String[] args) {
		
		// 5489 + 9575 = ?
		
		System.out.println(5489 + 9575);
		
		int data1;                  // (1) 메모리 할당 요청 / 변수 선언
		int data2;
		int data3;
		/* 변수 이름 짓기 규칙 */
		// int int;         // error 변수 선언시 키워드 불가능
		// int 1data;       // error 변수 선언시 숫자로 시작 불가능
		int data_10;        // _ 가능
		int data$100;       // $ 가능 but 개발자 말고 자바가 쓰려고 놔둔거
		// int data 1000;   // error 변수 선언시 공백 불가능
		
		data_10 = 2345;
		data$100 = 8243;
		System.out.println(data$100 - data_10);
		
		/*
		변수 선언시 권고 사항
		모두 대문자 피할 것
		생략형 피할 것
		카멜 / 파스칼 /헝가리언 표기법 사용 권장
		*/
		
		data1 = 5489;               // (2) 데이터 저장 (메모리 접근 방법)
		data2 = 9575;
		data3 = 4689;
		
		System.out.println(data1);  // (3) 데이터 읽어 오기 (메모리 접근)
		System.out.println(data2);
		System.out.println(data3);
		
		System.out.println(data1 + data2); // (4) 데이터를 읽어와 연산하기
		System.out.println(data1 + data3);
		System.out.println(data2 + data3);
		
		// 8974 - 7548 = ?
		
		data1 = 8974;  // 변수 재사용
		data2 = 7548;
		
		System.out.println(data1 - data2);
		System.out.println(data1 + " - " + data2 + " = " + (data1 - data2));
		
	}
}