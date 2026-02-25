package curriculum.i;

abstract class Employee {
	private String id;
	private String name;

	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	// Mainで出力できるようにgetterを追加
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	abstract public int calculateDailyWage(int hoursWorked);
		

}
