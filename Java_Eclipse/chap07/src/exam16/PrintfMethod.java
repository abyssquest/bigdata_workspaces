package exam16;

public class PrintfMethod {
	public static void main(String[] args) {
		int age = 20;
		double tall = 184.3;
		String name = "홍길동";
		
		System.out.println("제 이름은 " + name + "입니다.");
		System.out.println();
		
		System.out.printf("제 이름은 %s입니다.\n", name);
		System.out.printf("제 나이는 %d살이고, 키는 %.1f입니다.\n", age, tall);
		
		System.out.printf("%d, 0%o, 0x%x\n", 77, 77, 77);
		
		System.out.printf("%e,\n",0.000000000000005632);
		System.out.printf("%g,\n",0.000000000000005632);
		
		System.out.printf("%g, %g\n", 0.00014, 0.000014); // 소숫점 이하 5자리 6자리 차이
	}
}
