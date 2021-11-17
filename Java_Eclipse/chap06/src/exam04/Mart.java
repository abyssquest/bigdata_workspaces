package exam04;

public class Mart { // 접근제어지시자(참조자료형) : (default), public
	
	// 접근제어지시자(필드&메서드) : private, (default), protected, public
	private String martName;	// 마트 이름
	int benefit;		// 이윤
	protected int numOfApple;		// 사과 재고
	public final int APPLE_PRICE; // 사과 단가 (상수)
	
	// 생성자 Conductor // 접근제어지시자(참조자료형) : (default), public
	public Mart (String martName, int benefit, int numOfApple, int price) {
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