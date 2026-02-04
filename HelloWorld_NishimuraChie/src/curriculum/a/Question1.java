package curriculum.a;

public class Question1 {

	private static final String String = null;

	public static void main(String[] args) {
		
		// Q1各型の変数を宣言し、初期値を設定
		
			// 変数byteNumの初期値を設定
			byte byteNum;
			
			// 変数shortNumの初期値を設定
			short shortNum;
			
			// 変数intNumの初期値を設定
			int intNum;
			
			// 変数longNumの初期値を設定
			long longNum;
			
			// 変数floatNumの初期値を設定
			float floatNum;
			
			// 変数doubleNumの初期値を設定
			double doubleNum;
			
			// 変数letterの初期値を設定
			char letter;
			
			// 変数lettersの初期値を設定
			String letters;
			
			// 変数isBooleanの初期値を設定
			boolean isBoolean;
		
		//Q2 1で宣言した各型の変数に指定された値を代入
			
			// 変数byteNumに10を代入
			byteNum = 10;
			
			// 変数shortNumに100を代入
			shortNum = 100;
			
			// 変数intNumに1000を代入
			intNum = 1000;
			
			// 変数longNumに10000を代入
			longNum = 10000;
			
			// 変数floatNumに9.5fを代入
			floatNum = 9.5f;
			
			// 変数doubleNumに10.5を代入
			doubleNum = 10.5;
			
			// 変数letterに"a"を代入
			letter = 'a';
			
			// 変数lettersに"ハロー"を代入
			letters = "ハロー";
			
			// 変数isBooleanにtrueを代入
			isBoolean = true;
			
		//Q3 値を代入した変数を用いて出力
			
			// 11110を出力
			System.out.println(byteNum + shortNum + intNum + longNum);
			
			// 20を出力（小数点以下を削除）
			double d = floatNum + doubleNum;
			System.out.println(d);
			
			// a ハロー trueを出力
			System.out.println(letter + letters + isBoolean);
			
			// 数字を全て足し11130を出力
			double integer  =byteNum + shortNum + intNum + longNum;
			System.out.println(integer + d);
			
			// 小数点以外の数字を全てかけて出力
			System.out.println(byteNum * shortNum * intNum * longNum);
			
			// 10.5割る100をして出力
			System.out.println(doubleNum / shortNum);
			
			// 10引く100をして出力
			System.out.println(byteNum - shortNum);
			
			
		//Q4 
			// nameというString型の変数を宣言し"山田太郎"という値を代入
			String name = "山田太郎";
			
			// こんにちは、山田太郎さん！ と表示
			System.out.println("こんにちは、" + name + "さん！");
			
		
		//Q5 
			// ageというint型の変数を宣言し25を代入
			int age = 25;
			
			// 年齢: 25歳 と表示
			System.out.println("年齢：" + age + "歳");			
			
			
		//Q6 
			// num1というint型の変数を宣言し、10 を代入
			int num1 =10;
			
			// num2というint型の変数を宣言し、5 を代入
			int num2 = 5;
			
			// num1とnum2を足して結果をsumという変数に代入し、コンソールへ表示
			int sum = num1 + num2;
			System.out.println(sum);
			
			
		//Q7
			// scoreというint型の変数を宣言し、80を代入
			int score = 80;
			
			// scoreに20を加えて更新
			int newScore = (score + 20);
			
			// 最終スコア:100 をコンソール出力
			System.out.println("最終スコア:"  + newScore);
			
			
		//Q8 
			// priceというdouble型の変数を宣言し、99.99 を代入
			double price = 99.99;
			
			// priceをint型に変換
			int newPrice = (int)price;
			
			// 整数価格: 99 とコンソールに表示
			System.out.println("整数価格:"  + newPrice);
			
			
		//Q9
			// String 型の変数numStrに "123"を代入
			String numStr = "123";
			
			// numStrをint型に変換
			int newNum = Integer.parseInt(numStr);
			
			// 変換後の値: の後ろにnumStr+10した結果を表示
			System.out.println("変換後の値" + (newNum + 10));
			
						
		//Q10
			// int型の変数numに50を代入
			int num = 50;
			// numをString型に変換し、"得点: 50点"の形で表示
			String str = String.valueOf(num);
			System.out.println("得点：" + str + "点");
			
			
		// Q11
			// int型の変数aに10を代入
			int a = 10;
			
			// int型の変数aに10を代入
			int b = 20;
			
			// aがbより小さいかどうかをboolean変数resulに代入
			boolean result = a<b;
			
			// resultの値を表示
			System.out.println(result);
					
			
		// Q12 条件演算子（三項演算子）を使用
			// int型の変数xに15を代入
			int x = 15;
			
			// xが10以上なら "OK"、そうじゃなければ "NG" を表示
			boolean y = x > 10;
			String s = String.valueOf(y ? "OK" : "NG");
			System.out.println(s);
			
			
		// Q13
			// "私はJavaが好きです。Javaは楽しい！"の"Java"を""Python"に置き換える
			String lang = "私はJavaが好きです。Javaは楽しい！";
			String Lang2 = lang.replace( "Java","Pyson");
			
			// 置き換えて表示
			System.out.println(Lang2);
			
			
			

	}}		
						
		




