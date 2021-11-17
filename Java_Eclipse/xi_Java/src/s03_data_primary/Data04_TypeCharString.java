package s03_data_primary;

public class Data04_TypeCharString {
	public static void main(String[] args) {

		/*
		
		- 문자 (기본은 공백 : \u0000)
			char    : 2 Byte 할당
					: ' '로 지정
					: 숫자(정수)로 저장했다가 유니코드 문자표에서 찾아서 불러온다
					: 범위 0 ~ 65,535
					: 정수형 2Byte로 저장됬기 때문에 int, long, float, double로 자동형변환
					
		- 문자열
			String  : S가 대문자로 시작함을 명심
					: " "로 지정
					
		*/
		
		char alphabet, hangeul; // character
		int unicode;
		
		alphabet = 'A';
		unicode = alphabet; // char형은 2byte의 정수이기 때문에 int형으로 자동형변환
		System.out.println(alphabet);
		System.out.println(unicode); // A가 지정된 정수가 출력
		
		alphabet = 'B';
		unicode = alphabet;
		System.out.println(alphabet);
		System.out.println(unicode);
		
		alphabet = 'Z';
		unicode = alphabet;
		System.out.println(alphabet);
		System.out.println(unicode);
		
		hangeul = '한';
		unicode = hangeul;
		System.out.println(hangeul);
		System.out.println(unicode);
		
		hangeul = '국';
		unicode = hangeul;
		System.out.println(hangeul);
		System.out.println(unicode);
		
		String hello = "안녕하세요?";
		String name = "홍길동";
		
		System.out.println(hello);
		System.out.println(name);
		
	}
}