package exam08;

class Singleton{
	private static Singleton instance = new Singleton();
	
	Singleton() {}
	
	public static Singleton getInstance() {
		return instance;
	}
}

public class UseSingleton {
	public static void main(String[] args) {
		//Singleton s1 = new Singleton();
		//Singleton s2 = new Singleton();
		//Singleton s3 = new Singleton();
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();

	}
}
