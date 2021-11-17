package exam11;

class Personal {
	private String name;
	private String birth;
	
	Personal (String name, String birth) {
		this.name = name;
		this.birth = birth;
	}
	
	public String getName() { return name; }
	public String getBirth() { return birth; }
}

class PersonalStorageThirdparty implements PersonalNumberStorage{ // 외주 개발사
	Personal[] perArr;
	int indexPerInfo;
	
	PersonalStorageThirdparty(int number){
		perArr = new Personal[number];
		indexPerInfo = 0;
	}
	
	@Override
	public void addPersonalInfo(String name, String birth) {
		perArr[indexPerInfo++] = new Personal(name, birth);
		System.out.println("데이터 저장 완료.");
	}

	@Override
	public String searchName(String birth) {
		for (int i = 0; i < indexPerInfo; i++) {
			if(perArr[i].getBirth().compareTo(birth) == 0) {
				return perArr[i].getName();
			}
		}
		return null;
	}

}
