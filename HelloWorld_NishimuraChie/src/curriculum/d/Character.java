package curriculum.d;

public abstract class Character {
	// プレイヤーのHP, AT, SP
	protected String name;
	protected int maxHp;
	protected int hp;
	protected int at;
	protected int sp;

	// コンストラクタ用意
	public Character(String name, int maxHp, int hp, int at, int sp) {
		this.name = name;
		this.maxHp = maxHp;
		this.hp = hp;
		this.at = at;
		this.sp = sp;

	}

	// getter setterをそれぞれ用意
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAt() {
		return at;
	}

	public void setAt(int at) {
		this.at = at;
	}

	public int getSp() {
		return sp;
	}

	public void setSp(int sp) {
		this.sp = sp;
	}

	// 設定したキャラクターのステータスを表示させる
	String showStatus() {
		return "名前: " + name + System.lineSeparator() + "HP: " + hp +
				System.lineSeparator() + "AT: " + at + System.lineSeparator() + "SP: " + sp;
	}

	// 攻撃したときのhpの処理内容を決める
	public int attack(Character enemy) {

		int damage = this.at;
		int newHp = enemy.getHp() - damage;

		// hpが0以下になったときは0の表示にする
		if (newHp < 0) {
			newHp = 0;
		}
		enemy.setHp(newHp);

		return damage;
	}

	// hpが０になるまでは戦うようにする
	public boolean isDefeated() {
		return hp <= 0;
	}

}
	