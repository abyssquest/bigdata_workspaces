package exam16;

public class AnonymousClass {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass("First");
		
		Readable local = outer.createLocalClassInst(10);
		
		local.read();
	}
}
