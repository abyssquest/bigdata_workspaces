package exam02;

class ParentClass {
	// ParentClass() {} // default 생성자
	
/*
	int num1;
	
	ParentClass(int num){
		this.num1 = num;
	}
	*/
	ParentClass(){
		System.out.println("ParentClass() 생성자 호출.");
	}
}

class ChildClass extends ParentClass {
	/*
	int num2;
	ChildClass(int num1, int num2){
		super(num1);
		this.num2 = num2;
	}*/
	
	
	ChildClass(){
		super();
	}
}

public class DefaultSuper {
	public static void main(String[] args) {
		
		ChildClass child = new ChildClass();

	}
}