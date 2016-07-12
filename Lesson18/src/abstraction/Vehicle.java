package abstraction;

public interface Vehicle {

	public static final String SPEED_MEASURE = "km/h";

	public void turn(String direction);

	public void stop();

	public void accelerate();

}
