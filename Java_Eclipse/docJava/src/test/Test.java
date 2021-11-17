package test;

public class Test {
	public static void main(String[] args) {
		String str1 = "세종대왕";
		String str2 = "세종대왕";
		
		if (str1 == str2)	System.out.println("같은 메모리 영역 참조");
		else				System.out.println("다른 메모리 영역 참조");
		System.out.println();
		
		str2 = "이순신";
		if (str1 == str2)	System.out.println("같은 메모리 영역 참조");
		else				System.out.println("다른 메모리 영역 참조");
		System.out.println();

		Friend fr1 = new Friend("이순신");
		Friend fr2 = new Friend("김유신");
		System.out.println(fr1);
		System.out.println(fr2);
	}
}

class Friend {
	String name;
	
	Friend (String name){
		this.name = name;
	}
}
