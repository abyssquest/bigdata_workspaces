package AttendTable;

import java.util.Scanner;

class AttendMenu {
	AttendController controller;
	
	AttendMenu(){
		controller = new AttendController();
	}
	
	public void displayMenu() {
		while(true) {
			System.out.println("학생 점수 관리 프로그램");
			System.out.println();
			System.out.println("1. 학생 정보 저장");
			System.out.println("2. 학생 정보 확인");
			System.out.println("3. 학생 정보 삭제");
			System.out.println();
			System.out.println("4. 개 발 자 정보");
			System.out.println("5. 프로그램 종료");
			System.out.println();
			System.out.println("원하는 항목 번호를 선택하세요.");

			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			System.out.println();

			switch (choice) {
			case 1:
				controller.addStudentInfo();
				break;
			case 2:
				controller.searchStudentInfo();
				break;
			case 3:
				controller.deleteStudentInfo();
				break;
			case 4:
				System.out.println("Coding by 김민국");
				System.out.println();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 입력을 하셧습니다.");
				System.out.println("번호를 확인 하세요.");
				break;
			}
		}
	}
}