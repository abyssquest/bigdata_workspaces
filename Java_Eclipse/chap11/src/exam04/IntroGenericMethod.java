package exam04;

class FatherClass{
	@Override
	public String toString() {
		return "class FatherClass";
	}
	
}

class ChildClass{
	@Override
	public String toString() {
		return "class ChildClass";
	}
}

class InstanceTypeShower{
	int showCnt;
	
	InstanceTypeShower(){ showCnt = 0;}
	
	public <T> void showInstType(T inst) {
		showCnt++;
		System.out.println(inst);
	}
	
	public <T, U> void showMultiInstType(T inst1, U inst2) {
		showCnt++;
		System.out.println(inst1);
		System.out.println(inst2);
	}
	
	public void showPrintCnt() {
		System.out.println("호출 횟수 : " + showCnt);
	}
}

public class IntroGenericMethod {
	public static void main(String[] args) {
		FatherClass father = new FatherClass();
		ChildClass child = new ChildClass();
		
		InstanceTypeShower shower = new InstanceTypeShower();
		
		// shower.<FatherClass>showInstType(father);
		shower.showInstType(father); // 생략도 가능
		// shower.<FatherClass>showInstType(child); // error
		shower.showPrintCnt();
		
		shower.<ChildClass>showInstType(child);
		shower.showPrintCnt();

		shower.<FatherClass, ChildClass>showMultiInstType(father, child);
		// shower.<FatherClass, ChildClass>showMultiInstType(child, father);
		shower.showPrintCnt();
	}
}