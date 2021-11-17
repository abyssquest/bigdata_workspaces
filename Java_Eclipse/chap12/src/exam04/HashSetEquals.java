package exam04;

import java.util.HashSet;
import java.util.Iterator;

class Num{
	int num;
	
	Num(int num){ this.num = num; }

	@Override
	public String toString() {
		return String.valueOf(num); // num + "";
	}

	@Override
	public boolean equals(Object obj) {
		Num comp = (Num) obj;
		
		if(comp.num == this.num)	return true;
		else						return false;
	}

	@Override
	public int hashCode() {
		return num % 3;
	}
}

public class HashSetEquals {
	public static void main(String[] args) {
		/*
		Num num1 = new Num(10);
		Num num2 = new Num(20);
		Num num3 = new Num(30);
		Num num4 = new Num(40);
		
		Num[] num = new Num[4];
		num[0] = new Num(10);
		num[1] = new Num(20);
		num[2] = new Num(30);
		num[3] = new Num(40);
		*/
		HashSet<Num> set = new HashSet<>(); // java 8 이후부터
		/*
		set.add(num1);
		set.add(num2);
		set.add(num3);
		set.add(num4);
		*/
		
		set.add(new Num(10)); // 1000 주소
		set.add(new Num(20)); // 2000 주소
		set.add(new Num(10)); // 3000 주소
		set.add(new Num(40));
		
		Iterator<Num> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		for (Num e : set) {
			System.out.println(e);
		}
	}
}
