package exam07;

import java.util.Scanner;

class FriendController {
	HighFriend[] highFriend;
	UnivFriend[] univFriend;
	final private int MAX_HIGH;
	final private int MAX_UNIV;
	private int indexOfHigh;
	private int indexOfUniv;
	
	FriendController(){
		MAX_HIGH = MAX_UNIV = 100;
		highFriend = new HighFriend[MAX_HIGH];
		univFriend = new UnivFriend[MAX_UNIV];
		indexOfHigh = 0;
		indexOfUniv = 0;
	}
	
	public void addFriend(int choice) {
		Scanner input = new Scanner(System.in);
		String name = null, phone = null, address = null;
		String work = null, major = null;
				
		System.out.println("입력하시려는 친구 이름을 입력하세요");
		name = input.nextLine();
		
		System.out.println(name + "의 전화번호를 입력하세요");
		phone = input.nextLine();
		
		System.out.println(name + "의 주소를 입력하세요");
		address = input.nextLine();
		
		switch(choice) {
		case 1:
			System.out.println(name + "의 직업을 입력하세요");
			work = input.nextLine();
			this.highFriend[indexOfHigh++] = new HighFriend(name, phone, address, work);
			break;
		case 2:
			System.out.println(name + "의 전공을 입력하세요");
			major = input.nextLine();
			this.univFriend[indexOfUniv++] = new UnivFriend(name, phone, address, major);
			break;
		}
	}
	
	public void displayFriendInfo() {
		for (int i = 0; i < indexOfHigh; i++) {
			highFriend[i].displayHighFriendInfo();
		}
		
		for (int i = 0; i < indexOfUniv; i++) {
			univFriend[i].displayUnivFriendInfo();
		}

	}
	
}
