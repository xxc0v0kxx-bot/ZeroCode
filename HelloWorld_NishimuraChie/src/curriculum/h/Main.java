package curriculum.h;

public class Main {

	public static void main(String[] args) {

		FullTimeEmployee full = new FullTimeEmployee(null, null);
		PartTimeEmployee part = new PartTimeEmployee(null, null);

		System.out.println(
				"正社員の給与:" + full.calculateDailyWage(9) + "円");
		System.out.println(
				"パート社員の給与:" + part.calculateDailyWage(9) + "円");

	}

}
