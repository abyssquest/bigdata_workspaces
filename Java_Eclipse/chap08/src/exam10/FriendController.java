package exam10;

import java.util.Scanner;

class FriendController {
	Friend[] friend;
	final private int MAX_FRIEND;
	private int indexOfFriend;

	FriendController() {
		MAX_FRIEND = 300;
		indexOfFriend = 0;
		friend = new Friend[MAX_FRIEND];
	}

	public void addFriend(int choice) {
		Scanner input = new Scanner(System.in);

		String name = null, phone = null, address = null;
		String work = null, major = null, married = null;

		switch (choice) {
		case 1:
			System.out.println("입력하시려는 중학교 친구 이름을 입력하세요");
			break;
		case 2:
			System.out.println("입력하시려는 고등학교 친구 이름을 입력하세요");
			break;
		case 3:
			System.out.println("입력하시려는 대학교 친구 이름을 입력하세요");
			break;
		}
		// System.out.println("입력하시려는 친구 이름을 입력하세요");
		name = input.nextLine();

		System.out.println(name + "의 전화번호를 입력하세요");
		phone = input.nextLine();

		System.out.println(name + "의 주소를 입력하세요");
		address = input.nextLine();

		switch (choice) {
		case 1: // 중학교 친구
			System.out.println(name + "의 결혼여부을 입력하세요");
			married = input.nextLine();
			friend[indexOfFriend++] = new MiddleFriend(name, phone, address, married);
			break;

		case 2: // 고등학교 친구
			System.out.println(name + "의 직업을 입력하세요");
			work = input.nextLine();
			friend[indexOfFriend++] = new HighFriend(name, phone, address, work);
			break;

		case 3: // 대학교 친구
			System.out.println(name + "의 전공을 입력하세요");
			major = input.nextLine();
			friend[indexOfFriend++] = new UnivFriend(name, phone, address, major);
			break;
		}
	}

	public void displayFriendInfo() {
		for (int i = 0; i < indexOfFriend; i++) {
			if (friend[i] instanceof MiddleFriend) {

				MiddleFriend middleFriend = (MiddleFriend) friend[i];
				middleFriend.displayMiddleFriendInfo();
				System.out.println();

			} else if (friend[i] instanceof HighFriend) {

				HighFriend highFriend = (HighFriend) friend[i];
				highFriend.displayHighFriendInfo();
				System.out.println();

			} else if (friend[i] instanceof UnivFriend) {

				UnivFriend univFriend = (UnivFriend) friend[i];
				univFriend.displayUnivFriendInfo();
				System.out.println();

			}

		}

	}
	
	public void displayFriendBasicInfo() {
		for (int i = 0; i < indexOfFriend; i++) {
			friend[i].displayFriendBasicInfo();
			System.out.println();
		}

	}

}