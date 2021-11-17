package practice0806;

abstract class Friend {
	
	private String name;
	private String phone;
	private String address;
	
	Friend(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	public void displayFriendInfo() {
		System.out.println("이름 : "+name);
		System.out.println("휴대폰 : "+phone);
		System.out.println("주소 : "+address);
	}
	
	abstract public void displayFriendBasicInfo(); 
	
	public void deleteFriendInfo() {
		this.name = null;
		this.phone = null;
		this.address = null;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}

}
