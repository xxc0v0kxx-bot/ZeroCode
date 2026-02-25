package curriculum.k;

public class Contract extends Employee{
	public Contract(String name, int hours) {
		super(name, hours);
	}

	static final int hourlyRate = 1000;

	@Override
	// calculateSalary()で自分自身を計算する　引数なしのメソッドにする
	public int calculateSalary() {
		return (getHours() * hourlyRate);
	}
	

}
