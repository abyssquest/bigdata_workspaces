package practice0806;

import java.util.Scanner;

class Menu {
	
	FriendController controller;
	
	public Menu() {
		this.controller = new FriendController();
	}

	public void displayMenu() {
		while(true) {
			System.out.println("***** Menu Selection *****");
			System.out.println("0. Exit Program");
			System.out.println("1. Save MiddleSchool Friend Info");
			System.out.println("2. Save HighSchool Friend Info");
			System.out.println("3. Save University Friend Info");
			System.out.println("4. Print Friend Info");
			System.out.println("5. Print Basic Friend Info");
			System.out.println("6. Print MiddleSchool Friend Info");
			System.out.println("7. Print HighSchool Friend Info");
			System.out.println("8. Print University Friend Info");
			System.out.println("9. Search Friend Info");
			System.out.println("10. Delete Friend Info");

			
			System.out.println();
			
			System.out.print("Select the number you want >> ");
			
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			System.out.println();

			switch(choice) {
			case 0 :
				System.out.println("Exit Program");
				return;
			case 1 :
			case 2 :
			case 3 :
				controller.addFriend(choice);
				break;
			case 4 :
				controller.displayFriendInfo();
				break;
			case 5 :
				controller.basicFriendInfo();
				break;
			case 6 :	
			case 7 :
			case 8 :
				controller.displayPartialInfo(choice);
				break;
			case 9 :
				controller.searchFriend();
				break;
			case 10 :
				controller.deleteFriend();
				break;	
			default :
				System.out.println("Non-valid input.");
				break;	
			}
			System.out.println();

		}
	}
	
}
