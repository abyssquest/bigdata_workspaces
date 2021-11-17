package quizFriend;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class FriendController {
	HashSet<Friend> friendset;

	FriendController() {
		friendset = new HashSet<Friend>();
	}

	public void addFriendInfo(int choice) {
		Scanner input = new Scanner(System.in);

		String name = null, phone = null, address = null;
		String work = null, major = null, married = null;

		// 이름 입력
		switch (choice) {
		case 1: System.out.println("입력하시려는 중학교 친구 이름을 입력하세요"); break;
		case 2: System.out.println("입력하시려는 고등학교 친구 이름을 입력하세요"); break;
		case 3: System.out.println("입력하시려는 대학교 친구 이름을 입력하세요"); break;
		}
				
		try {
			name = inputName();
		} catch(NotOneStringNameException e) {
			System.out.println(e.getMessage());
			return;
		}
		System.out.println();
		
		// 전화번호 입력 + 체크 : 메뉴 선택 돌아가기 경로
		System.out.println(name + "의 전화번호를 입력하세요");
		phone = input.nextLine();
		System.out.println();
		
		if (checkPhoneNum(phone)) {
			System.out.println("이미 존재하는 전화번호입니다");
			System.out.println("메뉴선택으로 이동합니다");
			System.out.println();
			return;
		}
		
		/* 전화번호 입력 + 체크 : 전화번호 재입력 경로
		boolean checkPhoneNum = true;
		while (checkPhoneNum) {
			System.out.println(name + "의 전화번호를 입력하세요");
			phone = input.nextLine();
			
			checkPhoneNum = checkPhoneNum(phone);
			if (checkPhoneNum) System.out.println("이미 존재하는 전화번호입니다");
		}
		*/

		// 주소 입력
		System.out.println(name + "의 주소를 입력하세요");
		address = input.nextLine();
		System.out.println();

		// 그룹별 특정정보 입력 + 인스턴스 생성
		switch (choice) {
		case 1: // 중학교 친구
			System.out.println(name + "의 결혼여부을 입력하세요");
			married = input.nextLine();
			friendset.add(new MiddleFriend(name, phone, address, married));
			break;
		case 2: // 고등학교 친구
			System.out.println(name + "의 직업을 입력하세요");
			work = input.nextLine();
			friendset.add(new HighFriend(name, phone, address, work));
			break;
		case 3: // 대학교 친구
			System.out.println(name + "의 전공을 입력하세요");
			major = input.nextLine();
			friendset.add(new UnivFriend(name, phone, address, major));
			break;
		}
	}


	public void displayFriendInfo(int choice) { // 친구정보 출력 통합본
		Iterator<Friend> itr = friendset.iterator();

		switch(choice) {
		case 4:
			while(itr.hasNext()) { 
				itr.next().displayFriendInfo();
				System.out.println();
			}
			break;
		case 5:
			while(itr.hasNext()) {
				itr.next().displayFriendBasicInfo();
				System.out.println();
			}
			break;
		case 6:
			while(itr.hasNext()) {
				Friend tmp = itr.next();
				if(tmp instanceof MiddleFriend) {
					tmp.displayFriendInfo();
					System.out.println();
				}
			}
			break;
		case 7:
			while(itr.hasNext()) {
				Friend tmp = itr.next();
				if(tmp instanceof HighFriend) {
					tmp.displayFriendInfo();
					System.out.println();
				}
			}
			break;
		case 8:
			while(itr.hasNext()) {
				Friend tmp = itr.next();
				if(tmp instanceof UnivFriend) {
					tmp.displayFriendInfo();
					System.out.println();
				}
			}
			break;
		}
	}

	public void searchFriendInfo() {
		Scanner input = new Scanner(System.in);

		System.out.println("검색할 친구의 전화번호를 입력해주십시오");
		String phone = input.nextLine();
		System.out.println();

		Iterator<Friend> itr = friendset.iterator();
		
		if(checkPhoneNum(phone)) {
			while (itr.hasNext()) {
				Friend tmp = itr.next();
				if(tmp.getPhoneNum().equals(phone)) {
					System.out.println("입력하신 전화번호와 일치하는 친구정보");
					tmp.displayFriendInfo();
				}
			}
		} else {
			System.out.println("입력하신 전화번호와 일치하는 친구정보가 없습니다.");
		}
		System.out.println();
	}

	public void deleteFriendInfo() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("삭제할 친구의 전화번호를 입력해주십시오");
		String phone = input.nextLine();
		System.out.println();
		
		Iterator<Friend> itr = friendset.iterator();
		
		if(checkPhoneNum(phone)) {
			while (itr.hasNext()) {
				Friend tmp = itr.next();
				if(tmp.getPhoneNum().equals(phone)) {
					System.out.println("입력하신 전화번호와 일치하는 " + tmp.getName() + "의 주소록 정보를 삭제합니다.");
					friendset.remove(tmp.getPhoneNum());
				}
			}
		} else {
			System.out.println("입력하신 전화번호와 일치하는 친구정보가 없습니다.");
		}

		System.out.println();
	}

	public boolean checkPhoneNum(String phone) { // 일치 true 불일치 false 리턴
		boolean result = false;
		
		Iterator<Friend> itr = friendset.iterator();
		
		while(itr.hasNext()) {
			if(itr.next().getPhoneNum().equals(phone)) { result = true; }
		}
		
		return result;
	}
	
	public String inputName() throws NotOneStringNameException {
		String name = null;
		
		Scanner input = new Scanner(System.in);
		name = input.nextLine();
		
		if(name.length() == 1) {
			NotOneStringNameException except = new NotOneStringNameException();
			throw except;
		}
		
		return name;
	}
}

class NotOneStringNameException extends Exception {
	NotOneStringNameException() {
		super("한 글자의 이름은 입력하실 수 없습니다.");
		System.out.println();
	}
}