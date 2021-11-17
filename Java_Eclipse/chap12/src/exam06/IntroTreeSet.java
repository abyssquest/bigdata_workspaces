package exam06;

import java.util.TreeSet;

public class IntroTreeSet {
	public static void main(String[] args) {
		
		TreeSet<String> set1 = new TreeSet<String>();
				
		// 데이터 저장
		set1.add("Third");
		set1.add("Second");
		set1.add("First");
		set1.add("Fourth");
		set1.add("Second");
		
		System.out.println(set1.size()); // 셋 사이즈 측정
		
		for (String e : set1) { // 데이터 로드
			System.out.println(e);
		}
		
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		
		set2.add(5);
		set2.add(3);
		set2.add(4);
		set2.add(2);
		set2.add(1);
		
		for (Integer e : set2) {
			System.out.println(e);
		}
		
	}
}
