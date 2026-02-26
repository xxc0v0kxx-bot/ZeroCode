package curriculum.i;

class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	static final int hourly_Rate = 1250;
	
	@Override
	public int calculateDailyWage(int hoursWorked) {
		int overtime = Math.max(0, hoursWorked - 8);
		int regularHours = hoursWorked - overtime;
		return (regularHours * hourly_Rate) + (int) (overtime * hourly_Rate * 1.25);
	}
}
