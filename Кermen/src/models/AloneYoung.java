package models;

public class AloneYoung extends Family {

	Person person;

	public AloneYoung(double salary) {
		super(10);
		person = new Person(salary);
	}

	public Person getPerson() {
		return person;
	}

	@Override
	public void paySalary() {
		super.addBudget(this.person.getSalary());
	}
}
