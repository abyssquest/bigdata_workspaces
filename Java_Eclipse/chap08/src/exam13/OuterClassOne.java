package exam13;

class OuterClassOne {
	NestedClass nst;
	
	OuterClassOne(){
		nst = new NestedClass();
		nst.simpleMethod();
	}

	public void whoAreYou() {
		System.out.println("WhoAreYou() 호출...");
		nst.simpleMethod();
		// simpleMethod(); - error
	}
	
	static class NestedClass { // 그냥 자료형으로 간주
				
		NestedClass(){
			simpleMethod();
			// WhoAreYou(); - error
		}
		
		public void simpleMethod() {
			System.out.println("NestedClass => simpleMethod() 호출...");
		}
	}
}

// static - 외부 인스턴스 생성여부에 관계 없이 독자적으로 인스턴스 생성 요청 가능