package exam14;

class Friend /* extends Object */ {
	private String name;
	
	Friend(String name){
		this.name = name;
	}
	
	public String toString() {
		String msg;
		msg = "제 이름은 " + name + "입니다";
		return msg;
	}
}

public class StringToString {
	public static void main(String[] args) {
		Friend friend1 = new Friend("홍길동");
		Friend friend2 = new Friend("이순신");
		
		System.out.println(friend1);
		System.out.println(friend2);
	}
}
