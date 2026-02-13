package curriculum.b;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		// Q1 for文を使って1～10までの数字を1つずつ表示
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// Q2 for文を使って2～20までの偶数を1つずつ表示
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// Q3 for文を使って10～1までの数字を1つずつ表示
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		// Q4 for文を使って1～100までの数字を合計して表示
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		// {}の外にprintlnをもってくることで最終の値のみを出す
		System.out.println(sum);

		// Q5 for文を使って三角形を出力
		for (int i = 1; i <= 5; i++) {

			// Jで"*"の個数を出す
			for (int j = 1; j <= i; j++) { 
				
				// *を個数分並べるためにprint()にする
				System.out.print("*");
			}
			//横ならびにならないように改行をはさむ
			System.out.println();
		}

		// Q6 while文を使って1～10までの数字を1つずつ表示
		// カウンター変数を初期化
		int count = 1;

		// countが10以下の間ループ
		while (count <= 10) {
			System.out.println(count);

			// count を1ずつ増やす
			count++;
		}

		// Q7 while文を使って2～20までの偶数を1つずつ表示
		int i = 1;
		while (i <= 20) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}

		// Q8 while文を使って10～1までの数字を1つずつ表示
		i = 10;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}

		// Q9 for文を使って1～100までの数字を合計して表示
		sum = 0;
		i = 1;
		while (i <= 100) {
			sum += i;
			i++;
		}
		// {}の外にprintlnをもってくることで最終の値のみを出す
		System.out.println(sum);

		// Q10 
		// コンソールに数値を入力してもらう
		Scanner sc = new Scanner(System.in);
		

		while (true) {
			System.out.print("数字を入力してください：");
			i = sc.nextInt(); //whileの中にiを入れると毎回入力できるようになる

			if (i == 0) {
				System.out.println("終了しました");
				break;
			}
		}
		

		
		// Q11 for文で9×9を表示

		for (i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				int num = i * j;

				// 横並びにしたいときはprint()を使う
				if (i < 10) {
					System.out.print("0" + i); // 1桁には"0"をつける
				}
				System.out.print(" * ");
				if (j < 10) {
					System.out.print("0" + j); // 1桁には"0"をつける
				}
				System.out.print(" = ");
				if (num < 10) {
					System.out.print("0" + num); // 1桁には"0"をつける
				}
				//1桁以外はそのまま（これをしないと2桁が表示されなくなる）
				else {
					System.out.print(num);
				}

				if (j < 9) {
					System.out.print(" || ");
				}
			}
					System.out.println();//j==9になったら改行
		}

				
		// Q12 		
		sc.nextLine();//　Q10で残った改行を捨てる（以下のscで拾わないように）
		Random rand = new Random(); //乱数（ランダムな数）を作る

		//テレビの在庫をランダムに決める（どっちを先に聞かれても在庫が合うように）
		//プログラム開始時に1回だけランダムな数字を決定するためwhileより外に置く
		int tvStock = rand.nextInt(12);//必要なときに nextInt() で乱数をもらう
		int displayStock = 11 - tvStock; // テレビと合わせて11になるように

		while (true) {
			System.out.print("商品名を入力してください（exitで終了）：");
			String input = sc.nextLine();

			if (input.equals("exit")) {
				System.out.println("終了します");
				break;
			}

			//複数商品が入力された場合に1つずつ処理する準備
			String[] inputs = input.split("、");

			for (String product : inputs) {
				// 0～11までの乱数を発生	
				int number = rand.nextInt(12); //必要なときに nextInt() で乱数をもらう

				switch (product) { //商品名を判別
				//続けて書くことで「同じ処理」をさせる
				case "パソコン":
				case "冷蔵庫":
				case "扇風機":
				case "洗濯機":
				case "加湿器":
					System.out.println(product + "の残り台数は" + number + "台です");
					break;

				case "テレビ":
				case "ディスプレイ":
					//どちらを先に聞かれても合計11になるようにwhileより前にランダム数を確定させておく
					System.out.println(
							product + "の残り台数は"
									+ (product.equals("テレビ") ? tvStock : displayStock)
									+ "台です");

					break;

				default:
					System.out.println("『" + product + "』は指定の商品ではありません");
				}
			}
		}
		sc.close();
			}}

		


