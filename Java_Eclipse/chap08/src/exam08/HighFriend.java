package exam08;

class HighFriend extends Friend { // 고등학교 친구 (자식 클래스)
	// field (멤버 변수)
	private String work; // 직업
	
	// constructor // default : HighFriend(){ super(); }
	HighFriend (String name, String phoneNum, String address, String work){
		super(name, phoneNum, address); // 부모 필드(field) 초기화 의무
		this.work = work;
	}
	
	// method (멤버 메서드)
	public void displayHighFriendInfo() {
		displayFriendInfo();
		System.out.println("직  업 : " + this.work);
	}
	
	public void displayFriendBasicInfo() {
		System.out.println("이  름 : " + getName());
		System.out.println("직  업 : " + this.work);
	}
}
