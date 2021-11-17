package quiz10;

class Buyer { // 구매자(Object)

	// field(속성)
	String nameBuyer;	// 구매자
	int buyerMoney;		// 잔고
	int numOfApple;		// 구입한 사과 갯수
	
	Buyer(String nameBuyer, int buyerMoney) { // 생성자(Conductor)
		this.nameBuyer = nameBuyer;
		this.buyerMoney = buyerMoney;
		this.numOfApple = 0;
	}
	
	// 메서드 - 구매
	public void buyApple(Mart Martname, int money) {
		numOfApple += Martname.sellApple(money);
		buyerMoney -= money;
	}
	
	// 메서드 - 가계부 정산
	public void showBuyer() {
		System.out.println(nameBuyer + "이/가 구매한 사과 갯수 : " + numOfApple);
		System.out.println(nameBuyer + " 잔고 : " + buyerMoney);
	}
}