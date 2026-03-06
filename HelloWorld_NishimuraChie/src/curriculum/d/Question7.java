package curriculum.d;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {

		StringBuilder log = new StringBuilder();
			Scanner scanner = new Scanner(System.in);
			// プレイヤー名を入力
			System.out.print("プレイヤー名: ");
			String name = scanner.nextLine();

			// プレイヤーのステータスを表示
			Player player = Player.createPlayer(name);
			System.out.println(player.showStatus());
			System.out.println();
			log.append(player.showStatus()).append(System.lineSeparator());
			log.append(System.lineSeparator());

			Daemon daemon = null;
			try {
				daemon = Daemon.loadDaemon("daemon_status.txt");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			if (daemon == null) {
				System.out.println("Daemonの読み込みに失敗しました。");
				scanner.close();
				return;
			}

			System.out.println(daemon.showStatus());
			System.out.println();
			log.append(daemon.showStatus()).append(System.lineSeparator());
			log.append(System.lineSeparator());

			System.out.println("=== 戦闘開始！ ===");
			System.out.println();
			log.append("=== 戦闘開始！ ===").append(System.lineSeparator());
			log.append(System.lineSeparator());

			// 先制を決める

			Random rand = new Random();
			Character attacker;
			Character defender;

			if (player.getSp() > daemon.getSp()) {
				attacker = player;
				defender = daemon;
			} else if (player.getSp() < daemon.getSp()) {
				attacker = daemon;
				defender = player;
			} else if (rand.nextBoolean()) {
				// trueならplayer先行
				attacker = player;
				defender = daemon;
			} else {
				// falseならdaemon先行
				attacker = daemon;
				defender = player;

			}

			// どちらもHP残量がある場合は繰り返す
			while (!attacker.isDefeated() && !defender.isDefeated()) {
				String attackMsg = attacker.getName() + " の攻撃！";
				System.out.println(attackMsg);
				System.out.println();
				// logに書き出し
			    log.append(attackMsg).append(System.lineSeparator());
			    log.append(System.lineSeparator()); 
				
			    int damage = attacker.attack(defender);
			    String damagekMsg = defender.getName() + " に" + damage + "のダメージ！";
			    System.out.println(damagekMsg);
			 // logに書き出し
			    log.append(damagekMsg).append(System.lineSeparator());
				
				String attackResult = defender.getName() +
						" の残りHP: " + defender.getHp() + "/" + defender.getMaxHp();
				System.out.println(attackResult);
				System.out.println();
				// logに書き出し
				log.append(attackResult).append(System.lineSeparator());
				log.append(System.lineSeparator());
				
				// 役割交代
				Character temporary = attacker;
				attacker = defender;
				defender = temporary;
			}

			// どちらかのHPが0になったら終了
			if (player.hp <= 0 || daemon.hp <= 0) {
				System.out.println("=== 戦闘終了！ ===");
				System.out.println();
				log.append("=== 戦闘終了！ ===").append(System.lineSeparator());
				log.append(System.lineSeparator());
			}
			// HPの残量が多いほうが勝者
			if (player.hp < daemon.hp) {
				System.out.println("勝者: " + daemon.name);
				System.out.println();
				log.append("勝者: " + daemon.name).append(System.lineSeparator());
				log.append(System.lineSeparator());
			} else {
				System.out.println("勝者: " + player.name);
				System.out.println();
				log.append("勝者: " + player.name).append(System.lineSeparator());
				log.append(System.lineSeparator());
			}
			System.out.println("battle_log.txt へ書き込みしました");
			scanner.close();

		
		// logの書き出し時に例外処理が起きた場合の処理
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("battle_log.txt"))) {
		    bw.write(log.toString());
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
}
