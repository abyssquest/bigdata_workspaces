package exam04;

class Sum {
	private int sum;
	
	Sum() { sum = 0; }
	public synchronized void addNum(int num) { this.sum += num; } // 컴퓨터한테 좀 먼저할게 기다려
	public int getNum() { return this.sum; }
}
