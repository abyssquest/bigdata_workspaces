package exam03;

public class If_ElseIf_Else {
	public static void main(String[] args) {
		
		int birth = 1985;
		int age;
		
		age = 2021 - birth +1;
		
		System.out.println("당신의 나이는 " + age + "살 이군요.");
		
		if (age < 10) {
			System.out.println("10대 미만입니다");
		} else if (age < 20) { // 10 <= age < 20
			System.out.println("10대이군요");
		} else if (age < 30) { // 20 <= age < 30
			System.out.println("20대이군요");
		} else {
			System.out.println("30대 이상이군요");
		}
	}
}