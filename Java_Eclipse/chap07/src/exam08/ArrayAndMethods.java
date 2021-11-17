package exam08;

public class ArrayAndMethods {

	public static void main(String[] args) {
		int num = 5;
		int[] arr = {1, 2, 3, 4, 5};
		int[] ref = null;
		
		ref = addAllArray(arr, num);
		
		System.out.println(num);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i = 0; i < ref.length; i++) {
			System.out.println(arr[i]);
		}
		
		if (arr == ref)	System.out.println("같은 메모리 영역 참조");
		else			System.out.println("다른 메모리 영역 참조");
		
	}
	
	public static int[] addAllArray(int[] a, int n) {
		n = 10; // 새로운 값 대입
		
		for (int i = 0; i < a.length; i++) {
			a[i] += 10;
		}
		
		return a;
	}
}
