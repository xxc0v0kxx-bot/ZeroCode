package curriculum.h;

class FullTimeEmployee extends Employee {

	// 時給は変わらないのでfinalで設定する
	private static final int HOURLY_RATE = 1200;

	// 
	FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	// @OverrideでcalculateDailyWage()メソッドの中身を設定
	@Override
	public int calculateDailyWage(int hoursWorked) {

		// 8時間まではそのまま計算
		if (hoursWorked <= 8) {
			return HOURLY_RATE * hoursWorked;
		} else {
			return (int) (
			// 8時間超過分は25％上乗せさせる
			HOURLY_RATE * 8 + (hoursWorked - 8) * HOURLY_RATE * 1.25);
		}

	}
}
