package zdemo;
//chap05 정리후 남음
public class LocalVariable {
	public static void main(String[] args) {
		boolean scope = true;
		int result = 0;
		
		result = simple(1024);
		
		System.out.println(result);
		
		if (scope) {
			int num = 1;
			num++;
			System.out.println(num);
		} else {
			int num = 7;
			num++;
			System.out.println(num);
		}
	}
	
	public static int simple(int num) {
		int result = num * num;
		
		// System.out.println(result);
		
		return result;
	}
}