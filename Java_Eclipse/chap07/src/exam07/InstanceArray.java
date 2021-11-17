package exam07;

public class InstanceArray {
	public static void main(String[] args) {
		String[] strArr = new String[3];
		
		strArr[0] = new String("홍길동");
		strArr[1] = new String("강감찬");
		strArr[2] = new String("이순신");
		
		for(int i=0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}
}
