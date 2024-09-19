package sukkiri.lesson15.practice_print15_01.practice01;

import java.util.Scanner;

public class Main {
	/*String型変数strAとstrBに、それぞれにキーボードから文字列を入力させ、
	 * strAとstrBの内容が等しいかどうかを調べ、
	 * 「等しい」または「等しくない」を表示するプログラムを書きましょう。
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//キーボードから文字列を入力を指示
		System.out.print("strA: ");
		String strA =scan.nextLine();
		System.out.print("strB: ");
		String strB =scan.nextLine();
		
		if(strA.equals(strB)) {
			System.out.println("strAとstrBは等しいです");
		}else {
			System.out.println("strAとstrBは等しくないです");
		}
		scan.close();
		
	}

}
