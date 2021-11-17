package quiz10;

class Mart { // 판매자(Object)
	
	// field(속성)
	String martName;	// 마트 이름
	int benefit;		// 이윤
	int numOfApple;		// 사과 재고
	final int APPLE_PRICE; // 사과 단가 (상수)
	
	// 생성자 Conductor
	Mart (String martName, int benefit, int numOfApple, int price) {
		this.martName = martName;
		this.benefit = benefit;
		this.numOfApple = numOfApple;
		this.APPLE_PRICE = price;
	}
	
	// 메서드 - 판매
	public int sellApple (int money) {
		int num = 0;
		
		num = money / APPLE_PRICE;
		
		benefit += money;
		numOfApple -= num;
		
		return num;
	}
	
	// 메서드 - 정산
	public void showMart() {
		System.out.println(martName + " 이윤 : " + benefit);
		System.out.println(martName + " 재고 : " + numOfApple);
	}
}