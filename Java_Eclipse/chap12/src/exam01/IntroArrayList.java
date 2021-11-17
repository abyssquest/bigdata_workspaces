package exam01;

import java.util.ArrayList;
import java.util.Iterator;

public class IntroArrayList {
	public static void main(String[] args) {
		
		// int num1 = 10, num2 = 20, num3 = 30;
		
		// int num1 = 10;
		// int num2 = 20;
		// int num3 = 30;
		
		/*
		Integer num1 = 10; //new Integer(10);
		Integer num2 = 20; //new Integer(20);
		Integer num3 = 30; //new Integer(30);
		
		Integer[] num = new Integer[3];
		num[0] = 10; //new Integer(10);
		num[1] = 20; //new Integer(20);
		num[2] = 30; //new Integer(30);
		*/
		
		// 데이터(Instance) 저장 방법
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10); // list.add(new Integer(10));
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		// 데이터 로드 방법 - 공통
		Iterator<Integer> itr = list.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		
		// 데이터 참조 - 방법1
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		// enhanced - for
		for(Integer e : list) {
			System.out.println(e);
		}
		System.out.println();
		
		// 데이터 삭제
		list.remove(2);
		for(Integer e : list) {
			System.out.println(e);
		}
	}
}
