package z.other;

public class SetClass {
	/* class 클래스이름 {} */
	//	Data > Refernce Type > Class 설정  
	//	클래스이름 - 개발자가 임의로 선언 : DataType 으로 작동
	//	field + conductor + method로 작동 but 아무것도 없어도 됨

	/* field(속성) : class의 속성을 나타냄 */
	String teacherName;
	String className;
	int numberOfClass;
		
	SetClass (String tname, String cname, int number) {
		// conductor : 클래스의 이름과 동일해야 한다
		// class 초기값 설정시 한번만 동작한다
		
		teacherName = tname;
		className = cname;
		numberOfClass = number;
	}
	
	void show() {
		System.out.println(teacherName);
		System.out.println(className);
		System.out.println(numberOfClass);
	}
	
}