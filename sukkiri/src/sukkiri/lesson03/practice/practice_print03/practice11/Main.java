package sukkiri.lesson03.practice.practice_print03.practice11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//for文を使い、整数を5回入力し平均を表示する
		//プログラムを作りましょう。
		Scanner scan = new Scanner(System.in);
		
		//合計用の変数を用意
		int sum = 0;
		
		
		//整数を5回入力し、合計変数のsumに+する
		for(int i =0; i < 5; i++) {
			//整数を入力
			System.out.print("入力：");
			sum += scan.nextInt();
			
		}
		
		//sumをdouble型に変更し、結果を格納
		double result = (double)sum/5;
		
		System.out.print(result);
		
		scan.close();
		
		

	}

}
