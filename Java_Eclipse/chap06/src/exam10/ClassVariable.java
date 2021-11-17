package exam10;

class InstCnt {
	static int instNum = 0;
	// static : main method 에서 처음 class 참조변수 선언할 때 메모리 할당
	// class자료형.static변수이름 으로 메모리 접근이 가능하다 
	
	InstCnt(){
		instNum++;
		System.out.println("인스턴스 생성 : " + instNum);
	}
}

public class ClassVariable {
	public static void main(String[] args) {
		InstCnt.instNum = 10;
		
		InstCnt instCnt1 = new InstCnt();
		InstCnt instCnt2 = new InstCnt();
		InstCnt instCnt3 = new InstCnt();
		
		System.out.println(InstCnt.instNum);
		System.out.println(instCnt1.instNum);
		System.out.println(instCnt2.instNum);
		System.out.println(instCnt3.instNum);
	}
}
