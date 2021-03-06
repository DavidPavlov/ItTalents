package models;

import java.util.ArrayList;

public class YoungCoupleWithChildren extends Family {
	private Person male;
	private Person female;
	ArrayList<Child> children;

	public YoungCoupleWithChildren(double salary1, double salary2) {
		super(60);
		this.male = new Person(salary1);
		this.female = new Person(salary2);
		this.children = new ArrayList<Child>();
	}

	public ArrayList<Child> getChildren() {
		return children;
	}

	public Person getMale() {
		return male;
	}

	public Person getFemale() {
		return female;
	}

	public void addChild(Child child) {
		this.children.add(child);
	}

	@Override
	public void paySalary() {
		super.addBudget(this.male.getSalary());
		super.addBudget(this.female.getSalary());
	}
}
