package exam04;

class BaseEnSpeaker extends Speaker {
	private int baseRate;
	
	public void setBaseRate(int baseRate) {
		this.baseRate = baseRate;
		// 참조자료형 안에서만 this를 사용
	}
	
	public int getBaseRate () {
		return baseRate;
	}
	
	public void showCurrentState() {
		// 메서드 오버라이딩
		// 상속의 관계하에서 부모에 정의되어있는 메서드의  매개변수와 반환형타입이 동일한 같은 이름의 메서드

		// cf. 메서드 오버로딩
		// 동일한 참조변수하에서 매개변수의 개수나 자료형이 다를때 같은 이름의 메서드를 정의하는것
		
		super.showCurrentState();
		System.out.println("베이스 크기 : " + getBaseRate());
	}
}

