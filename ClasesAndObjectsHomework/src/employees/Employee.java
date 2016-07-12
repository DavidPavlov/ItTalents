package employees;

public class Employee {
	private String name;
	private Task currentTask;
	private int hoursLeft;

	public Employee(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.isEmpty() || name == null) {
			// it should throw an exception instead of printing on the console
			// :)
			System.out.println("The employee's name is not valid!!!");
			return;
		}
		this.name = name;
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if (currentTask != null) {
			this.currentTask = currentTask;
		}
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft < 0) {
			// exception here too
			System.out.println("Hours left should be non-negative number");
			return;
		}
		this.hoursLeft = hoursLeft;
	}

	public void work() {
		if (this.hoursLeft >= this.currentTask.getWorkingHours()) {
			this.setHoursLeft(this.hoursLeft - this.currentTask.getWorkingHours());
			this.currentTask.setWorkingHours(0);
		} else {
			int workHours = currentTask.getWorkingHours();
			this.currentTask.setWorkingHours(workHours - this.hoursLeft);
			this.setHoursLeft(0);
		}
		this.showReport();
	}

	private void showReport() {
		System.out.printf("Name: %s\nTask Name: %s\nEmployee working hours left: %d\nTask hours left: %d\n\n",
				this.name, this.currentTask.getName(), this.hoursLeft, this.currentTask.getWorkingHours());
	}
}
