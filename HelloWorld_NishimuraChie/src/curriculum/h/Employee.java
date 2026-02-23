package curriculum.h;

public abstract class Employee {

	private String employeeId;
	private String name;

	// 引数ありのコンストラクタ thisでMainで指定した情報が入るようにする
	Employee(String id, String name) {
		this.employeeId = id;
		this.name = name;
	}
	
	// Getter（値を取得）
	public String getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}
	
	// Setter（値を変更）
	public void setEmployeeId(String id) {
		this.employeeId = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	// calculateDailyWage()　抽象メソッド（中身なし）
	public abstract int calculateDailyWage(int hoursWorked);

}
