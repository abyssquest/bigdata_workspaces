package quiz03;

public class Answer01 {
	public static void main(String[] args) {

		int n = 24;
		
		// 3차 해답 : -9 ~ -1 경우 때문에 수정
		double n1 = n;
		n1 = Math.floor(n1/10);
		
		switch((int)n1) {
		case 0:
			System.out.println("0이상 10미만의 수");
			break;
		case 1:
			System.out.println("10이상 20미만의 수");
			break;
		case 2:
			System.out.println("20이상 30미만의 수");
			break;
		default:
			System.out.println("음수 혹은 30이상의 수");
			break;
		}
		
		/* 2차 해답 - 노가다 제거
		switch(n) {
		case 0:
			System.out.println("0이상 10미만의 수");
			break;
		case 1:
			System.out.println("10이상 20미만의 수");
			break;
		case 2:
			System.out.println("20이상 30미만의 수");
			break;
		default:
			System.out.println("음수 혹은 30이상의 수");
			break;
		}		
		*/
		
		/* 1차 해답 - 노가다
		switch (n) {
		case 0: case 1:	case 2:	case 3:	case 4:
		case 5:	case 6:	case 7:	case 8:	case 9:
			System.out.println("0이상 10미만의 수");
			break;
		case 10: case 11: case 12: case 13: case 14:
		case 15: case 16: case 17: case 18: case 19:
			System.out.println("10이상 20미만의 수");
			break;
		case 20: case 21: case 22: case 23: case 24:
		case 25: case 26: case 27: case 28: case 29:
			System.out.println("20이상 30미만의 수");
			break;
		default:
			System.out.println("음수 혹은 30이상의 수");
			break;
		}
		*/
		
		/* 문제
		
		if (n >= 0 && n < 10)
			System.out.println("0이상 10미만의 수");
		else if (n >= 10 && n < 20)
			System.out.println("10이상 20미만의 수");
		else if (n >= 20 && n < 30)
			System.out.println("20이상 30미만의 수");
		else
			System.out.println("음수 혹은 30이상의 수");
		
		*/
	}
}