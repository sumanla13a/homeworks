package prob2C;

public class Section {
	public int sectionNum;
	private ArrayList<Student> studentList;
	public Section(int newStudentSectionNum, ArrayList<Student> newStudentList) {
		sectionNum = newStudentSectionNum;
		studentList = newStudentList;
	}
}