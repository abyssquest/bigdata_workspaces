package exam03;

public class GenericBaseFruitBox {
	public static void main(String[] args) {
		Orange orange = new Orange(7);
		Apple apple = new Apple(700);
		
		FruitBox<Orange> orangeBox = new FruitBox<Orange>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		
		orangeBox.store(orange);
		// orangeBox.store(apple);
		// orangeBox.store("사과");
		Orange resultOrange = orangeBox.pullout();
		resultOrange.showSugarContent();
		
		appleBox.store(apple);
		// appleBox.store(orange);
		// appleBox.store("사과");
		Apple resultApple = appleBox.pullout();
		resultApple.showAppleWeight();
	}
}