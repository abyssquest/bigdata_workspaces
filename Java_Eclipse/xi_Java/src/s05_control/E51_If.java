package s05_control;

public class E51_If { // if + else if + ... + else
	public static void main(String[] args) {

		// if (bool) {act} - 예시 1
		int result = 0, num1 = 63, num2 = 46;
		result = (num1 * num1 * num2 * num2) / (num1 - num2);
		if (result >= 200000) {
			System.out.println("실행 결과 값이 200000 이상입니다.");
			System.out.println("결과값 : " + result);
		}
		System.out.println("If 예문 종료...\n");

		// if (bool) {act} - 예시 2
		num1 = 27;
		num2 = 18;
		result = (num1 * num1 * num2 * num2) / (num1 - num2);
		if (result >= 200000) {
			System.out.println("실행 결과 값이 200000 이상입니다.");
			System.out.println("결과값 : " + result);
		}
		System.out.println("If 예문 종료...\n");

		// if (bool) {act} else {} - 예시 1
		num1 = 76;
		if (num1 % 2 == 0) {
			System.out.println(num1 + "이 짝수입니다.");
		} else {
			System.out.println(num1 + "이 홀수입니다.");
		}
		System.out.println("If + else 예문 종료...\n");

		// if (bool) {act} else {} - 예시 2
		num1 = 55;
		if (num1 % 2 == 0) {
			System.out.println(num1 + "이 짝수입니다.");
		} else {
			System.out.println(num1 + "이 홀수입니다.");
		}
		System.out.println("If + else 예문 종료...\n");

		// if (bool) {act} if else () {} else {} - 예시 1
		int hit = 80, miss = 90, attack = 75, defence = 80;
		if (hit < miss) {
			System.out.println("상대방이 공격을 회피했습니다");
		} else if (attack < defence) {
			System.out.println("상대방이 공격을 방어했습니다");
		} else {
			System.out.println("상대방이 데미지 " + (attack - defence) + "를 입었습니다");
		}
		System.out.println("if + else if + ... + else 예문 종료...\n");

		// if (bool) {act} if else () {} else {} - 예시 2
		hit = 90;
		miss = 80;
		if (hit < miss) {
			System.out.println("상대방이 공격을 회피했습니다");
		} else if (attack < defence) {
			System.out.println("상대방이 공격을 방어했습니다");
		} else {
			System.out.println("상대방이 데미지 "+ (attack - defence) + "를 입었습니다");
		}
		System.out.println("if + else if + ... + else 예문 종료...\n");
			
		// if (bool) {act} if else () {} else {} - 예시 3
		// {} 생략 : {}안의 실행문이 1줄만 존재할 경우 생략 가능
		System.out.println("{}의 생략 예시");
		attack = 90;
		if (hit < miss) System.out.println("상대방이 공격을 회피했습니다");
		else if (attack < defence) System.out.println("상대방이 공격을 방어했습니다");
		else System.out.println("상대방이 데미지 "+ (attack - defence) + "를 입었습니다");

		/*
		if (hit < miss) 
			System.out.println("상대방이 공격을 회피했습니다");
		else if (attack < defence)
			System.out.println("상대방이 공격을 방어했습니다");
		else
			System.out.println("상대방이 데미지 "+ (attack - defence) + "를 입었습니다");
		*/
		System.out.println("if + else if + ... + else 예문 종료...\n");
	}
}