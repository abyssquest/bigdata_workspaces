package quizFriend;

class MiddleFriend extends Friend {
	private String married;

	MiddleFriend (String name, String phoneNum, String address, String married){
		super(name, phoneNum, address);
		this.married = married;
	}

	public void displayFriendInfo() {
		super.displayFriendInfo();
		System.out.println("결  혼 : " + this.married);
	}

	public void displayFriendBasicInfo() {
		System.out.println("이  름 : " + getName());
		System.out.println("결  혼 : " + this.married);
	}
}
