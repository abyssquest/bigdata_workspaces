package z.other;
// package
// summary	: package 이름

public class SetFrame {

	public static void main(String[] args) {

		SetClass aclass;
		// 변수 선언
		// 변수 이름 aclass
		// 변수 지정된 메모리에 저장된 데이터타입은 SetClass
		// SetClass < class < Reference Type < DataType
		// 참조
		
		aclass = new SetClass("김영호", "수학반", 27);
		// 참조변수 aclass 지정된 메모리에 저장된 data는 메모리 주소
		// 저장된 메모리 주소로 class 속성이 지정된 메모리 주소를 찾는다
		
		System.out.println(aclass.teacherName); // class 속성에 저장된 데이터 불러오기
		System.out.println(aclass.className);
		System.out.println(aclass.numberOfClass);
		System.out.println();
		
		SetClass bclass = new SetClass("최영미", "간호반", 40);
		bclass.show();

	}

}
