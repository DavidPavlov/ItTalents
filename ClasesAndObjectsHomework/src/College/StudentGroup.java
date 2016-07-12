package College;

public class StudentGroup {

	private static final int places = 5;

	private String groupSubject;
	private Student[] students;
	private int freePlaces;

	public StudentGroup() {
		this.students = new Student[places];
		this.freePlaces = this.students.length;
	}

	public StudentGroup(String groupSubject) {
		this();
		this.groupSubject = groupSubject;
	}

	public String getGroupSubject() {
		return groupSubject;
	}

	public void setGroupSubject(String groupSubject) {
		this.groupSubject = groupSubject;
	}

	public int getFreePlaces() {
		return freePlaces;
	}

	public void setFreePlaces(int freePlaces) {
		this.freePlaces = freePlaces;
	}

	public Student[] getStudents() {
		return students;
	}

	public void addStudent(Student s) {
		if (this.freePlaces > 0 && s.getSubject().equals(this.groupSubject)) {
			this.students[this.students.length - this.freePlaces] = s;
			this.freePlaces--;
		}
	}

	public void emptyGroup() {
		this.students = new Student[places];
		this.freePlaces = this.students.length;
	}

	public String theBestStudent() {
		Student best = this.students[0];
		for (int i = 1; i < this.students.length - this.freePlaces; i++) {
			if (this.students[i].getGrade() > best.getGrade()) {
				best = this.students[i];
			}
		}
		return best.getName();

	}

	public String printStudentsInGroup() {
		StringBuilder output = new StringBuilder();
		output.append(String.format("Subject: %s\n", this.groupSubject));
		for (int i = 0; i < this.students.length - this.freePlaces; i++) {
			Student s = this.students[i];
			output.append(String.format("Name: %s\nGrade: %.2f\nYear: %d\nAge: %d\nMoney: %.2f\n", s.getName(),
					s.getGrade(), s.getYearInCollege(), s.getAge(), s.getMoney()));
		}
		return output.toString();
	}
}
