package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// EmployeeListの作成
		List<Employee> Employee = new ArrayList<Employee>();

		/* 各社員の追加 
		*ここではid・名前をEmployeeクラスに追加していることになるため
		*Mainクラスで出力するためにはEmployeeクラスにgetterが必要*/
		Employee.add(new FullTimeEmployee("01", "山田"));
		Employee.add(new FullTimeEmployee("02", "田中"));
		Employee.add(new FullTimeEmployee("03", "山本"));

		Employee.add(new ContractEmployee("04", "中村"));
		Employee.add(new ContractEmployee("05", "橋本"));
		Employee.add(new ContractEmployee("06", "井上"));

		for (Employee emp : Employee) {
			System.out.println("社員ID : " + emp.getId() + "　社員名 ： " + emp.getName() +
					"　給与 ： " + emp.calculateDailyWage(9) + "円");
		}

	}
}
