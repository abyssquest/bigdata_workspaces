package exam15;

interface Readable{
	public /* abstract */ void read();
}

class OuterClass {
	private String name;
	
	OuterClass(String name){
		this.name = name;
	}
	
	public Readable createLocalClassInst(int num) {
		class LocalClass implements Readable {
			public void read() {
				System.out.println("LocalClass read():" + name);
				System.out.println("num:" + num);
			}
		}
		/* LocalClass 도 가능 */ Readable localClass = new LocalClass();
		return localClass;
	}
}