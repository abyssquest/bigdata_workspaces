package exam13;

public class OuterClassTwo {
		
	OuterClassTwo(){
		
	}
	
	private static class NestedClass {
		public void simpleMethod() {
			System.out.println("NestedClasss => simpleMethod() 호출 ...");
		}
	}
}
