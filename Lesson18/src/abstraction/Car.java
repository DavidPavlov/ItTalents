package abstraction;

public class Car implements Vehicle {

	private int currentSpeed;

	@Override
	public void turn(String direction) {
		System.out.println("Turning" + direction);
	}

	@Override
	public void stop() {
		System.out.println("Uses brakes");
	}

	@Override
	public void accelerate() {
		System.out.println("Speed up");
		currentSpeed++;
	}

}
