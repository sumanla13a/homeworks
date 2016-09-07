public class Main {
	public static void main(String[] args) {
		Section newStudentSection = new Section(101);
		ArrayList<Section> newStudentSections = new ArrayList<Section>; // TODO: add params
		newStudentSections.add(newStudentSection);
		Student newStudent = new Student("Suman", newStudentSections);
	}
}