package core;

import models.AloneOld;
import models.AloneYoung;
import models.Child;
import models.ElConsumer;
import models.Family;
import models.OldCouple;
import models.YoungCouple;
import models.YoungCoupleWithChildren;;

public class FamilyFactory {

	public Family create(String line) {
		String command = line.substring(0, line.indexOf('('));
		line = line.substring(line.indexOf('('));
		switch (command) {
		case "YoungCouple":
			return this.createYoungCouple(line);
		case "YoungCoupleWithChildren":
			return this.createYoungCoupleWithChildren(line);
		case "AloneYoung":
			return createAloneYoung(line);
		case "OldCouple":
			return this.createOldCouple(line);
		case "AloneOld":
			return createAloneOld(line);
		default:
			return null;
		}
	}

	private YoungCouple createYoungCouple(String line) {
		String[] commandArgs = line.split(" [A-Z]");
		String[] salaries = commandArgs[0].substring(1, commandArgs[0].length() - 1).split(", ");
		double salary1 = Double.parseDouble(salaries[0]);
		double salary2 = Double.parseDouble(salaries[1]);
		YoungCouple family = new YoungCouple(salary1, salary2);
		for (int i = 1; i < commandArgs.length; i++) {
			String cons = commandArgs[i].substring(commandArgs[i].indexOf('(') + 1, commandArgs[i].indexOf(')'));
			family.addConsumer(new ElConsumer(Double.parseDouble(cons)));
			if (i == commandArgs.length - 1) {
				family.addConsumer(new ElConsumer(Double.parseDouble(cons)));
			}
		}
		return family;
	}

	private YoungCoupleWithChildren createYoungCoupleWithChildren(String line) {
		String[] commandArgs = line.split(" [A-Z]");
		String[] salaries = commandArgs[0].substring(1, commandArgs[0].length() - 1).split(", ");
		double salary1 = Double.parseDouble(salaries[0]);
		double salary2 = Double.parseDouble(salaries[1]);
		YoungCoupleWithChildren family = new YoungCoupleWithChildren(salary1, salary2);
		for (int i = 1; i < 4; i++) {
			String cons = commandArgs[i].substring(commandArgs[i].indexOf('(') + 1, commandArgs[i].indexOf(')'));
			family.addConsumer(new ElConsumer(Double.parseDouble(cons)));
			if (i == 3) {
				family.addConsumer(new ElConsumer(Double.parseDouble(cons)));
			}
		}
		for (int i = 4; i < commandArgs.length; i++) {
			String[] childExpences = commandArgs[i]
					.substring(commandArgs[i].indexOf('(') + 1, commandArgs[i].indexOf(')')).split(", ");
			Child child = new Child(Double.parseDouble(childExpences[0]));
			for (int j = 1; j < childExpences.length; j++) {
				child.addToyCosts(Double.parseDouble(childExpences[j]));
			}
			family.addChild(child);
		}
		return family;
	}

	private OldCouple createOldCouple(String line) {
		String[] commandArgs = line.split(" [A-Z]");
		String[] salaries = commandArgs[0].substring(1, commandArgs[0].length() - 1).split(", ");
		double salary1 = Double.parseDouble(salaries[0]);
		double salary2 = Double.parseDouble(salaries[1]);
		OldCouple family = new OldCouple(salary1, salary2);
		for (int i = 1; i < commandArgs.length; i++) {
			String cons = commandArgs[i].substring(commandArgs[i].indexOf('(') + 1, commandArgs[i].indexOf(')'));
			family.addConsumer(new ElConsumer(Double.parseDouble(cons)));
		}
		return family;
	}

	private AloneYoung createAloneYoung(String line) {
		String[] commandArgs = line.split(" [A-Z]");
		String[] salaries = commandArgs[0].substring(1, commandArgs[0].length() - 1).split(", ");
		double salary1 = Double.parseDouble(salaries[0]);
		AloneYoung family = new AloneYoung(salary1);
		for (int i = 1; i < commandArgs.length; i++) {
			String cons = commandArgs[i].substring(commandArgs[i].indexOf('(') + 1, commandArgs[i].indexOf(')'));
			family.addConsumer(new ElConsumer(Double.parseDouble(cons)));
		}
		return family;
	}

	private AloneOld createAloneOld(String line) {
		String[] commandArgs = line.split(" [A-Z]");
		String[] salaries = commandArgs[0].substring(1, commandArgs[0].length() - 1).split(", ");
		double salary1 = Double.parseDouble(salaries[0]);
		AloneOld family = new AloneOld(salary1);

		return family;
	}
}
