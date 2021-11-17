package exam09;

import java.util.Random;

public class RandomNumberGenerator {
	public static void main(String[] args) {
		Random random = new Random();
		
		// random.setSeed(777);
		random.setSeed(System.currentTimeMillis());
		
		for(int i = 0; i < 10; i++) {
			System.out.println(random.nextInt(100));
		}
	}
}
