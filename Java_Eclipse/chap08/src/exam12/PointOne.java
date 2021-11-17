package exam12;

class PointOne implements UpperCasePrintable /* extends Object */ {
	private int xPos, yPos;
	
	PointOne(int x, int y){
		this.xPos = x;
		this.yPos = y;
	}

	@Override
	public String toString() {
		String posInfo = "(x pos : " + xPos + ", y pos : " + yPos + ")";
		return posInfo;
	}
	
	
}
