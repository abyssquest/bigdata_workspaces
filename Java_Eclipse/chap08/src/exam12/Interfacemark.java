package exam12;

public class Interfacemark {
	public static void main(String[] args) {
		PointOne pos1 = new PointOne(3,5);
		PointTwo pos2 = new PointTwo(4,6);
		
		ClassPrinter.print(pos1);
		ClassPrinter.print(pos2);
	}
}