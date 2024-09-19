package sukkiri.lesson03.practice.addition.practice06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		//  do-while文を使い、「ｙ/n」が入力されるまで再入力を求めるプログラムを作成しましょう。
//		実行結果例 
//		入力してください（y/n）:o（表示：入力）
//		入力してください（y/n）:u（表示：入力）
//		入力してください（y/n）:y（表示：入力）
//		プログラムを終了します。（表示）
		Scanner scan = new Scanner(System.in);
		
		String s = null;
		
		do {
			System.out.print("入力してください（y/n）:");
			s = scan.nextLine();
			
			
		}while(!(s.equals("n" ) ||s.equals("y" ) ));
		
		scan.close();
	}
	
}
