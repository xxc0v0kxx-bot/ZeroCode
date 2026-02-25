package curriculum.k;

public class FullTime extends Employee {
	
	public FullTime(String name, int hours) {
		super(name, hours);
	}

	static final int hourlyRate = 1200;

	// calculateSalary()で自分自身を計算する　引数なしのメソッドにする
	@Override
	public int calculateSalary() {
		return (getHours() * hourlyRate);
	}

}
