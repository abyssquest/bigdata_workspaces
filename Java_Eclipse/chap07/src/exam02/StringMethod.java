package exam02;

public class StringMethod {
	public static void main(String[] args) {
		String str1 = "Smart";
		String str2 = " and ";
		String str3 = "Simple";
		String str4 = null;
		
		// str4 = str1.concat(str2); : "Smart and "
		// str4 = str4.concat(str3);
		str4 = str1.concat(str2).concat(str3); // 메서드 체이닝
			// "Smart and ".concat(str3);
			// "Smart and Simple"
		System.out.println(str4);
		
		str1.compareTo(str3);
	}
}