package exam02;

class IntNumber {
	int num;
	
	IntNumber(int num){ this.num = num; }

	@Override
	public boolean equals(Object obj) {
		boolean result;
		
		IntNumber intNum = (IntNumber) obj;
		
		if(this.num == intNum.num)	result = true;
		else						result = false;
		
		return result;
	}
	
	
}
