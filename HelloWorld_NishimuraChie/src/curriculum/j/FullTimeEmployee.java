package curriculum.j;

public class FullTimeEmployee extends Employee {

	public FullTimeEmployee(String id, String name) {
		super(id, name);

	}

	static final int HOURLY_RATE = 1250;

	@Override
	public int costForDay(int hoursWorked) {
		int overtime = Math.max(0, hoursWorked - 8);
		int regularHours = hoursWorked - overtime;
		return (regularHours * HOURLY_RATE) + (int) (overtime * HOURLY_RATE * 1.25);
	}

}
