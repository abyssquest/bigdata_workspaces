package quiz08;

class NoAccessWay {
	static int num = 0;
	// 클래스 변수 : main 메소드에서 클래스타입이 보이기만 하면 할당되어 작동
	static int memVari = 0;
	// 참조변수로 찾아갈 수 있는 인스턴스내에서만 작동하는 변수
	// 였으나 noAccessWay 메소드 작동을 위해 static 추가
	
	NoAccessWay() {
		incrementCnt();
	}
	
	public static void incrementCnt() {
		num++;
	} // noAccessWay 메소드 작동을 위해 static 추가
	
	public static void noAccessWay() {
		memVari++;
		/*	
		static은 참조변수가 있든 없든 작동해야 하는데
		대상 데이터는 참조변수가 있어야만 찾아올 수 있기 때문에
		참조변수가 없는 경우에는 대상 데이터를 찾아올 수 없는 경우가 있을 것
		*/
		incrementCnt();
		/*
		이 메소드도 참조변수가 없는 경우에도 찾아가서 작동해야 하는데
		처음 코드엔 static이 없어 참조변수가 없는 경우엔 작동 못한다
		*/
	}
	
}

public class ClassVarNoAccess {
	public static void main(String[] args) {
		NoAccessWay.num = 5;
		// 클래스이름을 통해 static 변수, static 메서드 가 발견
		// static 변수는 num, (수정후)memVari : 메모리 할당, 초기값 0으로 설정
		// static 메서드 noAccessWay() 메모리 할당(메모리 크기는 java가 알아서 계산)
		// 대입연산으로 num에 5 저장
		
		NoAccessWay accessWay1 = null;
		accessWay1 = new NoAccessWay();
		// 처음 클래스 설정 -> 생성자 작동 -> incrementCnt() 작동 : num++ -> num = 6
		// static 변수는 이미 설정되있어서 새롭게 설정하지 않고 건너뛴다
		
		System.out.println(accessWay1.num); // 참조변수 accessWay1 통한 num 접근
		
		accessWay1.num++; // num = 7
		System.out.println(NoAccessWay.num); // 참조변수 accessWay1 통한 num 접근
		
		// System.out.println(NoAccessWay.num); // 클래스이름 통한 num 접근
		
		NoAccessWay accessWay2 = new NoAccessWay();
		// 새로운 클래스 설정 -> 생성자 작동 -> incrementCnt() 작동 : num++ -> num = 8
		
		accessWay2.num++; // num = 9
		System.out.println(NoAccessWay.num); // 참조변수 accessWay2 통한 num 접근
		
	}
}
