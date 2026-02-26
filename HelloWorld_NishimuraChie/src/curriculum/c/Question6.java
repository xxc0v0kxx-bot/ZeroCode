package curriculum.c;

import java.util.Random;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		// 結果の変数を用意
		int result = 0;

		System.out.println("じゃんけんゲームを始めます。");
		System.out.println("数字で グー(0), チョキ(1), パー(2) を入力してください");
		

		String winOrLose = null;
		String[] hands = { "グー", "チョキ", "パー" };
		// じゃんけん勝つまでループさせる
		while (true) {
			
			 if (!scanner.hasNextInt()) {
			        System.out.println("0～2の数字を入力してください");
			        // 文字列や少数などの入力がエラーにならないようにする
			        scanner.next();  
			        continue;
			    }
			// 数字を入力
			int userHand = scanner.nextInt();

			// ユーザーの入力が正しいかチェック
			if (userHand < 0 || userHand > 2) {
				System.out.println("入力が正しくありません。");
				continue;
			}
			// 0～2までのランダム数を出力
			int comchoice = random.nextInt(3);

			/* 勝敗の判定
			 * 0 = あいこ、1 = 負け、2 = 勝ち。計算後にマイナスにならないように +3 にしてる）
			 */
			result = (userHand - comchoice + 3) % 3;
			if (result == 2) {
				winOrLose = "あなたの勝ち！";
			} else if (result == 1) {
				winOrLose = "あなたの負け";
			} else {
				winOrLose = "あいこ";
			}
			// 結果表示
			System.out.println("あなたの手:" + hands[userHand] + ",CPUの手:" + hands[comchoice]);
			System.out.println(winOrLose);

			// 勝ったら終了
			if (result == 2) {
				break;
			}
		} // ここまでをループさせる

		scanner.close();

	}
}
