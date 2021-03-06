package models;

public class YoungCouple extends Family {

	private Person male;
	private Person female;

	public YoungCouple(double salary1, double salary2) {
		super(40);
		this.male = new Person(salary1);
		this.female = new Person(salary2);
	}

	public Person getMale() {
		return male;
	}

	public Person getFemale() {
		return female;
	}

	@Override
	public void paySalary() {
		super.addBudget(this.male.getSalary());
		super.addBudget(this.female.getSalary());
	}

}
