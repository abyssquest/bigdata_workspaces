package exam08;

import java.util.Scanner;

class AgeInputException extends Exception {
	AgeInputException() {
		super("유효하지 않은 나이를 입력하셨습니다.");
	}
}

public class ThrowsFromUpperMethod {
	public static void main(String[] args) {
		int age;
		try {
			
			age = callAge();
			System.out.printf("당신의 나이는 %d이군요.\n", age);
			
		}catch(AgeInputException e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}
	
	public static int callAge() throws AgeInputException {
		int age = readAge();;
		return age;
		
	}

	public static int readAge() throws AgeInputException {
		Scanner input = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		int age = input.nextInt();
		
		if(age < 0) {
			AgeInputException except = new AgeInputException();
			throw except; // catch문을 호출하는 기능
		}
		return age;
	}
}
