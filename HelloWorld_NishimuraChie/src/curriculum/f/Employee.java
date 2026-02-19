package curriculum.f;

public class Employee {

	String employeeId;
	String name;

	//引数ありのコンストラクタ　thisでMainで指定した情報が入るようにする
	public Employee(String employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}

	// showInfo()メソッド
	public void showInfo() {
		System.out.println("社員ID:[" + employeeId + "], 名前: [" + name + "]");
	}

}
