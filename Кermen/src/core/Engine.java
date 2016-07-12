package core;

import java.util.ArrayList;

import models.AloneOld;
import models.AloneYoung;
import models.Child;
import models.ElConsumer;
import models.Family;
import models.OldCouple;
import models.YoungCouple;
import models.YoungCoupleWithChildren;

public class Engine {

	private FamilyFactory factory;
	private IO io;
	private ArrayList<Family> families;
	private int population;

	public Engine() {
		this.io = new IO();
		this.factory = new FamilyFactory();
		this.families = new ArrayList<Family>();
	}

	public void run() {
		String line = io.readLine();
		int count = 1;
		while (!line.equals("Democracy")) {
			if (count == 3) {
				count = 0;
				this.paySalaries();
			}
			runCommand(line);

			count++;
			line = io.readLine();
		}
		int population = 0;
		for (Family family : families) {
			if (family instanceof AloneOld || family instanceof AloneYoung) {
				population++;
			} else if (family instanceof YoungCouple || family instanceof OldCouple) {
				population += 2;
			} else {
				population += 2;
				population += ((YoungCoupleWithChildren) family).getChildren().size();
			}
		}
		this.io.print("Total population: " + population + "\n");
	}

	private void runCommand(String line) {
		if (line.equals("EVN")) {
			this.io.print(this.printTotal());
		} else if (line.equals("EVN bill")) {
			this.billPeople();
		} else {
			this.families.add(this.factory.create(line));
		}
	}

	private String printTotal() {
		double bill = 0;
		for (Family family : families) {
			if (family instanceof YoungCoupleWithChildren) {
				for (Child child : ((YoungCoupleWithChildren) family).getChildren()) {
					bill += child.getFoodCost();
					bill += child.getToyCosts();
				}
			}
			bill += family.getRoomsElCost();
			for (ElConsumer cons : family.getConsumers()) {
				bill += cons.getElCost();
			}
		}
		return String.format("Total consumption: " + bill + "\n");
	}

	private void billPeople() {
		ArrayList<Family> famsToRemove = new ArrayList<Family>();
		for (Family family : families) {
			double bill = 0;
			if (family instanceof YoungCoupleWithChildren) {
				for (Child child : ((YoungCoupleWithChildren) family).getChildren()) {
					bill += child.getFoodCost();
					bill += child.getToyCosts();
				}
			}
			bill += family.getRoomsElCost();
			for (ElConsumer cons : family.getConsumers()) {
				bill += cons.getElCost();
			}
			family.payBill(bill);
			if (family.getIsBankrupt()) {
				famsToRemove.add(family);
			}
		}
		for (Family family : famsToRemove) {
			this.families.remove(family);
		}
	}

	private void paySalaries() {
		for (Family family : families) {
			family.paySalary();
		}
	}
}
