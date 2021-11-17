package quizFriend;

import java.io.Serializable;

abstract class Friend implements Serializable{
	private String name;
	private String phoneNum;
	private String address;

	Friend (String name, String phoneNum, String address){
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
	}

	protected String getName() { return name; }
	protected String getPhoneNum() { return phoneNum; }

	public void displayFriendInfo() {
		System.out.println("이  름 : " + this.name);
		System.out.println("폰번호 : " + this.phoneNum);
		System.out.println("주  소 : " + this.address);
	}

	abstract public void displayFriendBasicInfo();

	@Override
	public boolean equals(Object obj) {
		Friend tmp = (Friend) obj;
		if(this.phoneNum == tmp.phoneNum) {
			return true;
		} else {
			return false;
		}
	}
}