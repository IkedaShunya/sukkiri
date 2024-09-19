package sukkiri.lesson15.practice_print15_01.practice02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//文字列をキーボードから入力し、
		//入力された文字列の長さを表示するプログラムを書きましょう。

		Scanner scan = new Scanner(System.in);

		//キーボードから文字列を入力を指示
		System.out.print("strA: ");
		String strA =scan.nextLine();
		
		int strLength = strA.length();
		
		System.out.println("strAの文字の長さは" + strLength + "です");
		
		scan.close();

	}

}
