package assignment2;

import assignment.Animal;// 別パッケージAnimalから呼ぶためにインポート
import assignment.Greeting;// 別パッケージGreetingから呼ぶためにインポート

public class Main {

	public static void main(String[] args) {

	// Q4 別パッケージGreetingから「こんにちは！」を呼び出し
		Greeting helper = new Greeting();
		helper.sayHello();

	// Q5 変数の中身を設定し、出力の処理を行う		
		Animal a = new Animal(); // Animalの箱をつくる

		a.setAnimal("ライオン"); // aに動物の値を入れる
		a.setLength("2.1m");
		a.setSpeed("80km/h");

		System.out.println("動物名：" + a.getAnimal()); // 値を取り出す
		System.out.println("体長：" + a.getLength());
		System.out.println("速度：" + a.getSpeed());

	}

}
