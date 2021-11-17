package exam05.cal;

public class Calculator { // 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산
	Add add;
	Sub sub;
	Multi multi;
	Div div;
	Remain remain;
	
	public Calculator() {
		add = new Add();  // 한개 클래스만 public 주기 위해
		sub = new Sub();
		multi = new Multi();
		div = new Div();
		remain = new Remain();
	}
	
	public int addTwoNum(int n1, int n2) {
		return add.addTwoNumber(n1, n2);
	}
	
	public double addTwoDouble(double n1, double n2) {
		return add.addTwoDouble(n1, n2);
	}
	
	public int subTwoNum(int n1, int n2) {
		return sub.subTwoNumber(n1, n2);
	}
	
	public double subTwoDouble(double n1, double n2) {
		return sub.subTwoDouble(n1, n2);
	}
	
	public int multiTwoNum(int n1, int n2) {
		return multi.multiTwoNumber(n1, n2);
	}
	
	public int divTwoNum(int n1, int n2) {
		return div.divTwoNumber(n1, n2);
	}
	
	public int remainTwoNum(int n1, int n2) {
		return remain.remainTwoNumber(n1, n2);
	}
	
	public void showOperationTimes() {
		System.out.println("덧셈 횟수 : " + add.getCountAdd());
		System.out.println("뺄셈 횟수 : " + sub.getCountSub());
		System.out.println("곱셈 횟수 : " + multi.getCountMulti());
		System.out.println("나눗셈 횟수 : " + div.getCountDiv());
		System.out.println("나머지 연산 횟수 : " + remain.getCountRemain());
	}
}

class Add {
	private int countAdd;
	
	Add (){
		this.countAdd = 0;
	}
	
	int addTwoNumber(int num1, int num2) {
		countAdd++;
		return num1 + num2;
	}
	
	double addTwoDouble(double num1, double num2) {
		countAdd++;
		return num1 + num2;
	}
	
	int getCountAdd() {
		return countAdd;
	}
}

class Sub {
	private int countSub;
	
	Sub(){
		this.countSub = 0;
	}
	
	int subTwoNumber(int num1, int num2) {
		countSub++;
		return num1 - num2;
	}
	
	double subTwoDouble(double num1, double num2) {
		countSub++;
		return num1 - num2;
	}
	
	int getCountSub() {
		return countSub;
	}
}

class Multi {
	private int countMulti;
		
		Multi() {
			this.countMulti = 0;
		}
		
		int multiTwoNumber(int num1, int num2) {
			countMulti++;
			return num1 * num2;
		}
		
		int getCountMulti() {
			return countMulti;
		}
}

class Div {
	private int countDiv;
	
	Div() {
		this.countDiv = 0;
	}
	
	int divTwoNumber(int num1, int num2) {
		countDiv++;
		return num1 / num2;
	}
	
	int getCountDiv() {
		return countDiv;
	}
}

class Remain {
	private int countRemain;
	
	Remain() {
		this.countRemain = 0;
	}
	
	int remainTwoNumber(int num1, int num2) {
		countRemain++;
		return num1 % num2;
	}
	
	int getCountRemain() {
		return countRemain;
	}
}