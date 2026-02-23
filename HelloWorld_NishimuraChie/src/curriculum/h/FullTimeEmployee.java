package curriculum.h;

class FullTimeEmployee extends Employee {

	private static final int HOURLY_RATE = 1200;

	FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		if (hoursWorked <= 8) {
			return HOURLY_RATE * hoursWorked;
		} else {
			return (int) (HOURLY_RATE * 8 + (hoursWorked - 8) * HOURLY_RATE * 1.25);
		}

	}
}
