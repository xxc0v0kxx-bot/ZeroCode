package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// EmployeeListの作成
		List<Billable> billable = new ArrayList<Billable>();

		/* 各社員の追加 
		*ここではid・名前をBillableに追加していることになるため
		*Mainクラスで出力するためにはBillableにgetterが必要*/
		billable.add(new FullTimeEmployee("01", "山田"));
		billable.add(new FullTimeEmployee("02", "田中"));
		billable.add(new FullTimeEmployee("03", "山本"));

		billable.add(new ContractEmployee("04", "中村"));
		billable.add(new ContractEmployee("05", "橋本"));
		billable.add(new ContractEmployee("06", "井上"));

		for (Billable b : billable) {
			System.out.println("社員ID : " + b.getId() + "　社員名 ： " + b.getName() +
					"　給与 ： " + b.costForDay(9) + "円");
		}

	}

}
