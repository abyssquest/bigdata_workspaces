package exam11;

public class AbstractInterface {

	public static void main(String[] args) {
		PersonalNumberStorage person = new PersonalStorageThirdparty(1000);
		
		System.out.println("이름 / 생년월일 입력 화면");
		
		String name = "홍길동";
		String birth = "20000805";
		person.addPersonalInfo(name, birth);
		
		name = "이순신";
		birth = "19990805";
		person.addPersonalInfo(name, birth);
		
		name = "강감찬";
		birth = "19950805";
		person.addPersonalInfo(name, birth);
		
		System.out.println("이름 검색 화면");

		String searchName = null;
		String userBirth = "19990805";
		
		searchName = person.searchName(userBirth);
		System.out.println("UI 화면에 출력:" + searchName);
		
		userBirth = "19950805";
		searchName = person.searchName(userBirth);
		System.out.println("UI 화면에 출력:" + searchName);
		
		userBirth = "20000805";
		searchName = person.searchName(userBirth);
		System.out.println("UI 화면에 출력:" + searchName);
		
		userBirth = "1990805";
		searchName = person.searchName(userBirth);
		System.out.println("UI 화면에 출력:" + searchName);
	}
}
