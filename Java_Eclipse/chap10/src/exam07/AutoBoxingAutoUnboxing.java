package exam07;

// import java.lang.*;

public class AutoBoxingAutoUnboxing {
	public static void main(String[] args) {
		String name = "홍길동"; // new String("홍길동");
		Integer iValue = 10; // new Integer(10); -> Auto Boxing 5버전부터
		Double dValue = 3.14; // new Double(3.14); Auto Boxing
		
		System.out.println(iValue); // Auto Unboxing
		System.out.println(dValue); // Auto Unboxing
		
		int num1 = iValue; // Auto Unboxing
		System.out.println(num1);
		
		iValue++;	// 1. iValue.intValue();
					// 2. 10 += 1;
					// 3. iValue = 11; // Integer iValue = new Integer(11);
		System.out.println(iValue);
	}
}
