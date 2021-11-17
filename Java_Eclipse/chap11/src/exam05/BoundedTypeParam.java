package exam05;

/* abstract class */interface SimpleInterface{
	/*public abstract*/ void showYourName();
}

class UpperClass{
	public void showYourAncestor() {
		System.out.println("UpperClasss");
	}
}

class AAA extends UpperClass implements SimpleInterface {

	@Override
	public void showYourName() {
		System.out.println("Class AAA");
	}
}

class BBB extends UpperClass implements SimpleInterface {

	@Override
	public void showYourName() {
		System.out.println("Class BBB");
	}
}

public class BoundedTypeParam {
	public static void main(String[] args) {
		UpperClass upper = new UpperClass();
		AAA a = new AAA();
		BBB b = new BBB();
		
		//showInstanceAncestor(upper);
		showInstanceAncestor(a);
		showInstanceAncestor(b);
		
		showInstanceName(upper);
		showInstanceName(a);
		showInstanceName(b);
	}
	
	public static <T extends SimpleInterface> void showInstanceAncestor (T param) {
		param.showYourName();
	}
	
	public static <T extends UpperClass> void showInstanceName (T param) {
		param.showYourAncestor();
	}
}