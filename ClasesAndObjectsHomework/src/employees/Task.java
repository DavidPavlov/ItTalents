package employees;

public class Task {
	private String name;
	private int workingHours;

	public Task(String name, int workingHours) {
		this.setName(name);
		this.setWorkingHours(workingHours);
		// validations are in Setter methods
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.isEmpty() || name == null) {
			// it should throw an exception instead of printing on the console
			// :)
			System.out.println("The name is not valid!!!");
			return;
		}
		this.name = name;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		if (workingHours < 0) {
			// exception here too
			System.out.println("Working hours should be non-negative number");
			return;
		}
		this.workingHours = workingHours;
	}

}
