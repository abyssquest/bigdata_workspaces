package exam02;

public class ObjectEquals {
	public static void main(String[] args) {
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(20);
		IntNumber num3 = new IntNumber(10);
		
		if(num1.num == num2.num) System.out.println("같다");
		else System.out.println("다르다");
		
		if(num1.equals(num2)) System.out.println("같다");
		else System.out.println("다르다");
		
		if(num1.num == num3.num) System.out.println("같다");
		else System.out.println("다르다");
		
		if(num1.equals(num3)) System.out.println("같다");
		else System.out.println("다르다");
	}
}
