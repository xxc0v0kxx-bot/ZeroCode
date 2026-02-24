package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// EmployeeListの作成
		List<Employee> employee = new ArrayList<Employee>();

		/* 各社員の追加 
		*ここではid・名前をEmployeeクラスに追加していることになるため
		*Mainクラスで出力するためにはEmployeeクラスにgetterが必要*/
		employee.add(new FullTimeEmployee("01", "山田"));
		employee.add(new FullTimeEmployee("02", "田中"));
		employee.add(new FullTimeEmployee("03", "山本"));

		employee.add(new ContractEmployee("04", "中村"));
		employee.add(new ContractEmployee("05", "橋本"));
		employee.add(new ContractEmployee("06", "井上"));

		for (Employee emp :employee) {
			System.out.println("社員ID : " + emp.getId() + "　社員名 ： " + emp.getName() +
					"　給与 ： " + emp.calculateDailyWage(9) + "円");
		}

	}
}
