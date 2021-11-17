package exam08;

public class ConstructorOverloading {
	public static void main(String[] args) {
		Person chulsoo = new Person("철수", 20210727);
		Person younghee = new Person("영희");
		
		chulsoo.showInfo();
		younghee.showInfo();
	}
}