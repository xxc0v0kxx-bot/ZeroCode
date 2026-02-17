package curriculum.b;

public class Question5 {

	// Q1 引数、戻り値なしで"Hello, World!"を表示
	private static void test1() { //修飾子 戻り値なし メソッド名(引数なし)
		/* メソッド内で実行する処理 */
		System.out.println("Hello, World!");
	}

	//Q2 引数の2倍の値を表示
	public static int test2(int x) { //修飾子 戻り値int型 メソッド名(引数1つ指定)
		/* メソッド内で実行する処理 */
		int a = x * 2;
		return a; //戻り値の設定

	}

	// Q3　引数：整数 (int num)　	戻り値：true（偶数なら）、false（奇数なら）


	public static boolean isEven(int a) {
		if (a % 2 == 0) {
			System.out.println(a + "は偶数です。");
			return true;

		}
		else {
			System.out.println(a + "は奇数です。");
			return false;
		}
		
	}

	

	public static void main(String[] args) {

		// Q1 "Hello, World!"呼び出し	
		test1();

		// Q2 呼び出し				
		System.out.println("10を2倍すると" + test2(10) + "です");

		// Q3 偶数か奇数か判断して呼び出し
		int num1 = 7;
		int num2 = 10;

		isEven(num1);
		isEven(num2);

	}

}
