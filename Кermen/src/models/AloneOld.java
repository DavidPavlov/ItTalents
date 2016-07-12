package models;

public class AloneOld extends Family {
	Person person;

	public AloneOld(double salary) {
		super(15);
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
