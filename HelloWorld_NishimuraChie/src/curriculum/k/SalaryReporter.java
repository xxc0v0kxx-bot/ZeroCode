package curriculum.k;

interface SalaryReporter {

	// calculateSalary()メソッドで給与計算設定させる
	public int calculateSalary();

	// Mainで名前と勤務時間を返すためにgetter用意
	public String getName();

	public int getHours();
}

/* ⑦オブジェクト指向の設計原則（SOLID）　問題文
 * 社員タイプごとに if で分岐
*if (e.getType().equals("FullTime")) {
*	System.out.println(e.getName() + " の給料は " + (e.getHours() * 1200) + " 円");
*} else if (e.getType().equals("Contract")) {
*	System.out.println(e.getName() + " の給料は " + (e.getHours() * 1000) + " 円");
}
*/
