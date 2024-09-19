package sukkiri.lesson03.practice.practice_print03.practice04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// for文を使い、1～nまでの整数のうち偶数のみ加算し、
		//結果を表示するプログラムを作りましょう。
		//ｎの値はキーボードから入力した値が代入されます。
		
		
		//キーボードから数値の入力
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ｎの値を入力：");
		int n = scan.nextInt();
		
		
		//加算する用の変数を用意
		int result = 0;
		
		//入力された数値までのまでの整数のうち偶数のみ加算
		for(int i=1; i<=n; i++) {
			if(i%2 == 0) {
				result += i; 
			}
			
		}
		System.out.println(result);
		scan.close();


	}

}
