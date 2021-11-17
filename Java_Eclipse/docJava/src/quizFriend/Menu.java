package quizFriend;

import java.util.Scanner;

class Menu {
	FriendController controller;

	Menu() {
		controller = new FriendController();
	}

	public void displayMenu() {
		while (true) {
			System.out.println("    ***** 메뉴 선택 *****");
			System.out.println();
			System.out.println(" 0. 프 로 그 램   종     료");
			System.out.println(" 1. 중 학 교 친구 정보 입력");
			System.out.println(" 2. 고등학교 친구 정보 입력");
			System.out.println(" 3. 대 학 교 친구 정보 입력");
			System.out.println();
			System.out.println(" 4. 모든친구 전체 정보 출력");
			System.out.println(" 5. 모든친구 기본 정보 출력");
			System.out.println(" 6. 중 학 교 친구 정보 출력");
			System.out.println(" 7. 고등학교 친구 정보 출력");
			System.out.println(" 8. 대 학 교 친구 정보 출력");
			System.out.println();
			System.out.println(" 9. 전화번호 기반 친구 검색");
			System.out.println("10. 저장된 친구 주소록 삭제");
			System.out.println();
			System.out.println("원하는 항목 번호를 선택하세요 >>");

			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			System.out.println();

			switch (choice) {
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			case 1: case 2: case 3:
				controller.addFriendInfo(choice); // 친구정보 입력 통합
				break;
			case 4: case 5: case 6: case 7: case 8:
				controller.displayFriendInfo(choice); // 친구정보 출력 통합
				break;
			case 9:
				controller.searchFriendInfo(); // 친구정보 검색
				break;
			case 10:
				controller.deleteFriendInfo(); // 친구정보 삭제
				break;
			default:
				System.out.println("잘못된 입력을 하셧습니다.");
				System.out.println("번호를 확인 하세요.");
				break;
			}
			System.out.println();
		}
	}
}