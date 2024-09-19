package sukkiri.lesson03.practice.practice_print03.practice10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//for文を使い、ｍ～ｎまでの整数の合計を表示するプログラムを作りましょう。
		//ｍ及びｎはキーボードから入力した値が代入されます
		
		
		//mとnの値を入力する処理
		Scanner scan = new Scanner(System.in);
		System.out.print("ｍの値を入力：");
		int m = scan.nextInt();
		System.out.print("nの値を入力：");
		int n = scan.nextInt();
		
		//結果用の変数を用意
		int result = 0;
		
		
		while(m <= n) {
			result += m; 
			m++;
		}
		System.out.println(result);
		scan.close();
		
		
	}

}
