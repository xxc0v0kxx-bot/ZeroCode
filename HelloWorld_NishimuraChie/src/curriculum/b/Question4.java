package curriculum.b;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		// Q1 int型の配列を作成し、1,2,3,4,5を格納する
		int[] result = new int[5];
		result[0] = 1;
		result[1] = 2;
		result[2] = 3;
		result[3] = 4;
		result[4] = 5;

		// 配列の全要素を順番に表示する
		for (int i = 0; i < 5; i++) {
			System.out.println(result[i]);
		}

		// Q2 int型の配列 {10, 20, 30, 40, 50}を用意する
		int[] num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		// 逆の順番で表示する
		for (int a = 4; a >= 0; a--) {
			System.out.println(num[a]);
		}
		

		// Q3 int型の配列{3,5,7,9,11}を用意し、合計値を出力する
		
		// int型の配列{3,5,7,9,11}を用意する
		int[] odd = { 3, 5, 7, 9, 11 };

		// 配列の全要素の合計値を計算する
		int sum = 0;
		for (int b = 0; b < odd.length; b++) {
			sum += odd[b];
		}
		
		// {}の外にprintlnをもってくることで最終の値のみを出す
		System.out.println(sum);

		
		// Q4 int型の配列{12,7,9,21,5,18}を用意し、最大値・最小値を出力する
		
		// int型の配列{12,7,9,21,5,18}を用意する
		int[] num2 = { 12, 7, 9, 21, 5, 18 };
		
		// int型で表現できる最小（0より小さい）の値にする
		int max = Integer.MIN_VALUE; 
		
		// int型で表現できる最大の値にする
		int lowest = Integer.MAX_VALUE;

		// 最大値を出す
		for (int v : num2) {
			if (v > max) {
				max = v;
			}
		}
		// 最小値を出す
		for (int n : num2) {
			if (n < lowest) {
				lowest = n;
			}
		}
		System.out.println(max);
		System.out.println(lowest);

		
		// Q5 int型の配列{1,2,3,4,5}を用意し、全要素を2倍にする
		int[] num3 = { 1, 2, 3, 4, 5 };

		// 配列の全要素を2倍にして出力する
		for (int t = 0; t < num3.length; t++) {
			System.out.println(num3[t] * 2);
		}

		
		/* Q6 int型の配列{4,7,10,15,20}を用意し、
		 *		コンソール入力の値が含まれるかどうか表示する*/
		Scanner sc = new Scanner(System.in);
		int[] num4 = { 4, 7, 10, 15, 20 };

		// コンソールで数字を入力する
		System.out.println("数字を入力してください");
		int input = sc.nextInt();

		// 入力された数字が配列内にあるか無いかを確認する
		for (int i = 0; i < num4.length;) {

			if (num4[i] == input) {
				System.out.println("結果：（"+input + "は配列に含まれています)");
				break;
			} else {
				System.out.println("結果：（"+input + "は配列に含まれていません)");
				break;
			}
		}
		
		
		// Q7 2次元配列{{1, 2}, {3, 4}, {5, 6}};を用意する
		int[][] array = {
				{ 1, 2 },
				{ 3, 4 },
				{ 5, 6 }
		};
		for (int i = 0; i < array.length; i++) { // 行をループ
			for (int j = 0; j < array[i].length; j++) { // 列をループ
				System.out.print(array[i][j] + " "); // 配列のすべての要素を表示する
			}
			System.out.println(); // 改行
		}

		
		/* Q8 2次元配列 int[][] array = {{10, 20, 30}, 
		 *		{40, 50, 60}, {70, 80, 90}}; を用意する*/
		int[][] array2 = {
				{ 10, 20, 30 },
				{ 40, 50, 60 },
				{ 70, 80, 90 }
		};
		int sum2 = 0;
		for (int i = 0; i < array2.length; i++) { // 行をループ
			for (int j = 0; j < array2[i].length; j++) { // 列をループ
				sum2 += array2[i][j]; //配列の全ての要素を合計する
			}
		}
		// {}の外にprintlnをもってくることで最終の値のみを出す
		System.out.println(sum2);

		
		/* Q9 2次元配列 int[][] array = {{12, 15, 8},
		 *  {6, 19, 25}, {30, 2, 10}}; を用意する: */
		int[][] array3 = {
				{ 12, 15, 8 },
				{ 6, 19, 25 },
				{ 30, 2, 10 }
		};
		
		// int型で表現できる最小（0より小さい）の値にする
		int max2 = Integer.MIN_VALUE; 
		// int型で表現できる最大の値にする
		int lowest2 = Integer.MAX_VALUE; 

		// 最大値を出す
		for (int i = 0; i < array3.length; i++) { // 行をループ
			for (int j = 0; j < array3[i].length; j++) { // 列をループ
				// 最大値を出す
				if (array3[i][j] > max2) {
					max2 = array3[i][j]; // 全ての値を確認する
				}
				// 最小値を出す
				if (array3[i][j] < lowest2) {
					lowest2 = array3[i][j]; // 全ての値を確認する
				}
			}
		}
		System.out.println(max2);
		System.out.println(lowest2);

		
		/* Q10 3次元配列 int[][][] array = {{{1, 2},
		 * 		{3, 4}}, {{5, 6}, {7, 8}}}; を用意し
		 *		 配列内のすべての要素を 表示する */

		int[][][] array4 = {
				{ { 1, 2 },
						{ 3, 4 }
				},
				{ { 5, 6 },
						{ 7, 8 } }
		};
		for (int i = 0; i < array4.length; i++) { // １次元目のループ
			for (int j = 0; j < array4[i].length; j++) { // ２次元目のループ
				for (int k = 0; k < array4[i][j].length; k++) { // ３次元目のループ
					System.out.print(array4[i][j][k] + " "); // 全ての値を出力する
				}
				System.out.println(); // 改行
			}
		}

		sc.close();

	}

}
