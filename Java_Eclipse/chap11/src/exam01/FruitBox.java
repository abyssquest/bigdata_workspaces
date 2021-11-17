package exam01;

public class FruitBox {
	public static void main(String[] args) {
		Orange orange = new Orange(10);
		OrangeBox orangeBox = new OrangeBox();
		
		orangeBox.store(orange); // 오렌지 포장
		
		Orange resultOrange = orangeBox.pullOut(); // 오렌지 개봉
		resultOrange.showSugarContent();
		
		System.out.println("\n======================\n");
		
		Apple apple = new Apple(500);
		AppleBox appleBox = new AppleBox();
		
		appleBox.store(apple); // 사과 포장
		
		Apple resultApple = appleBox.pullout(); // 사과 개봉
		resultApple.showAppleWeight();
		
		// appleBox.store("사과");
		// appleBox.store(orange);
		
	}
}