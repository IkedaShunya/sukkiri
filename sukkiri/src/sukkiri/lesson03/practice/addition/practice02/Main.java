package sukkiri.lesson03.practice.addition.practice02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// While文を使い０を入力するまで、延々とキーボードから入力される正の整数値を加算していく  
		//プログラムを作成しましょう。
		//負の整数値が入力された場合は加算しない。（無限ループ、break文、continue文、if文）

		Scanner scan = new Scanner(System.in);
		int num = 0;
		int sum = 0;

		while(true) {
			System.out.print("入力：");
			num = scan.nextInt();
			if(num > 0) {
				sum += num;
			}else if(num < 0) {

			}else {
				break;
			}

		}

		System.out.println("合計は" + sum +"です。");
		scan.close();


	}

}
