package s02_data_basic;

public class Data01_Variable {
	
	// 컴 퓨 터	: 사람이 연산을 대신 시키려고 만든 장치
	// 컴 퓨 터	= CPU + Memory
	//  C P U	: 연산 전문 부분
	//  Memory	: 연산에 넣을 데이터 저장 부분
	
	/* 연산 과정 */
	//	1. 메모리 공간에 데이터 저장 by 운영체제
	//	2. 연산해라 실행문 작동
	//	3. 운영체제가 CPU에 연산할 데이터가 있는 메모리 공간 주소 전달
	//	4. 메모리 공간 주소의 data가 CPU에 전달
	//	5. CPU 연산 - 결과값을 내어놓는다
	
	/* 사람이 원하는 것 = 데이터 관리, 메모리 관리 */
	
	/*	
	
	메모리는 1byte마다 메모리 주소가 존재
	메모리 공간이 너무 커져 일일히 관리 불가능
	개발자는 data를 관리할 메모리 공간을 할당받아 Variable(변수) 지정해 기억한다
	개발자는 Variable 통해 메모리 공간에 접근함으로서 메모리와 데이터를 관리할 수 있다.
	
	따라서 변수는 개발자가 할당된 메모리 공간에 접근할 수 있는 수단이자
	할당된 메모리 공간에 저장된 데이타에 접근할 수 있는 수단이다

	*/
	
	public static void main(String[] args) {
		
		int data1;
		// 1. 메모리 할당
		// 2.1. 할당된 메모리에 저장될 데이터 타입은 int형
		// 2.2. int형 : 4byte 공간, 정수 만 가능
		// 3. 메모리 공간에 지정된 변수 이름은 data1
		
		data1 = 5495;
		// data1이 지정된 데이터 공간에 저장될 데이터 초기값은 5495
		
		int data2 = 2754; // 데이터 할당 요청 + 데이터 초기값 설정 (동시에)
		
		// 메모리의 데이터 불러오기 (변수를 쓰면 변수가 지정된 메모리 주소의 데이터가 불러와짐)
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data1 + data2);
		System.out.println(data1 + " + " + data2 + " = " + (data1 + data2));
		System.out.println();
		
		// 변수 재사용 (기존 동일한 메모리 주소의 데이터가 교체)
		data1 = 8974; 
		data2 = 7548;
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data1 + data2);
		System.out.println(data1 + " + " + data2 + " = " + (data1 + data2));
		
	}
}