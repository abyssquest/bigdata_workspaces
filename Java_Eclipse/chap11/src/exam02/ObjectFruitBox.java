package exam02;

public class ObjectFruitBox {
	public static void main(String[] args) {
		Orange orange = new Orange(10);
		Apple apple = new Apple(500);
		
		FruitBox orangeBox = new FruitBox();
		FruitBox appleBox = new FruitBox();
		
		orangeBox.store(orange);
		Orange resultOrange = (Orange) orangeBox.pullout();
		resultOrange.showSugarContent();
		
		appleBox.store(apple);
		Apple resultApple = (Apple) appleBox.pullout();
		resultApple.showAppleWeight();
		
		appleBox.store("사과");
	}
}
