package quiz09;

public class DescriptiveStatistics {
	private int max;
	private int min;
	private int avg;
	private int sum;
	
	DescriptiveStatistics(){
		max = 0;
		min = 100;
		avg = 0;
		sum = 0;
	}
	
	DescriptiveStatistics(int max, int min, int avg){
		this.max = max;
		this.min = min;
		this.avg = avg;
	}
	
	public void max(int value) { // 최대값
		if(max <= value) { max = value; }
	}
	
	public void min(int value) { // 최소값
		if(min>=value) { min = value; }
	}
	
	public void sum(int value) {
		sum += value;
	}
	
	public void avg() { // 평균값
		avg = sum / 15;
	}
	
	public int showMax() { return max; }
	public int showMin() { return min; }
	public int showAvg() { return avg; }
}
