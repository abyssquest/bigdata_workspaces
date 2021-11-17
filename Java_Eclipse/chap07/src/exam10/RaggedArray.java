package exam10;

public class RaggedArray {
	public static void main(String[] args) {
		int[][] arr =	{	{0,1},
							{4,5,6},
							{8,9,10,11}	};

		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr[j].length; i++) {
				System.out.print(arr[j][i] +"\t");
			}
			System.out.println();
		}
	}
}