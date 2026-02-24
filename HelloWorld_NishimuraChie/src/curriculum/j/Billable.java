package curriculum.j;

interface Billable {

	/* Mainで出力できるようにEmployeeでgetterを実装するよ、という抽象メソッドも記載する
	 * インターフェイスの場合はabstractを書かなくても自動でabstract扱いになる
	 */
	public String getId();

	public String getName();

	int costForDay(int hoursWorked);

}
