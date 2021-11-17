package exam01;

import java.util.Scanner;
// import java.lang.*;

public class StringEquals {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str1 = new String("Hi my String");
		String str2 = new String("Hi my String");
		
		String str3 = "Hi my String";
		String str4 = "Hi my String";
		
		if (str1 == str2)	System.out.println("인스턴스 메모리 주소값   일치.");
		else				System.out.println("인스턴스 메모리 주소값 불일치.");
		
		if (str1.compareTo(str2) == 0)	System.out.println("동일 내용.");
		else							System.out.println("다른 내용.");

		if(str1.equals(str2))	System.out.println("동일 내용.");
		else					System.out.println("다른 내용");
	}
}
