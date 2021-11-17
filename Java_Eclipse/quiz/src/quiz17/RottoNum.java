package quiz17;

import java.util.Random;

class Rotto {
	private int choice;
	private int range;
	private int[] rottoNum;

	Rotto(int choice, int range) {
		this.choice = choice;
		this.range = range;
		rottoNum = new int[choice];
	}

	public void buyRottoRandom(int num) { // 무작위 뽑기 로또 대량 구매
		System.out.printf("로또 %d장을 구매하셨습니다.\n", num);
		System.out.println("로또 숫자를 무작위 추출합니다.");
		System.out.println();

		for (int i = 0; i < num; i++) {
			showRandomNum();
		}
	}

	public void showRandomNum() { // 로또 숫자 무작위 뽑기
		int indexRotto = 0;

		while (indexRotto < choice) {
			Random random = new Random();
			int num = random.nextInt(range) + 1;
			if (indexRotto != 0) {
				if (checkNum(num, indexRotto)) continue;
			}
			rottoNum[indexRotto++] = num;
		}

		for (int i = 0; i < choice; i++) {
			System.out.print(rottoNum[i] + "\t");
		}
		System.out.println("\n");
	}

	public boolean checkNum(int num, int indexRotto) { // 중복 숫자 판별
		boolean result = false;
		for (int i = 0; i < indexRotto; i++) {
			if (num == rottoNum[i]) result = true;
		}
		return result;
	}
}

public class RottoNum {
	public static void main(String[] args) {
		
		Rotto krRotto = new Rotto(6,45); // 1 ~ 45 중 6개 숫자 뽑는 로또 생성
		Rotto usRotto = new Rotto(10,72);
		
		krRotto.buyRottoRandom(3); // 한국 로또 1장 구매
		usRotto.buyRottoRandom(10);
	}
}

//(로또 번호 추출)
//1~45사이의 숫자를 무작위로 6개 추출 하는 프로그램을 작성하세요.
//(단, 중복된 숫자는 1번만 출력한다)