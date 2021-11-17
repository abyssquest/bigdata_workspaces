package exam02;

import java.util.Iterator;
import java.util.LinkedList;

public class IntroLinkedList {
	public static void main(String[] args) {
		// 데이터(Instance) 저장 방법
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10); // list.add(new Integer(10));
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		
		// 데이터 로드 방법 - 공통
		Iterator<Integer> itr = list.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		
		// 데이터 참조 - 방법1 : list 형 특수
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
