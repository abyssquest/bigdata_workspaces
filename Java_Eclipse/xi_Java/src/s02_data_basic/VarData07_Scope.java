package s02_data_basic;

public class VarData07_Scope {

int no; // 클래스 VarData07_Scope 블럭(중괄호) 내에서 사용가능한 변수
	
	public static void main(String[] args) {
		
		String name; // main 메서드 블럭(중괄호) 내에서 사용가능한 변수
					 		
		if (true) {
			name = "홍길동"; // name은 메서드 블럭안에서 사용가능.
			String email = "test@test.com"; // if문 블럭안에서 사용하는 변수
			
			System.out.println("이  름 : " + name);
			System.out.println("이메일 : " + email);
			
			// 범위 안에서 메모리 할당받은 변수는 해당 범위가 끝나면 메모리 데이터만 남기고 지워진다
		}
		
		// email 변수는 if문 블럭을 벗어나서 사용 불가능하다 error
		// email = test2@test2.com;
		
	}
	
	// name 변수는 메서드 블럭을 벗어나서는 쓸 수 없다
}