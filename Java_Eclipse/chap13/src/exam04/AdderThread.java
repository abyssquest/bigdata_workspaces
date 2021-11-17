package exam04;

class AdderThread extends Thread {
	int start, end;
	Sum sumInst;
	
	AdderThread(Sum sum, int start, int end){
		this.start = start;
		this.end = end;
		this.sumInst = sum;
	}
	
	@Override
	public void run() {
		for (int i = start; i <= end; i ++) {
			sumInst.addNum(i);
		}
	}

}
