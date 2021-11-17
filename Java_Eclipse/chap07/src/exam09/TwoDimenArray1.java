package exam09;

public class TwoDimenArray1 {
	public static void main(String[] args) {
		// 1차원 배열 : 벡터
		// 2차원 배열 : 메트릭스
		
		int[][] arr = new int[3][4]; // 2차원 배열
		// int arr[][] = new int[3][4]
		// int[] arr[] = new int[3][4]
		
		arr[0][0] = 0;
		arr[0][1] = 1;
		arr[0][2] = 2;
		arr[0][3] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		arr[1][3] = 7;
		
		arr[2][0] = 8;
		arr[2][1] = 9;
		arr[2][2] = 10;
		arr[2][3] = 11;
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < arr[j].length; i++) {
				System.out.print(arr[j][i] +"\t");
			}
			System.out.println();
		}
	}
}
