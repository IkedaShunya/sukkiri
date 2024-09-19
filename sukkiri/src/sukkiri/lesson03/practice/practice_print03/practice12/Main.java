package sukkiri.lesson03.practice.practice_print03.practice12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// for文を使い、整数を3回入力し最小値を求めるプログラムを作りましょう。
		
		//Scannerクラスのインスタンス化
		Scanner scan = new Scanner(System.in);
		
		//for分の中で下記処理を行うと、for文を抜けたらminが使えない。
		//for文が回る度に最小値が初期化される。
		int min = Integer.MAX_VALUE;
		int result = 0;
		
		for(int i = 0; i < 3; i++ ) {
			//整数を入力し変数に格納
			System.out.print("入力：");
			result = scan.nextInt();
			
			if(min > result) {
				min = result;
			}
		}
		System.out.println(min);
		
		scan.close();

	}

}
