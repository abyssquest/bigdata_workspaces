package exam05;

import java.util.HashSet;

public class HashSetEqualsTwo {

	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<Person>();
		
		set.add(new Person("홍길동", 25));
		set.add(new Person("이순신", 27));
		set.add(new Person("강감찬", 25));
		set.add(new Person("안중근", 28));
		set.add(new Person("강감찬", 25));
		
		for (Person e : set) {
			System.out.println(e);
		}
	}
}
