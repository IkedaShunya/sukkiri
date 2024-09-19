package sukkiri.lesson03.practice.practice_print02.practice04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 入力
		Scanner scan = new Scanner(System.in);
		System.out.print("整数値を入力：");
		int num = scan.nextInt();



		//分岐処理
		if(num > 0) {
			//奇数、偶数の識別
			int result = num % 2;
			if(result == 0 ) {
				System.out.println("その値は偶数です");

			}else if(result == 1 ){
				System.out.println("その値は奇数です");

			}
			
		}else{
			System.out.println("正でない値が入力されました");

		}




		scan.close();



	}
}
