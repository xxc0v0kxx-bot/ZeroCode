package curriculum.g;

public class Main {

	public static void main(String[] args) {

		Employee emp = new Employee(); // Employeeの箱をつくる

		emp.setEmployeeId("E002"); // empに社員の情報を入れる（値の変更）
		emp.setName("田中花子");

		// 値を取り出す
		System.out.println(
				"社員ID:" + emp.getEmployeeId() + ", 名前:" + emp.getName());

	}

}
