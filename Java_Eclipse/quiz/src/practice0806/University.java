package practice0806;

class University extends Friend {
	
	private String major;

	University(String name, String phone, String address, String major) {
		super(name, phone, address);
		this.major = major;
	}

	public void displayFriendInfo() {
		super.displayFriendInfo();
		System.out.println("전공 : "+major);
	}
	public void displayFriendBasicInfo() {
		System.out.println("이름 : "+getName());
		System.out.println("전공 : "+major);
	}	
	
	public void deleteFriendInfo() {
		super.deleteFriendInfo();
		this.major = null;
	}

}
