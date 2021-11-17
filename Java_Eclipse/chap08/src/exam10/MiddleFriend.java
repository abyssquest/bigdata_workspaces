package exam10;

class MiddleFriend extends Friend { // 중학교 친구 (자식 클래스)
	// field (멤버 변수)
	private String married; // 결혼여부
	
	// constructor // default : MiddleFriend(){ super(); }
	MiddleFriend (String name, String phoneNum, String address, String married){
		super(name, phoneNum, address); // 부모 필드(field) 초기화 의무
		this.married = married;
	}
	
	// method (멤버 메서드)
	public void displayMiddleFriendInfo() {
		displayFriendInfo();
		System.out.println("결  혼 : " + this.married);
	}
	
	public void displayFriendBasicInfo() {
		System.out.println("이  름 : " + getName());
		System.out.println("직  업 : " + this.married);
	}
}
