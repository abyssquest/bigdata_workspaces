package test;

import exam04.Buyer;
import exam04.Mart;

public class AppleMain {

	public static void main(String[] args) {
		Mart Emart = new Mart("e-mart", 0, 1000, 1000);
		Buyer mom = new Buyer("어머니",100000);
		Mart Homeplus = new Mart("홈플러스", 0, 2000, 1000);
		
		// 오전 어머니 e-mart에서 사과 5000원 어치 구매
		mom.buyApple(Emart, 5000);
		
		Emart.showMart();
		mom.showBuyer();
		System.out.println();
		
		// 오후 어머니 e-mart에서 사과 10000원 어치 구매
		mom.buyApple(Emart, 7000);
		
		Emart.showMart();
		mom.showBuyer();
		System.out.println();
		
		mom.buyApple(Homeplus, 3000);

		Homeplus.showMart();
		mom.showBuyer();
		System.out.println();
	}
}