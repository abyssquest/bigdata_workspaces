package exam13;

class Self {
	private int num; // field
	
	Self() { // Constructor
		num = 5;
	}
	
	public static void makeSelf() {
		 Self self = new Self(); // 클래스 안에서 인스턴스 가능
		 self.useSelf(); // 메서드내 인스턴스화로 메모리 할당후 바로 접근이 가능
	}
	 
	public void useSelf() {
		System.out.println("num = " + num);
		Self self = new Self(); // 문제 없는 코딩
	}
}

public class SelfInstance {
	public static void main(String[] args) {
		Self.makeSelf();
		// static 메서드 > 메서드 내에서 인스턴스화
		// 참조변수 self 생성 > num 메모리 할당 > 생성자 num = 5 저장
		// 참조변수 self 통해 useSelf 메서드 작동
		// useSelf 메서드 내에서 또 self 생성??
	}
}