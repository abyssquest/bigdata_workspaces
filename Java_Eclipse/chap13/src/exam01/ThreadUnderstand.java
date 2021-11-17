package exam01;

class SumThread extends Thread {
	String threadName;
	int start;
	int end;
	
	SumThread(String name, int start, int end){
		this.start = start;
		this.end = end;
		this.threadName = name;
	}
	
	@Override
	public void run () {
		int sum = 0;
		
		for (int i = start; i <= end; i++) {
			sum += i;
			System.out.print(threadName);
		}
		
		System.out.printf("\n%d ~ %d의 합 : %d\n", start, end, sum);
	}
	
}

public class ThreadUnderstand {
	public static void main(String[] args) {
		SumThread thread1 = new SumThread("1",  1, 500);
		SumThread thread2 = new SumThread("2", 501, 1000);
		
		thread1.start(); // thread1.run(); xx
		thread2.start();
		
		System.out.println("프로그램 종료");
	}
}