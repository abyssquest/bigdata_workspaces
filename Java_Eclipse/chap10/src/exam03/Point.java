package exam03;

class Point implements Cloneable {
	private int xPos, yPos;
	
	Point(int xPos, int yPos){
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public void showPosition() {
		System.out.printf("(%d, %d)\n", xPos, yPos);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone(); // instance 복사
	}
	
	
}
