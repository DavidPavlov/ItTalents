
public class Computer {

	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;

	public Computer() {
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}

	public Computer(int year, double price, int hardDiskMemory, int freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}

	public Computer(int year, double price, boolean isNotebook, int hardDiskMemory, int freeMemory,
			String operationSystem) {
		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;
	}

	public int comparePrice(Computer c) {
		if (c.price == this.price) {
			return 0;
		}
		return c.price > this.price ? 1 : -1;
	}

	void changeOperationSystem(String newOperationSystem) {
		if (!newOperationSystem.equals(operationSystem)) {
			operationSystem = newOperationSystem;
		}

	}

	void useMemory(int memory) {
		if (freeMemory >= memory) {
			freeMemory -= memory;
		} else {
			System.out.println("Not enough free memory");
		}
	}

}
