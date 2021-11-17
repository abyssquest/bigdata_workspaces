package quiz04;

public class Answer01 {
	public static void main(String[] args) {

		// 이중 for - 요것만 제출
		for (int j = 1; j < 10; j++) {
			for (int i = 2; i < 10; i++) {
				System.out.print(i + " * " + j + " = " + (i * j) + "\t");
				}
			System.out.print("");
		}

		// method01
		System.out.println("");
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				multi(j, i);
			}
			System.out.print("\n");
		}

		// method02
		System.out.println("");
		multiprint(9);

	}

	public static void multi(int p1, int p2) {

		System.out.print(p1 + " * " + p2 + " = " + (p1 * p2) + "\t");
	}

	public static void multiprint(int max) {
		for (int i = 1; i <= max; i++) {
			for (int j = 2; j <= max; j++) {
				System.out.print(j + " * " + i + " = " + (j * i) + "\t");
			}
			System.out.print("\n");
		}
	}
}