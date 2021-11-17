package exam03.modifier;

import exam03.protect.ParentClass;

class ChildClass extends ParentClass {
	// ChildClass() { super(); }
	// 자동 생성되는 생성자
	// 부모크래스 생성자 매개변수 0개 짜리가 없어서 호출을 못한다 - error
	
	public ChildClass(int n1, int n2, int n3, int n4) {
		super(n1, n2, n3, n4);
	}
	
	public void childMethod() {
		//System.out.println("num1 = " + num1); // 접근 불가 (private) : 다른 클래스에서는 접근 불가
		//System.out.println("num2 = " + num2); // 접근 불가 (default) : 다른 패키지에서는 접근 불가
		System.out.println("num3 = " + num3); // 접근 가능 (상속)
		System.out.println("num4 = " + num4);
	}
}

public class FieldInitInheritance {
	public static void main(String[] args) {
		ChildClass child = new ChildClass(1, 2, 3, 4);
		child.childMethod();
	}
}