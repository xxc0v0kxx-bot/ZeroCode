package curriculum.d;

import java.util.Random;
import java.util.Scanner;

public class Player extends Character {
	static Random rand = new Random();
	// HPをランダム値で設定し、定数にする
	public static final int MAX_HP = rand.nextInt(41) + 60; // 60～100の範囲

	public Player(String name, int maxHp, int hp, int at, int sp) {
		super(name, maxHp, hp, at, sp);
	}

	static Scanner scanner = new Scanner(System.in);

	public static Player createPlayer(String name) {
		Random rand = new Random();
		int hp = MAX_HP;
		int at = rand.nextInt(10) + 10; // 10～19の範囲
		int sp = rand.nextInt(10) + 5; // 5～14の範囲
		return new Player(name, MAX_HP, hp, at, sp);
	}
}
