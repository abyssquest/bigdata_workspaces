package quizFriend_Reference;

import java.io.Serializable;

class Friend  implements Serializable {
	// field
	private String name; // 이름
	private String phoneNum; // 폰번호
	private String address; // 주소
	
	// Constructor
	Friend(String name, String phoneNum, String address){
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	// Method
	public void displayFriendInfo() {
		System.out.println("이름 : "+name);
		System.out.println("폰번호 : "+phoneNum);
		System.out.println("주소 : "+address);
	}
	
	public void displayBasicFriendInfo() { }
	
	@Override
	public int hashCode() {
		return phoneNum.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Friend) {
			Friend friend = (Friend) obj;
			return phoneNum.equals(friend.phoneNum) ; 
		}
		
		return false;
	}
}
