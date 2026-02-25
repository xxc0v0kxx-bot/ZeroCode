package curriculum.k;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// EmployeeListの作成
		List<Employee> e = new ArrayList<Employee>();

		/* 各社員の追加 
		* ここではid・名前をSalaryCalculatorに追加していることになるため
		* Mainクラスで出力するためにはSalaryCalculatorにgetterが必要 */
		e.add(new FullTime("山田", 9));
		e.add(new FullTime("田中", 8));
		e.add(new FullTime("山本", 7));

		e.add(new Contract("中村", 9));
		e.add(new Contract("橋本", 8));
		e.add(new Contract("井上", 7));

		for (Employee emp : e) {
			System.out.println("社員名 ： " + emp.getName() +
					"  給与 ： " + emp.calculateSalary() + "円");
		}

	}

}
