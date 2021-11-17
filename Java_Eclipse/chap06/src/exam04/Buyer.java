package exam04;

public class Buyer { // 구매자(Object)

	// field(속성)
	// 접근제어지시자 : private, (default), protected, public
	private String nameBuyer;	// 구매자
	private int buyerMoney;		// 잔고
	private int numOfApple;		// 구입한 사과 갯수
	
	public Buyer(String nameBuyer, int buyerMoney) { // 생성자(Conductor)
		this.nameBuyer = nameBuyer;
		this.buyerMoney = buyerMoney;
		this.numOfApple = 0;
	}
	
	// 메서드 - 구매
	public void buyApple(Mart classMartname, int money) {
		numOfApple += classMartname.sellApple(money);
		buyerMoney -= money;
	}
	
	// 메서드 - 가계부 정산
	public void showBuyer() {
		System.out.println(nameBuyer + "이/가 구매한 사과 갯수 : " + numOfApple);
		System.out.println(nameBuyer + " 잔고 : " + buyerMoney);
	}
}