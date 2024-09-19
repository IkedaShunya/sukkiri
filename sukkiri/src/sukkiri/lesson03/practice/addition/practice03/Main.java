package sukkiri.lesson03.practice.addition.practice03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// キーボードから直角三角形の段数を入力し、
		//for文の二重ループを使って、左下側が直角の直角三角形を表示するプログラムを作成しましょう。
		//実行結果例  5段の場合
		//入力：5

//		*
//		**
//		***
//		****
//		*****
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("入力：");
		
		
		int num = scan.nextInt();
		System.out.println();
		for(int i = 1; i < num+1; i++) {
			for(int j =0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		scan.close();
		


	}

}
