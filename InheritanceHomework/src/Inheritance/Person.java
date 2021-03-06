package Inheritance;

public class Person {

	private static final int DEFAULT_AGE = 20;

	private String name;
	private int age;
	private boolean isMale;

	public Person(String name, int age, boolean isMale) {
		this.setName(name);
		this.setAge(age);
		this.setMale(isMale);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			this.age = DEFAULT_AGE;
			System.out.println("Invalid input, default age has been set");
			return;
		}
		this.age = age;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public void showPersonInfo() {
		System.out.printf("Name: %s\n Age: %d\n Gender: %s\n", this.name, this.age, isMale ? "Male" : "Female");
	}
}
