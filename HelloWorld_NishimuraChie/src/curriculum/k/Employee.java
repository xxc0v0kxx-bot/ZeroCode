package curriculum.k;

abstract public class Employee implements SalaryReporter {
	private String name;
	private int hours;

	public Employee(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}

	public String getName() {
		return name;
	}

	public int getHours() {
		return hours;
	}

	public abstract int calculateSalary();

}
