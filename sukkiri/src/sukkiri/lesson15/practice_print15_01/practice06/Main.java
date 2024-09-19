package sukkiri.lesson15.practice_print15_01.practice06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//郵便番号を表す正規表現を使って、
		//キーボード入力した文字が郵便番号を表すかどうか判定するプログラムを作りましょう。
		
		Scanner scan = new Scanner(System.in);
		System.out.print("郵便番号を入力してください：");
		
		String post = scan.nextLine();
		
		if(post.matches("[0-9]{7}")) {
			System.out.println("ありがとうございます");
		}else {
			System.out.println("もう一度入力してください");
		}
		scan.close();
	}

}
