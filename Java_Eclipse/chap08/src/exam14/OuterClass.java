package exam14;

class OuterClass {
	private String myName;
	private int num;
	InnerClass innerClass;
	
	OuterClass(String name){
		this.myName = name;
		this.num = 0;
		
		innerClass = new InnerClass();
		
		whoAreYou();
	}
	
	public void whoAreYou() {
		num++;
		System.out.println(myName + " OuterClass " + num);
	}
	
	class InnerClass{
		
		InnerClass() {
			
		}
	}

}
