package s03_data_primary;

public class Data03_TypeBoolean {
	public static void main(String[] args) {

		/*	
		
		논리형
			boolean : 1 Byte 할당 : true or false(기본값) (소문자로 써야함)
			
		 */
		
		boolean bool1, bool2;
		
		bool1 = false;
		System.out.println(bool1);
		
		bool2 = 75 < 24;
		System.out.println(bool2);
		
		bool2 = 75 > 24;
		System.out.println(bool2);
		
	}
}