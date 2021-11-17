package basic;

public class Array_MultiDemension {

	public static void main(String[] args) {
		int[][][] intArray = { { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } },
				{ { 13, 14, 15, 16 }, { 17, 18, 19, 20 }, { 21, 22, 23, 24 } } };
		
		for(int a = 0; a < intArray.length; a++) {
			for(int b = 0; b < intArray[a].length; b++) {
				for(int c = 0; c < intArray[a][b].length; c++) {
					System.out.print(intArray[a][b][c]);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("프로그램 끝");
	}

}
