package practice0806;

class MiddleSchool extends Friend {

	private String marrige;
	
	MiddleSchool(String name, String phone, String address, String marrige) {
		super(name, phone, address);
		this.marrige = marrige;
	}
	
	public void displayFriendInfo() {
		super.displayFriendInfo();
		System.out.println("결혼여부 : "+marrige);
	}
	public void displayFriendBasicInfo() {
		System.out.println("이름 : "+getName());
		System.out.println("결혼여부 : "+marrige);
	}
		
	public void deleteFriendInfo() {
		super.deleteFriendInfo();
		this.marrige = null;
	}
	

}
