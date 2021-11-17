package practice0806;

import java.util.Scanner;

class FriendController {
	
	Friend[] friend;	
						
	final private int MAX_FRIEND;
	
	private int indexOfFriend;
	
	FriendController () {
		MAX_FRIEND = 300; 

		indexOfFriend = 0;
		this.friend = new Friend[MAX_FRIEND]; 
	}
	
	public void addFriend(int choice) {
		Scanner input = new Scanner(System.in);
		String name = null, phone = null, address = null, marrige = null, job = null, major = null;
												
		System.out.print("Input Name : ");
		name = input.nextLine();
		
		System.out.print("Input Phone : ");
		phone = input.nextLine();
		
		while(true) {
		if(checkPhoneNum(phone) == true) {
			System.out.println("Phone Number \" "+phone+" \" Already Exists. Try Again.");
			System.out.print("Input Phone : ");
			phone = input.nextLine();
		} else break;
		}
		
		System.out.print("Input Address : ");
		address = input.nextLine();
		
		if(choice == 1) {
			
			System.out.print("Input Marrige : ");
			marrige = input.nextLine();
			friend[indexOfFriend++] = new MiddleSchool(name, phone, address, marrige);
			
		} else if(choice == 2) {
			
			System.out.print("Input Job : ");
			job = input.nextLine();
			friend[indexOfFriend++] = new HighSchool(name, phone, address, job);
	
		} else if(choice == 3) {
			
			System.out.print("Input Major : ");
			major = input.nextLine();
			friend[indexOfFriend++] = new University(name, phone, address, major);;		
		}

	}
	
	
	public void displayFriendInfo() {
		
	for (int i = 0; i < indexOfFriend; i++) {
				
				friend[i].displayFriendInfo();
				System.out.println();
		
//		for (int i = 0; i < indexOfFriend; i++) {
//			
//			if (friend[i] instanceof MiddleSchool) {
//				
//				MiddleSchool middle = (MiddleSchool)friend[i];
//				middle.displayFriendInfo();
//				System.out.println();
//				
//			} else if (friend[i] instanceof HighSchool) {
//				
//				HighSchool high = (HighSchool)friend[i];
//				high.displayFriendInfo();
//				System.out.println();
//				
//			} else if (friend[i] instanceof University) {
//				
//				University univ = (University)friend[i];
//				univ.displayFriendInfo();
//				System.out.println();
//			}
		}
		
	}
	
	public void basicFriendInfo() {
		
		for (int i = 0; i < indexOfFriend; i++) {
			
			friend[i].displayFriendBasicInfo();
			System.out.println(); //메서드 오버라이딩 통해 자료형이 부모여도 자식 자료형에서 재정의된 메서드 호출 가능.
		}
	}
	
	public void displayPartialInfo (int choice) {
		
		if (choice == 6) {
			for (int i = 0; i < indexOfFriend; i++) {
				if (friend[i] instanceof MiddleSchool) {
					MiddleSchool middle = (MiddleSchool)friend[i];
					middle.displayFriendInfo();
					System.out.println();
					}
			}
		}
		
		if (choice == 7) {
			for (int i = 0; i < indexOfFriend; i++) {
				if (friend[i] instanceof HighSchool) {
					HighSchool high = (HighSchool)friend[i];
					high.displayFriendInfo();
					System.out.println();
					}
			}
		}
		
		if (choice == 8) {
			for (int i = 0; i < indexOfFriend; i++) {
				if (friend[i] instanceof University) {
					University univ = (University)friend[i];
					univ.displayFriendInfo();
					System.out.println();
					}
			}
		}
		
		
	}
	
	
	public void searchFriend() {
		System.out.print("Input Phone Number you are searching for : ");
		Scanner input = new Scanner(System.in);
		String search = input.nextLine();
		
		for (int i = 0; i < indexOfFriend; i++) {
			if(search.equals(friend[i].getPhone())) {
			friend[i].displayFriendInfo();
			System.out.println();
			} 
		} 
	}
	
	public boolean checkPhoneNum(String phone) {
		boolean result = false;
		for (int i = 0; i < indexOfFriend; i++) {
			if (phone.compareTo(friend[i].getPhone()) == 0) {
				result = true;
			}
		}
		return result;
	}
	
	
	public void deleteFriend() {
		//번호입력 받아서 찾은뒤 해당 배열 인스턴스 null값 초기화, 삭제한 i번 인데스 배열 인스턴스에 
		//i+1번 인덱스 배열 인스턴스 값 저장. i<indexOfFriend-1 까지 반복한뒤 indexOfFriend 1감소
		
		System.out.print("Input Phone Number You Want Delete : ");
		Scanner input = new Scanner(System.in);
		String search = input.nextLine();
		
		for (int i = 0; i < indexOfFriend; i++) {
			if(search.equals(friend[i].getPhone())) {
				System.out.println();
				System.out.println(friend[i].getName()+" Has Been Deleted");
				friend[i].deleteFriendInfo();
				for(; i<indexOfFriend-1; i++) {
					friend[i] = friend[i+1]; 								
				}			
				--indexOfFriend;
			} 
		
		}
		System.out.println();
	}
	
}
