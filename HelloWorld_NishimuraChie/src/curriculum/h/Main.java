package curriculum.h;

public class Main {

	public static void main(String[] args) {

		// 各クラスをもとにインスタンス（実装）を作成する
		FullTimeEmployee full = new FullTimeEmployee("E001", "佐藤太郎");
		PartTimeEmployee part = new PartTimeEmployee("E002", "田中花子");

		// 社員・パートの給料を出力する
		System.out.println(
				"正社員の給与:" + full.calculateDailyWage(9) + "円");
		System.out.println(
				"パート社員の給与:" + part.calculateDailyWage(9) + "円");

	}

}
