package College;

public class Student {

	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;

	public Student() {
		this.setGrade(4.0);
		this.setYearInCollege(1);
		this.setDegree(false);
		this.setMoney(0);
	}

	public Student(String name, String subject, int age) {
		this();
		this.setName(name);
		this.setSubject(subject);
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public int getYearInCollege() {
		return yearInCollege;
	}

	public void setYearInCollege(int yearInCollege) {
		this.yearInCollege = yearInCollege;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isDegree() {
		return isDegree;
	}

	public void setDegree(boolean isDegree) {
		this.isDegree = isDegree;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public void upYear() {
		if (this.isDegree) {
			System.out.println("The student is already graduated.");
			return;
		}
		this.setYearInCollege(this.yearInCollege + 1);
		if (this.yearInCollege == 4) {
			this.setDegree(true);
		}
	}

	public double recieveScholarship(double min, double amount) {
		if (this.age < 30 && this.grade >= min) {
			this.setMoney(this.money + amount);
		}
		return this.money;
	}
}
