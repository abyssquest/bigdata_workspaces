package exam04;

public class Overriding {
	public static void main(String[] args) {
		Speaker speaker1 = new Speaker();
		
		speaker1.setVolumeRate(5);
		speaker1.showCurrentState();
		
		System.out.println("\n\n==============================");
		
		BaseEnSpeaker baseSpeaker = new BaseEnSpeaker();
		
		baseSpeaker.setVolumeRate(7);
		baseSpeaker.setBaseRate(6);
		baseSpeaker.showCurrentState();
		
		System.out.println("\n\n==============================");
		
		Speaker speaker2 = new BaseEnSpeaker();  // 다형성 개념 내포 // 상속에서만 있는 개념
		// 부모클래스의 일부 메소드 문제 일으킬시 overriding 이용 하는 것이 시스템 유지보수에 중요
		// 클래스타입은 부모 클래스로 선언. 새로 유지보수는 자식클래스로 정의.
		// 부모클래스를 상속한 자식클래스에 문제수정한 메소드를 같은 이름으로 정의 - overriding
		
		// Speaker speaker2;
		// speaker = new BaseEnSpeaker();
		
		// 클래스타입은 Speaker 메소드는 자식클래스걸로 쓴다.
		
		speaker2.setVolumeRate(9); // overriding
		// speaker2.setBaseRate(7); // error
		// 클래스타입은 부모클래스이지만 메소드는 자식클래스에 있으므로 맞지 않는다
		
		speaker2.showCurrentState(); // overriding
		
	}
}
