package exam04;

public class LogicOp {  // 논리연산자
	public static void main(String[] args) {
		
		Boolean X = false, Y = false;
		System.out.println(X + " && " + Y + " = " + (X && Y));
		System.out.println(X + " || " + Y + " = " + (X || Y));
		System.out.println("");
		
		X = false; Y = true;
		System.out.println(X + " && " + Y + " = " + (X && Y));
		System.out.println(X + " || " + Y + " = " + (X || Y));
		System.out.println("");
		
		X = true; Y = false;
		System.out.println(X + " && " + Y + " = " + (X && Y));
		System.out.println(X + " || " + Y + " = " + (X || Y));
		System.out.println("");
		
		X = true; Y = true;
		System.out.println(X + " && " + Y + " = " + (X && Y));
		System.out.println(X + " || " + Y + " = " + (X || Y));
		System.out.println("");
		
		System.out.println("!" + X + " = " + !X);
		
	}
}