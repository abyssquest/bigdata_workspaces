package exam03;
/*
class Thread{
	... 
	
	int priority;
	
	public void setPriority(int priority) { this.priority = priority; }
	public int getPriority() { return priority; }
	...
}
*/
class MessageSendingThread extends Thread {
	String message;
	
	MessageSendingThread(String message, int prio){
		this.message = message;
		setPriority(prio);
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println(message + "(" + getPriority() + ")");
			
			try {
				sleep(i);  // dummy
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class PriorityTest {
	public static void main(String[] args) {
		MessageSendingThread tr1 = new MessageSendingThread("First", Thread.MAX_PRIORITY); // 우선순위 10
		MessageSendingThread tr2 = new MessageSendingThread("Second", Thread.NORM_PRIORITY); // 우선순위 5
		MessageSendingThread tr3 = new MessageSendingThread("Third", Thread.MIN_PRIORITY); // 우선순위 1
		
		tr1.start();
		tr2.start();
		tr3.start();
		
	}
}
