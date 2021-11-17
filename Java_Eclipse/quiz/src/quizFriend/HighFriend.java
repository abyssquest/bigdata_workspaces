package quizFriend;

class HighFriend extends Friend {
	private String work;

	HighFriend (String name, String phoneNum, String address, String work){
		super(name, phoneNum, address);
		this.work = work;
	}

	public void displayFriendInfo() {
		super.displayFriendInfo();
		System.out.println("직  업 : " + this.work);
	}

	public void displayFriendBasicInfo() {
		System.out.println("이  름 : " + getName());
		System.out.println("직  업 : " + this.work);
	}
}
