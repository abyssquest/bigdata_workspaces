package exam03;

public class BuilderString {

	public static void main(String[] args) {
		// StringBuilder builder = new StringBuilder("AB");
		StringBuffer builder = new StringBuffer("AB");
		
		// System.out.println(builder);
		builder.append(25);
		// System.out.println(builder);
		builder.append("ab");
		// System.out.println(builder);
		builder.append(3.14);
		builder.append(true);
		builder.append('Z');
		System.out.println(builder);
		
		builder = null;
		// builder = new StringBuilder("AB");
		builder = new StringBuffer("AB");
		builder.append(25).append("ab").append(3.14).append(true).append('Z'); // 메서드 체이닝
		System.out.println(builder);
		
		builder.insert(3, false); // 삽입(0부터 카운팅)
		System.out.println(builder);
		
		
		
	}
}