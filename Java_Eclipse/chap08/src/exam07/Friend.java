package exam07;

class Friend { // 공통 특징 (부모 클래스)
	// field
	private String name;		// 이름
	private String phoneNum;	// 폰번호
	private String address;		// 주소
	
	// constructor
	Friend (String name, String phoneNum, String address){
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	
	// method
	public void displayFriendInfo() {
		System.out.println("이  름 : " + this.name);
		System.out.println("폰번호 : " + this.phoneNum);
		System.out.println("주  소 : " + this.address);
	}
}