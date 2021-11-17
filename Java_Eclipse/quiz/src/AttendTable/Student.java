package AttendTable;

class Student {
	private String name;
	private int score;
	
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() { return name; }
	public int getScore() { return score; }
	public void setScore(int score) { this.score = score; }
}
