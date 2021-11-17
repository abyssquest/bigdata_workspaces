package exam06;

public class BoxingUnboxing {
	public static void main(String[] args) {
		Integer iValue = new Integer(10); // Boxing
		Double dValue = new Double(3.14); //Boxing
		
		int num1 = iValue.intValue(); // Unboxing
		double num2 = dValue.doubleValue(); // Unboxing
		
		System.out.println(num1);
		System.out.println(num2);
		
		num1 = iValue.intValue() + 10;
		iValue = new Integer(num1);
		
		System.out.println(iValue.intValue());

	}
}
