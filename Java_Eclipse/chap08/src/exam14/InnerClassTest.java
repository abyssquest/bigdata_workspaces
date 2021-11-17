package exam14;

public class InnerClassTest {

	public static void main(String[] args) {
		OuterClass outer1 = new OuterClass("First");
		OuterClass outer2 = new OuterClass("Second");
		
		outer1.whoAreYou();
		
		OuterClass.InnerClass inner1 = outer1.new InnerClass();
		OuterClass.InnerClass inner2 = outer1.new InnerClass();
		// inner1,2는 outer1에만 접근이 가능
		
		OuterClass.InnerClass inner3 = outer2.new InnerClass();
		OuterClass.InnerClass inner4 = outer2.new InnerClass();
		// inner3,4는 outer2에만 접근이   가능
		// inner3,4는 outer1에는 접근이 불가능
	}
}
