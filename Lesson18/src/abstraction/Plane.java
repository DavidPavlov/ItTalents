package abstraction;

public class Plane implements Vehicle {
	@Override
	public void accelerate() {
		System.out.println("Speed is up");

	}

	@Override
	public void turn(String direction) {
		System.out.println("Turning" + direction);

	}

	@Override
	public void stop() {
		System.out.println("Engines lose power");

	}
}
