package exam07;

class A extends Object {}

class B extends Object {
	public void method() {
		A a = new A();
		try {
//			public final void wait(long timeout) throws InterruptedException{}
			a.wait(1000);
		} catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
	}
}

public class UseException {
	public static void main(String[] args) {
		
	}
}