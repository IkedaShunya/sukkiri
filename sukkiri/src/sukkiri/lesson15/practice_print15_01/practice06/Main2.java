package sukkiri.lesson15.practice_print15_01.practice06;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		//郵便番号を表す正規表現を使って、
		//キーボード入力した文字が郵便番号を表すかどうか
		//判定するプログラムを作りましょう。
		
		Scanner scan = new Scanner(System.in);
		System.out.println("郵便番号を入力してください");
		String input = scan.nextLine();
		
		if(input.matches("[0-9]{3}-[0-9]{4}")) {
			System.out.println("郵便番号です");
		}else {
			System.out.println("郵便番号ではありません");
		}
		
		
		
		scan.close();

	}

}
