package AttendTable;

import java.util.Scanner;

class AttendController {
	private School elementary;
	private School middle;
	private School high;
	
	AttendController() {
		elementary = new School(6, 10, 30);
		middle = new School(3, 10, 40);
		high = new School(3, 10, 40);
	}
	
	// 학생 정보 입력
	public void addStudentInfo() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("학년을 입력하세요.");
		int gradeNum = input.nextInt();
		System.out.println();
		
		System.out.println("학급을 입력하세요.");
		int classNum = input.nextInt();
		System.out.println();
		
		System.out.println("번호을 입력하세요.");
		int idNumber = input.nextInt();
		System.out.println();
		
	}
	
	// 학생 정보 확인 (by 이름)
	public void searchStudentInfo() {
		
	}
	
	// 학생 정보 삭제 (by 이름)
	public void deleteStudentInfo() {
		
	}
	
	public boolean checkName (String name) {
		boolean result = false;
//		for (int i = 0; i < ; i++) {
//			for (int j = 0; j < ; j++) {
//				for (int k = 0; k < ; k++) {
//				}
//			}
//		}
		return result;
	}
}
