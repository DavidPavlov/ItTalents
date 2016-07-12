
public class ComputerDemo {
	public static void main(String[] args) {
		Computer apple = new Computer();
		Computer dell = new Computer();

		apple.year = 2016;
		apple.price = 3500.99;
		apple.hardDiskMemory = 200;
		apple.freeMemory = 150;
		apple.operationSystem = "ShitOs";

		dell.year = 2016;
		dell.price = 1500;
		dell.hardDiskMemory = 1000;
		dell.freeMemory = 720;
		dell.operationSystem = "Windows 10";
		dell.isNotebook = true;

		apple.useMemory(100);
		dell.changeOperationSystem("Windows 11");

		int compare = apple.comparePrice(dell);

		if (compare == 1) {
			System.out.println("Dell's price is higher than apple's");
		} else if (compare == -1) {
			System.out.println("Apple's price is higher than dell's");
		} else {
			System.out.println("Computers are with equal price");
		}

		System.out.printf(
				"Computer:\nName: Apple\n Year: %d\n Price: %.2f\n HardDiskMemory: %d\n FreeMemory: %d\n OperationSystem: %s\n Notebook: %s\n",
				apple.year, apple.price, apple.hardDiskMemory, apple.freeMemory, apple.operationSystem,
				apple.isNotebook);
		System.out.printf(
				"Computer:\nName: Dell\n Year: %d\n Price: %.2f\n HardDiskMemory: %d\n FreeMemory: %d\n OperationSystem: %s\n Notebook: %s\n",
				dell.year, dell.price, dell.hardDiskMemory, dell.freeMemory, dell.operationSystem, dell.isNotebook);

	}
}
