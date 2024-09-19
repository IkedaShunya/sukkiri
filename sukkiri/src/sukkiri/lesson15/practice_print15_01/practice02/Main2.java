package sukkiri.lesson15.practice_print15_01.practice02;

import java.util.Scanner;

public class Main2 {
	//文字列をキーボードから入力し、
	//入力された文字列の長さを表示するプログラムを書きましょう。
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(str.length());
		scan.close();
		

	}

}
