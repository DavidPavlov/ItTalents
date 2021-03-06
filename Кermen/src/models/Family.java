package models;

import java.util.ArrayList;

public class Family {
	private double budget;
	private ArrayList<ElConsumer> consumers;
	private double roomsElCost;
	private boolean isBankrupt = false;

	public Family(double roomsElCost) {
		this.consumers = new ArrayList<ElConsumer>();
		this.roomsElCost = roomsElCost;
	}

	public double getBudget() {
		return budget;
	}

	public ArrayList<ElConsumer> getConsumers() {
		return consumers;
	}

	public double getRoomsElCost() {
		return roomsElCost;
	}

	public void addBudget(double salary) {
		this.budget += salary;
	}

	public void addConsumer(ElConsumer cons) {
		this.consumers.add(cons);
	}

	public void payBill(double sum) {
		this.budget -= sum;
		if (this.budget < 0) {
			this.isBankrupt = true;
		}
	}

	public boolean getIsBankrupt() {
		return this.isBankrupt;
	}

	public void paySalary() {
		this.budget += 0;
	}
}
