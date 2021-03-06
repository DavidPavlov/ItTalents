package Inheritance;

public class Employee extends Person {

	private double daySalary;

	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		this.setDaySalary(daySalary);
	}

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		if (daySalary < 0) {
			this.daySalary = 10;
			System.out.println("Invalid day salary entered, default has been set !");
			return;
		}
		this.daySalary = daySalary;
	}

	public double calculateOvertime(double hours) {
		if (this.getAge() < 18) {
			return 0;
		}
		return (this.daySalary / 8) * hours * 1.5;
	}

	public void showEmployeeInfo() {
		super.showPersonInfo();
		System.out.printf("Day Salary: %.2f\n", this.daySalary);
	}

}
