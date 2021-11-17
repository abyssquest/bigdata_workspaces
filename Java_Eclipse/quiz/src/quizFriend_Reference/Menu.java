package quizFriend_Reference;

import java.util.Scanner;

class Menu {
	FriendInfoController controller;

	Menu(){
		controller = new FriendInfoController();
		controller.readDataFileSystem();
	}
	
	public void displayMenu(){
		
		while(true){
			System.out.println("\n\n*** 메뉴 선택 ***");
			System.out.println(" 0. 프로그램 종료");
			System.out.println(" 1. 중학교 친구 정보 입력");
			System.out.println(" 2. 고교 정보 입력");
			System.out.println(" 3. 대학 친구 정보 입력");
			
			System.out.println(" 4. 중학교/고등학교/대학교 친구 전체 정보 출력");
			System.out.println(" 5. 친구 기본 정보 출력.");
			System.out.println(" 6. 중학교 친구 정보 출력");
			System.out.println(" 7. 고교 친구 정보 출력");
			System.out.println(" 8. 대학교 친구 정보 출력");
			
			System.out.println(" 9. 데이터 검색 기능");
			System.out.println("10. 데이터 삭제 기능");
			
			
			System.out.print("원하는 항목 번호을 선택하세요 >> ");
			
			Scanner keyboard = new Scanner(System.in);
			int choice = keyboard.nextInt();
			
			switch(choice){
				case 0:
					controller.writeDataFileSystem();
					System.out.println("프로그램을 종료합니다.");
					return;
				case 1:	case 2:	case 3:
					controller.addFriend(choice);
					break;
				case 4: case 5: case 6: case 7: case 8:
					controller.displayFriendInfo(choice);
					break;
				case 9:
					controller.searchData();
					break;
				case 10:
					controller.deleteData();
					break;
				default:
					System.out.println("잘못된 번호를 입력하셨습니다.");
					System.out.println("번호를 확인하세요.");
					break;
			}
		}
	}
}
