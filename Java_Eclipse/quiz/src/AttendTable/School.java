package AttendTable;

class School {
	private int gradeOfSchool;
	private int classNumOfGrade;
	private int studentNumOfClass;
	private Student[][][] attendbook;

	School(int gradeOfSchool, int classNumOfGrade, int studentNumOfClass){
		this.gradeOfSchool = gradeOfSchool;
		this.classNumOfGrade = classNumOfGrade;
		this.studentNumOfClass = studentNumOfClass;
		attendbook = new Student[this.gradeOfSchool][this.classNumOfGrade][this.studentNumOfClass];
	}
}