package exam01;

public class StringInstance {
	public static void main(String[] args) {
		String hello = new String("안녕하세요, 여러분!!!");
		
		String name1 = new String("홍길동");
		String name2 = new String("홍길동");
		
		int length = 0;
		length = hello.length();
		System.out.println(length);
		
		String name3 = "홍길동";
		String name4 = "홍길동";
		
		System.out.println(hello);
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		
		if (name1 == name2) System.out.println("동일 인스턴스 참조");
		else System.out.println("다른 인스턴스 참조");

		if (name2 == name3) System.out.println("동일 인스턴스 참조");
		else System.out.println("다른 인스턴스 참조");

		if (name3 == name4) System.out.println("동일 인스턴스 참조");
		else System.out.println("다른 인스턴스 참조");

		length = "Hello, Java World".length();
		System.out.println(length);
	}
}