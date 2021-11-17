package exam11;

// abstract class PersonalNumberStorage {
interface PersonalNumberStorage { // abstract class = interface 추상 메서드로만 구성되어 있어야 한다
	/* abstract public */ void addPersonalInfo(String name, String birth);
	/* abstract public */ String searchName(String birth);
	// 메서드 앞의 abstract public 두단어 있어도 되고 없어도 된다 한단어만 없어도 된다 - 자바가 알아서 채워줌
}
