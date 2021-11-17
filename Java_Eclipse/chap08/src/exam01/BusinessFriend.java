package exam01;

class BusinessFriend extends Friend { // 회사원 친구, 자식(하위/유도)클래스
	private String company; // 회사 이름
	private String department; // 근무 부서
	private String businessNum; // 사번
	
	BusinessFriend(String name, String birth, String address, String email, String company, String department, String businessNum) {
		super(name, birth, address, email);
		this.company = company;
		this.department = department;
		this.businessNum = businessNum;
	}
	
	public void displayBusinessFriendInfo() {
		displayFriendInfo();
		System.out.printf("회사 이름 : %s\n근무 부서 : %s\n사    번 : %s\n", company, department, businessNum);
	}
}
