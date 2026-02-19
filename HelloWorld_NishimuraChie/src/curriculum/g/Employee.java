package curriculum.g;

public class Employee {

	private String employeeId;
	private String name;

	// 引数なしのコンストラクタを作る
	public Employee() {
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

}
