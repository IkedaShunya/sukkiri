package sukkiri.lesson02.practice.practice_print01.practice14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// String型の変数nameにキーボードから文字列”ミケ”を代入して、実行結果のように表示しましょう。
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("名前を入力：");
		String name = scan.nextLine();
		
		scan.close();
		System.out.printf("猫の名前は%s です。\n",name);

	}

}
