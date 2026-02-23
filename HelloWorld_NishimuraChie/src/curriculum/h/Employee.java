package curriculum.h;

public abstract class Employee {

	private String employeeId;
	private String name;

	Employee(String id, String name) {
		this.employeeId = id;
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public void setEmployeeId(String id) {
		this.employeeId = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract int calculateDailyWage(int hoursWorked);

}
