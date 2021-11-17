package exam07;

class Adder {
	public int add (int n1, int n2) { return n1 + n2; }
	public double add (double n1, double n2) {return n1 + n2; }
	public double add (int n1, double n2) {return n1 + n2; }
	public double add (double n1, int n2) {return n1 + n2; }
	public double add (double n1, int n2, int n3) { return n1 + n2 + n3; }
}

public class NoticeOverloading {
	public static void main(String[] args) {
		Adder adder = new Adder();
		int result1 = 0;
		double result2 = 0.0;
		
		result1 = adder.add(100, 200);
		System.out.println("100 + 200 = " + result1);
		
		result2 = adder.add(3.14, 5.45);
		System.out.println("3.14 + 5.45 = " + result2);
		
		result2 = adder.add(3, 5.45);
		System.out.println("3 + 5.45 = " + result2);
		
		result2 = adder.add(3.14, 5);
		System.out.println("3.14 + 5 = " + result2);
		
		result2 = adder.add(3.14, 5, 10);
		System.out.println("3.14 + 5 + 10 = " + result2);
	}
}