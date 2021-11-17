package exam08;

class UnivFriend extends Friend { // 대학교 친구 (자식 클래스)
	// field (멤버 변수)
	private String major; // 전공
	
	// constructor // default : UnivFriend(){ super(); }
	UnivFriend (String name, String phoneNum, String address, String major) {
		super(name, phoneNum, address); // 부모 필드(field) 초기화 의무
		this.major = major;
	}

	// method (멤버 메서드) 
	public void displayUnivFriendInfo() {
		displayFriendInfo();
		System.out.println("전  공 : " + this.major);
	}
	
	public void displayFriendBasicInfo() {
		System.out.println("이  름 : " + getName());
		System.out.println("직  업 : " + this.major);
	}
}
