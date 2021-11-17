package quizFriend_Reference;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class FriendInfoController {
	Set<Friend> set;
	
	FriendInfoController(){
		set = new HashSet<Friend>();
	}
	
	private void readName(String name) throws NameInputException{
			
		if(name.length() == 1){
			NameInputException nameExcep = new NameInputException();
			throw nameExcep;
		}
	}

	public void addFriend(int choice){
		Scanner keyboard = new Scanner(System.in);
		String name=null, phoneNum=null, address=null, work=null, major=null, married=null;
		boolean nameChk = true;
		
		while(nameChk) {
			System.out.print("이름을 입력하세요 : ");
			name = keyboard.nextLine();
			try {
				readName(name);
				nameChk = false;
			} catch (NameInputException e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
		
		System.out.print("폰번호를 입력하세요 : ");
		phoneNum = keyboard.nextLine();
		
		System.out.print("주소를 입력하세요 : ");
		address = keyboard.nextLine();
		
		if(choice == 1){ // 중학교
			System.out.print("기혼/미혼 여부를 입력하세요 : ");
			married = keyboard.nextLine();
			
			set.add(new MiddleFriend(name, phoneNum, address, married));
			
		}else if(choice == 2){ // 고등학교
			System.out.print("직업을 입력하세요 : ");
			work = keyboard.nextLine();
			
			set.add(new MiddleFriend(name, phoneNum, address, work));
			
		}else if(choice == 3){ // 대학교
			System.out.print("전공을 입력하세요 : ");
			major = keyboard.nextLine();
			
			set.add(new MiddleFriend(name, phoneNum, address, major));
			
		}else{
			System.out.println("번호를 확인하세요.");
			return;
		}
	}
	
	public void displayFriendInfo(int choice) {
		
		switch(choice) {
		case 4:
			for(Friend e : set) {
				e.displayFriendInfo();
			}
			break;
		case 5:
			for(Friend e : set) {
				e.displayBasicFriendInfo();
			}
			break;
		case 6:
			for(Friend e : set) {
				if(e instanceof MiddleFriend) {
					e.displayFriendInfo();
				}
			}
			break;
		case 7:
			for(Friend e : set) {
				if(e instanceof HighFriend) {
					e.displayFriendInfo();
				}
			}
			break;
		case 8:
			for(Friend e : set) {
				if(e instanceof UnivFriend) {
					e.displayFriendInfo();
				}
			}
			break;
		}
	}
	
	
	public void searchData(){
		System.out.print("검색할 친구 폰번호를 입력하세요 :");
		Scanner keyboard = new Scanner(System.in);
		String phoneNum = keyboard.nextLine();
		
		for(Friend e : set){
			if(e.getPhoneNum().equals(phoneNum)){
				e.displayFriendInfo();
				return;
			}
		}
		
		System.out.println("일치하는 폰번호가 없습니다.");
	}
	
	public void deleteData(){
		System.out.print("주소록 삭제할 친구 폰번호를 입력하세요 : ");
		Scanner keyboard = new Scanner(System.in);
		String phoneNum = keyboard.nextLine();
		
		for(Friend e : set) {
			if(e.getPhoneNum().equals(phoneNum)){
				set.remove(e);
				System.out.println("삭제가 완료되었습니다.");
				return;
			}
		}
	}
	
	class NameInputException extends Exception{
		public NameInputException(){
			super("한 글자의 이름은 입력하실 수 없습니다.");
		}
	}
	
	public void writeDataFileSystem() {
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream(new FileOutputStream("friend.obj"));
			out.writeObject(set);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
				try {
					if(out != null) {out.close();}
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
		}
	}
	
	public void readDataFileSystem() {
		ObjectInputStream in = null;
		
		try {
			in = new ObjectInputStream(new FileInputStream("friend.obj"));
			set = (HashSet <Friend>) in.readObject();
			
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(in != null) {in.close();}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

