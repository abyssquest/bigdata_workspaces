package exam03;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;

public class IntroHashSet {
	public static void main(String[] args) {
		// 데이터(Instance) 저장 방법
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10); // list.add(new Integer(10));
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(10);
		
		// 데이터 참조 - 방법1
		/*
		for(int i = 0; i < set.size(); i++) {
			System.out.println(set.);
		}
		System.out.println();
		*/
		
		// 데이터 로드 방법 - 공통
		// Calendar cal = Calendar.getInstance();
		Iterator<Integer> itr = set.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		
		// enhanced - for
		for(Integer e : set) {
			System.out.println(e);
		}
		System.out.println();
		
		// 데이터 삭제
		set.remove(20);
		for(Integer e : set) {
			System.out.println(e);
		}
	}
}
