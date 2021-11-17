package exam01;

public class BasicInheritance {

	public static void main(String[] args) {
		Friend friend = new Friend("홍길동", "19970802", "서울시 종로구", "abc@gmail.com");
		friend.displayFriendInfo();
		System.out.println();
		
		Student student = new Student("홍길동", "19970802", "서울시 종로구", "abc@gmail.com", "더조은IT대학", "경영학");
		//student.displayFriendInfo();
		//System.out.println();
		student.displayStudentInfo();
		System.out.println();
		
		BusinessFriend bFriend = new BusinessFriend("이순신", "19960702", "서울시 중구", "xyz@gmail.com", "더조은IT", "영업부", "123456");
		bFriend.displayBusinessFriendInfo();
	}
}
