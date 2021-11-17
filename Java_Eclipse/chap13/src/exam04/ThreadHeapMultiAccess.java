package exam04;

public class ThreadHeapMultiAccess {
	public static void main(String[] args) {
		Sum sum = new Sum();
		
		AdderThread at1 = new AdderThread(sum, 1, 5000);
		AdderThread at2 = new AdderThread(sum, 5001, 10000);
		
		at1.start();
		at2.start();
		
		try {
			at1.join();
			at2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1 ~ 10000의 합 : " + sum.getNum());
	}
}
