package exam09;

class Person {
	private String name; // 이름
	private int milID; // 군번
	private int birthYear; // 년
	private int birthMonth; // 월
	private int birthDay; // 일
	
	Person(String name, int milID, int year, int month, int day){
		this.name = name;
		this.milID = milID;
		this.birthYear = year;
		this.birthMonth = month;
		this.birthDay = day;
	}
	
	Person(String name, int year, int month, int day) {
		this(name, 0, year, month, day); // 생성자 호출
		/*
		this.name = name;
		this.milID = 0;
		this.birthYear = year;
		this.birthMonth = month;
		this.birthDay = day;
		*/
	}
	
	Person(String name, int year, int month) {
		this(name, 0, year, month);
		/*
		this.name = name;
		this.milID = 0;
		this.birthYear = year;
		this.birthMonth = month;
		*/
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("출생년도 : " + birthYear + "년");
		System.out.println("출생월 : " + birthMonth + "월");
		if (birthDay != 0)
			System.out.println("출생일 : " + birthDay + "일");
		if (milID != 0)
			System.out.println("군번 : " + milID);
		else
			System.out.println("군번이 없습니다.");
		System.out.println();
	}
}