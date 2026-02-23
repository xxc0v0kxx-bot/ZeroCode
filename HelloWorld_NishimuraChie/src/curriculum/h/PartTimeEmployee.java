package curriculum.h;

public class PartTimeEmployee extends Employee {

	private static final int HOURLY_RATE = 1000;

	PartTimeEmployee(String id, String name) {
		super(id, name);
	}

	// @OverrideでcalculateDailyWage()メソッドの中身を設定
	@Override
	public int calculateDailyWage(int hoursWorked) {
		return HOURLY_RATE * hoursWorked;

	}

}
