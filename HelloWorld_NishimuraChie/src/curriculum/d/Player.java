package curriculum.d;

import java.util.Random;


public class Player extends Character {
	static Random rand = new Random();

	public Player(String name, int maxHp, int hp, int at, int sp) {
		super(name, maxHp, hp, at, sp);
	}

	public static Player createPlayer(String name) {
		/* HPをランダム値で設定し、定数にする
		*（プレイヤーを作るたびにランダム値を設定する）
		*/
		final int maxHp = rand.nextInt(41) + 60; // 60～100の範囲
		int hp = maxHp;
		int at = rand.nextInt(10) + 10; // 10～19の範囲
		int sp = rand.nextInt(10) + 5; // 5～14の範囲
		return new Player(name, maxHp, hp, at, sp);
	}
}
