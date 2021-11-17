package exam15;

public class LocalClassTest {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass("First");
		
		Readable local = outer.createLocalClassInst(10);
		
		local.read();
		
		
	}
}