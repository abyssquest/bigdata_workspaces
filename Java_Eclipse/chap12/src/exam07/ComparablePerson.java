package exam07;

import java.util.TreeSet;

public class ComparablePerson {
	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<Person>();
		
		set.add(new Person("홍길동", 21));
		set.add(new Person("이순신", 25));
		set.add(new Person("강감찬", 28));
		set.add(new Person("유관순", 23));
		set.add(new Person("안중근", 24));
		set.add(new Person("강호동", 28));
		
		for (Person e : set) {
			e.showData();
		}
	}
}
