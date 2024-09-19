package sukkiri.lesson03.practice.addition.practice09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//for文とif文を使い、ｎ回整数を読み込みし、整数を加算してください。
		//合計値が1000を超えない範囲で加算し、
		//超えた時点でｎ回読み込みが完了していなくても入力処理を終了して合計値を表示してください。
		
		Scanner scan = new Scanner(System.in);
		System.out.print("何回入力？：");
		int num = scan.nextInt();
		
		int sum = 0;
		int input =0;
		for(int i =0; i < num ;i++) {
			System.out.print("整数値：");
			input = scan.nextInt();
			if(sum+input > 1000) {
				System.out.println("合計が1000超えました");
				System.out.println("最後の数値は無視します。");
				
				break;
				
			}else {
				sum +=input;
			}
			
			
			
		}
		System.out.println("合計：" +sum);
		scan.close();


	}

}
