package exam02;

class Sum{
	int num;
	
	Sum() { num = 0; }
	
	public void addNum(int num) { this.num += num; }
	public int getNum() { return num; }
//	public void setNum(int num) { this.num = num;}
}

class AddThread extends Sum implements Runnable {
	int start, end;
	
	AddThread(int start, int end){
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		for(int i = start; i <= end; i++) {
			addNum(i);
		}
	}
}

public class RunnableThread {
	public static void main(String[] args) {
		AddThread at1 = new AddThread(0, 50);
		AddThread at2 = new AddThread(51, 100);
		
		Thread thread1 = new Thread(at1);
		Thread thread2 = new Thread(at2);
		
		thread1.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1 ~ 100까지의 합 : " + (at1.getNum() + at2.getNum()));
	}
}
