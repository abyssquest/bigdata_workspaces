package exam11;

public class ThreeDimenArray { // 3차원(이상) 배열 > 다차원 배열
	public static void main(String[] args) {
		int[][][] threeDimenArray = new int[2][3][4]; // 2면 3행 4열
		
		int num = 0;
		
		for(int i = 0; i < threeDimenArray.length; i++) {
			for(int j = 0; j < threeDimenArray[i].length; j++) {
				for(int k = 0; k < threeDimenArray[i][j].length; k++) {
					threeDimenArray[i][j][k] = num++;
				}
			}
		}
		
		for(int i = 0; i < threeDimenArray.length; i++) {
			for(int j = 0; j < threeDimenArray[i].length; j++) {
				for(int k = 0; k < threeDimenArray[i][j].length; k++) {
					System.out.println("[" + i + "]" + "[" + j + "]" + "[" + k + "] = " + threeDimenArray[i][j][k]);
				}
			}
		}
	}
}