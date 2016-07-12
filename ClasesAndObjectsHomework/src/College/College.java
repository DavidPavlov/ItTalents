package College;
public class College {
	public static void main(String[] args) {
		Student pesho = new Student("Pesho", "IT", 20);
		Student gosho = new Student("Gosho", "IT", 21);
		Student ivan = new Student("Ivan", "IT", 22);
		Student maria = new Student("Maria", "IT", 23);
		Student didi = new Student("Didi", "Law", 24);
		Student stamat = new Student("Stamat", "Law", 25);
		Student lubo = new Student("Lubo", "Law", 26);

		gosho.upYear();
		pesho.upYear();
		maria.upYear();
		stamat.upYear();
		lubo.upYear();
		pesho.recieveScholarship(3, 1200);
		gosho.setGrade(6.00);
		gosho.recieveScholarship(6, 3000);
		stamat.recieveScholarship(3.50, 500);
		stamat.setGrade(5.50);
		StudentGroup it = new StudentGroup("IT");
		it.addStudent(pesho);
		it.addStudent(gosho);
		it.addStudent(ivan);
		it.addStudent(maria);
		StudentGroup law = new StudentGroup("Law");
		law.addStudent(stamat);
		law.addStudent(lubo);
		law.addStudent(didi);

		System.out.println(it.theBestStudent());
		System.out.println(law.theBestStudent());
		System.out.println(it.printStudentsInGroup());
		System.out.println(law.printStudentsInGroup());
	}
}
