package employees;

public class NaiDobrataFirma {
	public static void main(String[] args) {
		AllWork work = new AllWork();
		Task task = new Task("Creating the new Facebook", 100);
		Task task2 = new Task("Implementing interpolation search", 3);
		Task task3 = new Task("Doing some stuff", 2);
		Task task4 = new Task("Doing some more stuff", 4);
		Task task5 = new Task("Doing some more more stuff", 4);
		work.addTask(task);
		work.addTask(task2);
		work.addTask(task3);
		work.addTask(task4);
		work.addTask(task5);
		Employee.setAllWork(work);
		Employee[] workers = new Employee[2];
		
		Employee ivan = new Employee("Ivan");

		Employee maria = new Employee("Maria");
		workers[0] = ivan;
		workers[1] = maria;
		while(!work.isAllWorkDone()){
			for (int i = 0; i < workers.length; i++) {
				workers[i].startWorkingDay();
			}
			for (int i = 0; i < workers.length; i++) {
				if(workers[i].getCurrentTask()== null){
					workers[i].setCurrentTask();
				}
				workers[i].work();
			}
		}

	}
}
