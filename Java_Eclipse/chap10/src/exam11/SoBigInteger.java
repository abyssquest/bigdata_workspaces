package exam11;

import java.math.BigInteger;

public class SoBigInteger {
	public static void main(String[] args) {
		System.out.println("최대 정수 : " + Long.MAX_VALUE);
		System.out.println("최소 정수 : " + Long.MIN_VALUE);
		// Long num = 10000000000000000000L; // error
		// Long num = -9999999999999999999L; // error
		
		BigInteger bigValue1 = new BigInteger("10000000000000000000");
		BigInteger bigValue2 = new BigInteger("-9999999999999999999");

		BigInteger addResult = bigValue1.add(bigValue2);
		System.out.println("long형의 범위를 벗어난 큰 수의 덧셈 결과 : " + addResult);
		
		BigInteger mulResult = bigValue1.multiply(bigValue2);
		System.out.println("long형의 범위를 벗어난 큰 수의 곱셈 결과 : " + mulResult);
	}
}
