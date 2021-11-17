package exam09;

/* final */class Person /* extends Object */ {
	// final 은 클래스가 부모클래스가 되는걸 허용하지 않는다
	// extends Object 는 자바 프로그램이 컴파일할때 자동적으로 붙이는것
	
	private String name;
	
	Person(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		String msg = this.name + "님 환영합니다.";
		return msg;
	}
	
	final public void displayName() { // final method 예시 : method overriding 이 안된다
		System.out.println("이름 : " + name);
	}
	
}

// final class 가 상속 되지 않는다는 예시
class ChildClass extends Person {
	ChildClass(String name){
		super(name);
	}
	
	// public void displayName() {} :  final method 예시 : method overriding 이 안된다
}

public class UseObject {
	public static void main(String[] args) {
		Person person = new Person("홍길동");
		
		System.out.println(person);
		// println(Object x);
		// Object x = person; : 다형성
		
	}
}