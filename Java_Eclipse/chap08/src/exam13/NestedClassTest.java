package exam13;

public class NestedClassTest {
	public static void main(String[] args) {
		OuterClassOne one = new OuterClassOne();
		OuterClassOne two = new OuterClassOne();
		
		one.whoAreYou();
		// one.simpleMethod(); - error
		one.nst.simpleMethod();
		
		OuterClassOne.NestedClass nst1 = new OuterClassOne.NestedClass();
		nst1.simpleMethod();
		
		// OuterClassTwo.NestedClass nst2 = new OuterClassTwo.NestedClass(); - error : private class
		
	}
}
