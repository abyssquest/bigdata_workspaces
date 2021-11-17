package exam04;

public class IntroArray {
	public static void main(String[] args) {
		
		int korean = 90, english = 95, math = 85, social = 95, science = 90;
		
		System.out.println(korean);
		System.out.println(english);
		System.out.println(math);
		System.out.println(social);
		System.out.println(science);
		System.out.println();
		
		int[] younghee = new int[5];
		
		younghee[0] = 90;
		younghee[1] = 95;
		younghee[2] = 85;
		younghee[3] = 95;
		younghee[4] = 90;
				
		/*
		System.out.println(younghee[0]);
		System.out.println(younghee[1]);
		System.out.println(younghee[2]);
		System.out.println(younghee[3]);
		System.out.println(younghee[4]);
		*/
		
		for (int i = 0; i < younghee.length; i++) {
			System.out.println(younghee[i]);
		}
	}
}
