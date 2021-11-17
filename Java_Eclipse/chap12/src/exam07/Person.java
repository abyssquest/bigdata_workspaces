package exam07;

class Person implements Comparable<Person> {
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void showData() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}

	@Override
	public int compareTo(Person o) {
		/*
		if (age > o.age) { return 1; }
		else if (age == o.age) { return 0; }
		else { return -1; }
		*/
		return age - o.age;
	}
	
}