package curriculum.d;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Daemon extends Character {

	public Daemon(String name, int maxHp, int hp, int at, int sp) {
		super(name, maxHp, hp, at, sp);
	}

	/* デーモンステータスをテキストファイルから読み込む
	 * throws FileNotFoundException で、読み取れないエラーが出る可能性を伝える
	 * （処理内容はmainで定義する）
	 */
	public static Daemon loadDaemon(String filename) throws FileNotFoundException {

		File file = new File(filename);

		try (Scanner scanner = new Scanner(file)) {
			
			// ファイルを読み込んだ順にそのまま代入していく
			String name = scanner.nextLine();
			int hp = Integer.parseInt(scanner.nextLine());
			int at = Integer.parseInt(scanner.nextLine());
			int sp = Integer.parseInt(scanner.nextLine());
			int maxHp = hp;

			return new Daemon(name, maxHp, hp, at, sp);
		}
	}
}
