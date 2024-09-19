package sukkiri.lesson03.practice.practice_print03.practice13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// While文を使い、０を入力するまで、
		//延々とキーボードから入力される整数値を加算していく
		//プログラムを作成しましょう（無限ループ、break文）
		
		//Scannerクラスのインスタンス化
		Scanner scan = new Scanner(System.in);
		
		//numに１以外の変数を代入
		boolean truth = true;
		//入力値用・合計用の変数を宣言
		int num =0;
		int sum =0;
		
		
		//0がでるまで無限ループ
		while (truth) {
			System.out.print("入力：");
			num = scan.nextInt();
			//0以外はsumにプラス0でた場合抜け出す
			if(num !=0) {
				sum += num;

				
			}else {
				break;
			}
					
		}
		System.out.println("合計値"+sum);
		scan.close();


	}

}
