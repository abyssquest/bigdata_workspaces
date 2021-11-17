package exam06;

import java.util.Scanner;

class AgeInputException extends Exception {
	AgeInputException() {
		super("유효하지 않은 나이를 입력하셨습니다.");
	}
}

public class ProgrammerDefineException {
	public static void main(String[] args) {
		try {
			int age = readAge();
			System.out.printf("당신의 나이는 %d이군요", age);
		} catch(AgeInputException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int readAge() throws AgeInputException {
		Scanner input = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		int age = input.nextInt();
		
		
		return age;
	}
}