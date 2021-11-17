package exam05;

class Computer {}
class Notebook extends Computer {}
class TabletPC extends Notebook {}

public class ReferenceVariableUse {
	public static void main(String[] args) {
		Computer computer1 = new Computer();
		Notebook computer2 = new Notebook();
		TabletPC computer3 = new TabletPC();
		
		// 다형성 : 상속의 관계하에서 자식의 인스턴스를 부모의 참조변수로 바라볼 수 있다.
		Computer computer4 = new Notebook();
		Notebook computer5 = new TabletPC();
		Computer computer6 = new TabletPC();
		
		// Notebook computer7 = new Computer(); // error
		// TabletPC computer7 = new Computer(); // error
		
		TabletPC computer9 = new TabletPC();
		TabletPC computer10 = computer9;
		
		Notebook computer11 = computer9;
		Computer computer12 = computer9; // 다형성의 연장선상
		
		// Notebook computer13 = computer12; // error
	}
}