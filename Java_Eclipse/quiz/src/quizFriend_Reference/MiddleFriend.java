package quizFriend_Reference;

class MiddleFriend extends Friend{
	String married; // 기혼/미혼 여부.
	
	MiddleFriend(String name, String phoneNum, String address, String married){
		super(name,phoneNum,address);
		this.married = married;
	}
	
	// Method(멤버메서드)
	public void displayFriendInfo() {
		super.displayFriendInfo();
		System.out.println("기혼/미혼 : " + married);
	}
	
	// 이름, 전공
	public void displayBasicFriendInfo() {
		System.out.println("이름 : "+getName());
		System.out.println("기혼/미혼 : " + married);
	}
}

