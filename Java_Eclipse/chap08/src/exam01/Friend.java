package exam01;

class Friend { // 부모(상위/기초)클래스
	private String name; // 이름
	private String birth; // 생년월일
	private String address; // 주소
	private String email; // 이메일

	Friend(String name, String birth, String address, String email){
		this.name = name;
		this.birth = birth;
		this.address = address;
		this.email = email;
	}
	
	public void displayFriendInfo() {
		System.out.printf("이    름 : %s\n생년월일 : %s\n주    소 : %s\n이 메 일 : %s\n", name, birth, address, email);
	}
}
