package quiz10;

public class Quiz10Main {
	public static void main(String[] args) {

		Buyer[] buyer = new Buyer[3];
		buyer[0] = new Buyer("철수", 10000); // 철수 가진 돈 : 10,000원
		buyer[1] = new Buyer("영희", 30000); // 영희 가진 돈 : 30,000원
		buyer[2] = new Buyer("미애", 50000); // 미애 가진 돈 : 50,000원

		Mart[] mart = new Mart[2];
		mart[0] = new Mart("이마트", 0, 100, 1000); // 이마트 : 개당 사과 가격 1,000원, 100개의 사과
		mart[1] = new Mart("홈플러스", 0, 50, 2000); // 홈플러스 : 개당 사과 가격 2,000원, 50개의 사과

		// 철수 구매 활동
		buyer[0].buyApple(mart[0], 5000); // 이마트에서 5,000원
		buyer[0].buyApple(mart[1], 2000); // 홈플러스에서 2,000원

		// 영희는 구매 활동
		buyer[1].buyApple(mart[0], 8000); // 이마트에서 8,000원
		buyer[1].buyApple(mart[1], 12000); // 홈플러스에서 12,000원

		// 미애는 구매 활동
		buyer[2].buyApple(mart[0], 20000); // 이마트에서 20,000원
		buyer[2].buyApple(mart[1], 10000); // 홈플러스에서 10,000원

		// 마트 정산
		mart[0].showMart();
		mart[1].showMart();
		System.out.println();

		// 구매자 정산
		buyer[0].showBuyer();
		buyer[1].showBuyer();
		buyer[2].showBuyer();
	}
}