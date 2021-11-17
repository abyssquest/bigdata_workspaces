package s02_data_basic;

public class VarData06_ConstantLiteral {
	public static void main(String[] args) {
		
		/*
		
		변수 : 메모리에 저장된 data 값을 바꿀 수 있다
		상수 : 메모리에 저장된 data 값을 바꿀 수 없다
		
		메모리 주소에 변수가 지정되면
		개발자는 변수를 통해서 메모리에 접근할 수 있기 때문에
		메모리에 저장된 data를 변화시키고 재사용, 참조할 수 있다
		
		상수가 지정된 메모리 주소의 data는 변화시킬 수 없고
		변수, 상수가 지정안된 data는 변화시킬 수 없다 
		 
		*/
		
		// 상수 지정 방법 : 변수 데이터 할당 요청시 앞에 final 붙임
		
		final double PI = 3.141592; // 상수 선언 (상수 이므로 대문자로 표시 권장)
		// PI = 3.14; // 상수값 변경시 error 발생
		System.out.println(PI + "\n");
		
		
		/* literal : 소스상에서 직접 입력된 값
		
		제어문자 : \다음에 하나의 문자를 추가해서 특별한 의미를 부여한 문자
		\n : 줄바꿈
		\t : 탭
		\\ : \
		\' : '
		\" : "
		
		*/
		
		System.out.println("이런들 어떠하리 저런들 어떠하리\n"
				+ "만수산 드렁칡이 얽혀진들 어떠하리\n"
				+ "우리도 이같이 얽혀져 백 년까지 누리리라\n");
		System.out.println("탭\t탭\t탭\t탭\n");
		System.out.println("이몸이 죽고 죽어 일백번 고쳐죽어\n"
				+ "백골이 진토되어 넋이라도 있고 없고\n"
				+ "임향한 일편단심이야 가실줄이 있으랴\n");
		System.out.println("\"It\'s very hot. I wannna going to swim.\"\n");
		System.out.println("\\/\\/\\/\\/\\/\t\\/\\/\\/\\/\\/\t\\/\\/\\/\\/\\/");
		
	}
}