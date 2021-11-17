package exam10;

import java.util.Random;

public class RandomNumberGenerator {
	public static void main(String[] args) {
		Random random = new Random();
		
		// 1 ~ 100 사이의 무작위 정수 값
		int num = random.nextInt(100) + 1;
		System.out.println("1 ~ 100 사이의 무작위 정수 값 : " + num);
		
		// 실수 값 출력
		double d = random.nextDouble();
		System.out.println("0.0 ~ 1.0 사이의 무작위 실수 값 : " + d);
		
		boolean b = random.nextBoolean();
		System.out.println("임의의 논리 값 : " + b);
	}
}