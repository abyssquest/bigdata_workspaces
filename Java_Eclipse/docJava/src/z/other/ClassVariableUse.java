package z.other;

public class ClassVariableUse {
	public static void main(String[] args) {
		Circle circle1 = new Circle(2.54);
		Circle circle2 = new Circle(5);
		
		circle1.showPerimeter();
		circle1.showArea();
		circle2.showPerimeter();
		circle2.showArea();

	}
}

