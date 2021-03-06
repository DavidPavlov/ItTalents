package Inheritance;

public class Student extends Person {
	private static final double DEFAULT_SCORE = 4;
	private double score;

	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		this.setScore(score);
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if (score < 2 || score > 6) {
			this.score = DEFAULT_SCORE;
			System.out.println("Invalid score entered, default has been set !");
			return;
		}
		this.score = score;
	}

	public void showStudentInfo() {
		super.showPersonInfo();
		System.out.printf("Score: %.2f\n", this.score);
	}

}
