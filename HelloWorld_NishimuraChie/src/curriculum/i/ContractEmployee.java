package curriculum.i;

class ContractEmployee extends Employee {
	public ContractEmployee(String id, String name) {
		super(id, name);
	}

	static final int hourly_Rate = 1000;
	@Override
	public int calculateDailyWage(int hoursWorked) {
		return hoursWorked * hourly_Rate;
	}
}
