package sukkiri.lesson03.practice.practice_print02.practice07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 入力
		Scanner scan = new Scanner(System.in);
		System.out.print("受験者番号を入力(受験者番号は、1000～1500)：");
		int a = scan.nextInt();
		
		//分岐処理
		if(a == 1105 || a ==1200 || a ==1311) {
			System.out.println( a +"番は合格です。");
		}else {
			System.out.println(a +"番は不合格です。");
		}
		
		scan.close();
		}
}
