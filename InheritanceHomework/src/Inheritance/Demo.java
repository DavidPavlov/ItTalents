package Inheritance;

public class Demo {
	public static void main(String[] args) {
		Person[] persons = new Person[10];
		persons[0] = new Person("Pesho", 20, true);
		persons[1] = new Employee("Gosho", 30, true, 121.50);
		persons[2] = new Person("Stamat", 40, true);
		persons[3] = new Employee("Maria", 17, false, 11.60);
		persons[4] = new Student("Penka", 12, false, 3.00);
		persons[5] = new Student("Misho", 15, true, 5.50);

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] == null) {
				continue;
			}
			if (persons[i].getClass().equals(Employee.class)) {
				System.out.println("Type: Employee");
				Employee e = (Employee) (persons[i]);
				e.showEmployeeInfo();
			} else if (persons[i].getClass().equals(Student.class)) {
				System.out.println("Type: Student");
				Student s = (Student) (persons[i]);
				s.showStudentInfo();
			} else {
				System.out.println("Type: Person");
				persons[i].showPersonInfo();
			}
		}
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] == null) {
				continue;
			}
			if (persons[i].getClass().equals(Employee.class)) {
				Employee e = (Employee) (persons[i]);
				System.out.print(e.getName() + " overtime for 2 hours: ");
				System.out.printf("%.2f\n", e.calculateOvertime(2));
			}
		}
	}
}
