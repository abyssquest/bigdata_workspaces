package practice0806;

class HighSchool extends Friend {
	
	private String job;
	
	HighSchool(String name, String phone, String address, String job) {
		super(name, phone, address);
		this.job = job;
	}

	public void displayFriendInfo() {
		super.displayFriendInfo();
		System.out.println("직업 : "+job);
	}

	public void displayFriendBasicInfo() { 
	System.out.println("이름 : "+getName());
	System.out.println("직업 : "+job);
	}
	
	public void deleteFriendInfo() {
		super.deleteFriendInfo();
		this.job = null;
	}
	
}
