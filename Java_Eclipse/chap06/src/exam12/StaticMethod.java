package exam12;

public class StaticMethod {
	public static void main(String[] args) {
		double result = 0;
		// AreaMath area = new AreaMath();
		
		result = AreaMath.calCircleArea(2.4); // 참조자료형 AreaMath를 통한 static 메서드 접근
		System.out.println("반지름이 2.4인 원의 넓이 : " + result);
		
		result = AreaMath.calRectangleArea(3.4, 4.5); // 참조자료형 AreaMath를 통한 static 메서드 접근
		System.out.println("가로 3.4 세로 4.5인 사각형의 넓이 : " + result);
		
		result = AreaMath.out.add(10, 20);
		// 참조자료형 AreaMath를 통한 static 변수 out (자료형 SimpleMath) 접근 
		System.out.println(result);
	}
}