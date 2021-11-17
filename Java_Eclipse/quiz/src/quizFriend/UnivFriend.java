package quizFriend;

class UnivFriend extends Friend {
	private String major;

	UnivFriend (String name, String phoneNum, String address, String major) {
		super(name, phoneNum, address);
		this.major = major;
	}

	public void displayFriendInfo() {
		super.displayFriendInfo();
		System.out.println("전  공 : " + this.major);
	}

	public void displayFriendBasicInfo() {
		System.out.println("이  름 : " + getName());
		System.out.println("전  공 : " + this.major);
	}
}
