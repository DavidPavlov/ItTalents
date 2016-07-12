package models;

public class Child {
	double foodCost;
	double toyCosts;

	public Child(double foodCost) {
		this.foodCost = foodCost;

	}

	public double getToyCosts() {
		return toyCosts;
	}

	public void addToyCosts(double toyCost) {
		this.toyCosts += toyCost;
	}

	public double getFoodCost() {
		return foodCost;
	}

}
