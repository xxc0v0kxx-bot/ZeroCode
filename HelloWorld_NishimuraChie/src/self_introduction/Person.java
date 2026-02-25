package self_introduction;

public class Person {

	// 問題1：インスタンスフィールドを定義
	
	public String name;
	public int age;
	public double height;
	
	// 問題4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセット
	public double weight;
	
	// static(みんなで共有）で数を数える
	public static int count;

	/* 問題2：コンストラクタを定義,
	*  問題3：コンストラクタの中で各インスタンスフィールドに値をセット
	*/
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		
		// 問題4 コンストラクタの中でweight値をセット
		this.weight = weight;
		
		// Personの数を数える（生まれた瞬間に+1）
		Person.count++;
	}

	// 問題6：インスタンスメソッド「bmi」を定義
	public double bmi() {
	// 問題7：bmiメソッドでインスタンスのBMIを返す
		return weight / (height * height);
	}

	// 問題8：インスタンスメソッド「print」を定義
	// 問題9：printメソッドの中でthisを用いて出力 (Mainのstatic内ではthisを使えない）
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		
		// String.format("%.2f",○)で小数点２桁以下を切り捨て（数字が少数点以下の桁数）
		System.out.println("BMIは" + String.format("%.2f", this.bmi()) + "です");
		
		// 問題10：人数の合計を「合計○人です」と出力
		System.out.println("合計" + Person.count + "人です");
	}

}
