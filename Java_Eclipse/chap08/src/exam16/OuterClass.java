package exam16;

interface Readable{
	public /* abstract */ void read();
}

class OuterClass {
	private String name;
	
	OuterClass(String name){
		this.name = name;
	}
	
	public Readable createLocalClassInst(int num) {
		
		return new Readable() {
			// Overriding
			public void read() {
				System.out.println("LocalClass read():" + name);
				System.out.println("num:" + num);
			}
		};
		
		/*
		class LocalClass implements Readable {
			
		}
		Readable localClass = new LocalClass();
		return localClass;
		*/
	}
}