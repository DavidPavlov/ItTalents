package models;

public class OldCouple extends Family {

	private Person male;
	private Person female;

	public OldCouple(double pension1, double pension2) {
		super(45);
		this.male = new Person(pension1);
		this.female = new Person(pension2);
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
