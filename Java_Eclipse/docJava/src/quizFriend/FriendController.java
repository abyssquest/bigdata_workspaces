package quizFriend;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class FriendController {
	HashSet<Friend> friendset;

	FriendController() {
		friendset = new HashSet<Friend>();

		try {
			
			File saveFile = new File("Friend.bin");
			
			if (saveFile.exists() == true) {
				ObjectInputStream in = new ObjectInputStream(new FileInputStream("Friend.bin"));
				friendset = (HashSet<Friend>)in.readObject();
				in.close();
			}
			
			System.out.println("저장된 친구정보가 로드되었습니다.\n");
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void addFriendInfo(int choice) {
		Scanner input = new Scanner(System.in);

		String name = null, phone = null, address = null;
		String work = null, major = null, married = null;
		Friend tmpinst;

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
			System.out.println("메뉴선택으로 이동합니다\n");
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
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Friend.bin"));
			out.writeObject(friendset);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public void displayFriendInfo(int choice) { // 친구정보 출력 통합본
		Iterator<Friend> itr = friendset.iterator();
		int displayCnt = 0;
		switch(choice) {
		case 4:
			while(itr.hasNext()) { 
				itr.next().displayFriendInfo();
				System.out.println();
			}
			if (displayCnt == 0) System.out.println("저장된 친구 정보가 없습니다.\n");
			break;
		case 5:
			while(itr.hasNext()) {
				itr.next().displayFriendBasicInfo();
				System.out.println();
			}
			if (displayCnt == 0) System.out.println("저장된 친구 정보가 없습니다.\n");
			break;
		case 6:
			while(itr.hasNext()) {
				Friend tmp = itr.next();
				if(tmp instanceof MiddleFriend) {
					tmp.displayFriendInfo();
					System.out.println();
					displayCnt++;
				}
			}
			if (displayCnt == 0) System.out.println("저장된 중학교 친구 정보가 없습니다.\n");
			break;
		case 7:
			while(itr.hasNext()) {
				Friend tmp = itr.next();
				if(tmp instanceof HighFriend) {
					tmp.displayFriendInfo();
					System.out.println();
				}
			}
			if (displayCnt == 0) System.out.println("저장된 고등학교 친구 정보가 없습니다.\n");
			break;
		case 8:
			while(itr.hasNext()) {
				Friend tmp = itr.next();
				if(tmp instanceof UnivFriend) {
					tmp.displayFriendInfo();
					System.out.println();
				}
			}
			if (displayCnt == 0) System.out.println("저장된 대학교 친구 정보가 없습니다.\n");
			break;
		}
	}

	public void searchFriendInfo() {
		Scanner input = new Scanner(System.in);

		System.out.println("검색할 친구의 전화번호를 입력해주십시오");
		String phone = input.nextLine();
		System.out.println();

		Friend friendInst = searchFriendInst(phone);
		
		if(friendInst != null) {
			System.out.println("입력하신 전화번호와 일치하는 친구정보");
			friendInst.displayFriendInfo();
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
		
		Friend friendInst = searchFriendInst(phone);
		
		if (friendInst != null)	{
		
			System.out.println("입력 번호와 일치하는 " + friendInst.getName() + "의 정보를 삭제중...");
			
			boolean removebool = friendset.remove(friendInst);
			
			if (removebool) System.out.println("친구 정보 삭제 완료");
			else			System.out.println("친구 정보 삭제 실패");
		
		} else {
			System.out.println("입력하신 전화번호와 일치하는 친구정보가 없습니다.");
		}

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Friend.bin"));
			out.writeObject(friendset);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();
	}
	
	public Friend searchFriendInst(String phone) {
		// 친구 정보 삭제 과정중 ConcurrentModificationException이 발생 - 인터넷 검색해봄
		// 입력된 친구 번호로 itr로 Instance찾는 과정과 remove 메서드중 정보 찾는 과정이 충돌됬다고 판단
		// 전화번호로 친구 Instance를 구하는 과정을 분리
		// 친구정보 검색 메서드에도 적용
		Friend result = null;
		
		Iterator<Friend> itr = friendset.iterator();
		while (itr.hasNext()) {
			Friend tmp = itr.next();
			if(tmp.getPhoneNum().equals(phone)) {
				result = tmp;
			}
		}
		return result;
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