package exam02;

class Apple {
	int weight; // 사과의 중량
	
	Apple (int weight) {
		this.weight = weight;
	}
	
	public void showAppleWeight() {
		System.out.println("사과의 중량 : " + this.weight);
	}
}

class Orange {
	int sugarContent; // 당분 함량
	
	Orange(int sugarContent) {
		this.sugarContent = sugarContent;
	}
	
	public void showSugarContent() {
		System.out.println("당분 함량 : " + sugarContent);
	}
}

class FruitBox {
	Object item;
	
	public void store(Object item) { // 포장
		this.item = item;
	}
	
	public Object pullout() { // 개봉
		return item;
	}
}