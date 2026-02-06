package curriculum.b;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		// Q1
			// int型の変数scoreに75を代入
			int score = 75;
		
			// scoreが60以上なら"合格です！"と表示
			if(score >= 60){
			System.out.println("合格です！");
			}
		
			
		// Q2
			// int型の変数ageに25を代入
			int age = 25;
			
			// ageが20以上30以下なら"適正年齢です"と表示
			if(age >= 20 && age <= 30){
				System.out.println("適正年齢です");
				}
			
			// それ以外の場合は"対象外です"と表示
			else{System.out.println("対象外です");
			}
		
		
		// Q3
			// int型の変数ageに18を代入
			int age2 = 18;
		
			// ageが20以上なら"成人です"と表示
			if(age2 >= 20) {
				System.out.println("成人です");
				}
			
			// ageが13以上19以下なら"ティーンエイジャーです"と表示
			else if(age2 >= 13 && age2 <= 19){
				System.out.println("ティーンエイジャーです");
				}
			
			// ageが12以下なら"子供です"と表示
			else if(age2 <= 12){
				System.out.println("子供です");
				}
		 
			
		// Q4
			// int型の変数x, y, zに30, 15, 50を代入
			int x = 30;
			int y = 15;
			int z = 50;
			
			// 一番大きい数値を判定して表示
			int max = 0 ;
			if (x >= y && x >= z) {
				max = x;
				}
			else if(y >= x && y >= z){
				max = y;
				}
			else if(z >= x && z >= y){
				max = z;
				}
				System.out.println(max);
		
	
		// Q5
			// int型の変数nuｍにコンソール入力でいずれかの値を代入
			
			Scanner sc = new Scanner(System.in);
			System.out.print("数字を入力してください：");
			int num = sc.nextInt();
			
			// numの値が0より大きければ"正の数です"と表示
			if (num > 0){
				System.out.println("正の数です");
				}
			
			// numの値が0と同じであれば"0です"と表示
			else if(num == 0) {
				System.out.println("0です");
				}
			
			// numの値が0より小さければ"負の数です"と表示
			else{
				System.out.println("負の数です");
				}
			
			
		// Q6
			// int型のvalueを用意、いずれかの値をコンソール入力で代入
			System.out.print("数字を入力してください：");
				int value = sc.nextInt();
			
			// valueが偶数なら"偶数です"、
			if (value % 2 == 0) {
				System.out.println("偶数です");
				}
			
			// 奇数なら"奇数です"と表示
			else{
				System.out.println("奇数です");
				}
			
			
		// Q7
			// int型のscoreにいずれかのコンソール入力で数値を代入
			System.out.print("数字を入力してください：");
			score = sc.nextInt();
						
			// 90以上なら"優"
			if(score >= 90) {
				System.out.println("優");
				}
			
			// 70以上なら"良
			else if(score >= 70 && score < 90) {
				System.out.println("良");
				}
			
			// 50以上なら"可"
			else if(score >= 50 && score < 70){
				System.out.println("可");
				}
			
			// 50未満なら"不可"
			else  {
				System.out.println("不可");
				}
			
			
		// Q8 
			/* コンソール入力がnullまたは空文字（""）のときに
			「入力が無効です」と表示 */
			
			// コンソール入力を設定
			System.out.print("文字を入力してください：");
			sc.nextLine();
		    String word = sc.nextLine();
			
			// nullまたは空文字（""）のときに「入力が無効です」と表示
			if (word == null || word.replace("　", "").trim().isEmpty()) {
			    System.out.println("入力が無効です");
				}
			
			
			// Q9 int型のdayにコンソール入力で1～7のいずれかの数値を代入
			System.out.print("1～7の数字を入力してください：");
			int day = sc.nextInt();
			
			switch (day) {
				case 1:
					System.out.println("月曜日");
					break;
				case 2:
					System.out.println("火曜日");
					break;
				case 3:
					System.out.println("水曜日");
					break;
				case 4:
					System.out.println("木曜日");
					break;
				case 5:
					System.out.println("金曜日");
					break;
				case 6:
					System.out.println("土曜日");
					break;
				case 7:
					System.out.println("日曜日");
					break;
				default:
				System.out.println("無効な入力です");
				}
			
			
			// Q10
			System.out.print("1～12の数字を入力してください：");
			int month = sc.nextInt();
			switch (month) {
				case 1:case 2: case 12:
					System.out.println("冬");
					break;
				case 3:case 4:case 5:
					System.out.println("春");
					break;
				case 6: case 7: case 8:
					System.out.println("夏");
					break;
				case 9: case 10: case 11:
					System.out.println("秋");
					break;
				default:
				System.out.println("無効な月です");
				}
			sc.close();
	}}
			
			
			
	

	

