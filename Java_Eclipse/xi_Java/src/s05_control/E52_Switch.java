package s05_control;

public class E52_Switch {
	public static void main(String[] args) {
		// switch (var) { case var:cond act; break; default: act; break; }

		// switch 예시 1
		int num = 2;
		switch (num) {
		case 1:
			System.out.println("정수의 값은 1이에요.");
			System.out.println("Good Morning, Java~");
			break;
		case 2:
			System.out.println("정수의 값은 2이에요");
			System.out.println("Good Afternoon, Java!!!");
			break;
		case 3:
			System.out.println("정수의 값은 3이에요");
			System.out.println("Good Evening, Java!!!");
			break;
		default: // default는 꼭 맨 아래일 필요가 없다
			System.out.println("정수의 값은 1~3이외의 값이에요");
			System.out.println("Hello, Java!!!");
			break;
		}
		System.out.println("switch 예문 1 종료\n");

		// switch 예문 2 - break 유무에 따른 동작
		num = 1;
		switch (num) {
		case 1:
			System.out.println("정수의 값은 1이에요.");
			System.out.println("Good Morning, Java~");
		case 2:
			System.out.println("정수의 값은 2이에요");
			System.out.println("Good Afternoon, Java!!!");
			break;
		case 3:
			System.out.println("정수의 값은 3이에요");
			System.out.println("Good Evening, Java!!!");
			break;
		default: // default는 꼭 맨 아래일 필요가 없다
			System.out.println("정수의 값은 1~3이외의 값이에요");
			System.out.println("Hello, Java!!!");
			break;
		}
		System.out.println("switch 예문 2 break 역할 알기 종료\n");
		
		// switch 예시 3 - 문자열과 break 응용
		String name = "김유신";
		switch (name) { // java 7 ver 이후 - 문자(char) 문자열(String)도 작동
		case "홍길동":
		case "세종대왕":
		case "김유신": // 같은 명령문 실행할 경우 모아서 처리
			System.out.println("제 이름은 " + name + "입니다.");
			break;
		default:
			System.out.println("이름을 알 수 없습니다");
			break;
		}
		System.out.println("switch 예문 3 문자열과 break 응용 종료\n");
		System.out.println("프로그램 종료...");
	}
}