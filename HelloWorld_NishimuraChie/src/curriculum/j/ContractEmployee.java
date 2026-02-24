package curriculum.j;

class ContractEmployee extends Employee {
	public ContractEmployee(String id, String name) {
		super(id, name);
	}

	static final int hourlyRate = 1000;

	@Override
	public int costForDay(int hoursWorked) {

		return hoursWorked * hourlyRate;
	}

}
