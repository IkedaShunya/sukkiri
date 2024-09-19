package sukkiri.lesson03.practice.practice_print03.practice14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// キーボードから直角三角形の段数を入力し、
		//for文の二重ループを使って、左下側が直角の
		//直角三角形を表示するプログラムを作成しましょう。
		
		//システム入力
		Scanner scan = new Scanner(System.in);		
		System.out.print("入力：");	
		
		//入力した値+1(２週目のループの時j<iでiの初期値が0のため
		//1回目のループが0(i) < 0(j)でfalseになってしまう)
		int angle = scan.nextInt()+1;
		
		for(int i=1; i<angle; i++) {
			for(int j=0; j <i; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		
		}
		scan.close();

	}

}
