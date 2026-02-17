package assignment;

/* Q5
	動物名、体長、速度の変数を持ち各変数のgetterとsetterを作成*/

public class Animal {
	private String animal;
	private String length;
	private String speed;

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getAnimal() {
		return animal;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getLength() {
		return length;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getSpeed() {
		return speed;
	}


}
