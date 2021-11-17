package exam04;

class IntWrapper {
	private int num;
	
	IntWrapper(int num) { this.num = num; }

	@Override
	public String toString() {
		return "" + num;
	}
	
	
}

public class WrappingInteger {
	public static void main(String[] args) {
		// int num = 10;
		IntWrapper intWrapper = new IntWrapper(10);
		
		// showData(num); // 왜 기본자료형은 상속되지 않는데 작동할까
		showData(intWrapper);
	}

	/*
	public static void showData(int n) { // 자바 4버전 이하
		System.out.println(n);
	}
	*/
	
							 // Object obj = new Integer(10);
	public static void showData(Object obj) { // 자바 5버전 이상
		System.out.println(obj);
	}
}