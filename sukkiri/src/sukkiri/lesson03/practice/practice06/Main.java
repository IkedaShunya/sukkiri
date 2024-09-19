package sukkiri.lesson03.practice.practice06;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("【数あてゲーム】");
		
		//乱数値を発生させて変数ansに格納
		Random random = new Random();
		//ここで作ったほうがメモリてきにもありがたい。（forで繰り返すより）
		Scanner scan = new Scanner(System.in);
		
		
		int ans = random.nextInt(10);
		System.out.println(ans);

		//当たるまで（最大５回まで）入力繰り返す
		for(int i = 0; i < 5; i++) {
			System.out.println("0～9の数字を入力してください");

			//数字の入力
			//Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();		
			
			//乱数値と入力値を比較、正解の場合はfor文を８うｙ、抜け出す
			if(num == ans) {
				System.out.println("アタリ！");
				break;
			}else {
				System.out.println("違います");
			}
			
		}
		System.out.println("ゲームを終了します");
		scan.close();



	}

}
