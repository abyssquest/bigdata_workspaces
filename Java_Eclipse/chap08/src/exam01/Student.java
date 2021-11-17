package exam01;

class Student extends Friend { // 학생 친구, 자식(하위/유도)클래스
	private String university; // 학교 이름
	private String major; // 전공
	
	// 자식의 자료형에서는 부보의 정의되어진 인스턴스를 초기화 해줄 의무를 가진다
	Student(String name, String birth, String address, String email, String university, String major){
		// this.name = name;
		// this.birth = birth;
		// this.address = address;
		// this.email = email;
		super(name, birth, address, email);  // 상속 관계에서 부모 클래스의 생성자를 호출할 목적
		this.university = university;
		this.major = major;
	}
	
	public void displayStudentInfo() {
		displayFriendInfo();
		System.out.printf("학 교 명 : %s\n전    공 : %s\n", university, major);
	}
}
