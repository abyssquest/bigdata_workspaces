package exam12;

class AreaMath { // 넓이 계산 클래스
	// SimpleMath out;
	static SimpleMath out;
	
	AreaMath(){
		out = new SimpleMath();
	}
		
	public static double calCircleArea (double rad) { // 원의 넓이
		return SimpleMath.PI * SimpleMath.mul(rad, rad);
	}
	
	public static double calRectangleArea (double width, double height) { // 사각형의 넓이
		return SimpleMath.mul(width, height);
	}
}
