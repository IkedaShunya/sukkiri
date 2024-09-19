package sukkiri.lesson15.practice_print15_01.practice01;

import java.util.Scanner;

public class Main2 {
	/*String型変数strAとstrBに、それぞれにキーボードから文字列を入力させ、
	 * strAとstrBの内容が等しいかどうかを調べ、
	 * 「等しい」または「等しくない」を表示するプログラムを書きましょう。
	 */
		public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.print("strA:");
		String strA = scan.nextLine();
		System.out.print("strB:");
		String strB = scan.nextLine();
		scan.close();
		System.out.println(strA.equals(strB));

	}

}
