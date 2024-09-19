package sukkiri.lesson03.practice.practice_print03.practice05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// for文を使い、ｍ～ｎまでの整数の合計を表示する
		//プログラムを作りましょう。
		//ｍ及びｎはキーボードから入力した値が代入されます。
		
		
		//mとnの入力
		Scanner scan = new Scanner(System.in);
		System.out.print("ｍの値を入力：");
		int m = scan.nextInt();
		System.out.print("nの値を入力：");
		int n = scan.nextInt();
		
		//計算結果用の変数の宣言
		int result = 0;
		
		//m～ｎの足し算
		for(int i = m ; i <= n; i++) {
			result += i;
		}
		
		System.out.println(result);
		
		scan.close();


	}

}
