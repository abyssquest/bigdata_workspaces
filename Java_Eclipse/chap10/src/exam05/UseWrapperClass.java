package exam05;

public class UseWrapperClass {
	public static void main(String[] args) {
		// int num = 10;
		Integer intInst = new Integer(10);
		Double doubleDouble = new Double(3.14);
	}
	
	public static void showData(Object obj) { // 자바 5버전 이상
		System.out.println(obj);
	}
}