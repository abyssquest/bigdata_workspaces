package z.other;

class Circle { // 원의 둘레, 넓이
	static final double PI = 3.141592;
	private double radius;
		
	Circle (double radius) {
		this.radius = radius;
	}
	
	public void showPerimeter () { // 원의 둘레 출력
		double result = 0;
		result = 2 * PI * radius;
		System.out.println("원의 반지름 " + radius + "의 둘레 : " + result);
	}
	
	public void showArea () { // 원의 넓이 출력
		double result = 0;
		result = PI * radius * radius;
		System.out.println("원의 반지름 " + radius + "의 넓이 : " + result);
	}
}
