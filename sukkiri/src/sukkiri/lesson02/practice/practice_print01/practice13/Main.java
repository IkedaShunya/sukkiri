package sukkiri.lesson02.practice.practice_print01.practice13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* int型の変数x , yにキーボードから数値15 , 33をそれぞれ代入し、変数zに合計を代入しましょう。
		ｚの値を表示しましょう。*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("xの値を入力：");
		int x = scan.nextInt();
		
		System.out.print("yの値を入力：");
		int y = scan.nextInt();
		
		int z = x + y;
		scan.close();
		
		System.out.println("ｚ= " + z);
		
		
		


	}

}
