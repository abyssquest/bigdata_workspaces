package exam09;

public class ConstructorOverloading {
	public static void main(String[] args) {
		Person chulsoo = new Person("철수", 20210727, 2000, 7, 27);
		Person younghee = new Person("영희", 2000, 7, 27);
		
		chulsoo.showInfo();
		younghee.showInfo();
	}
}