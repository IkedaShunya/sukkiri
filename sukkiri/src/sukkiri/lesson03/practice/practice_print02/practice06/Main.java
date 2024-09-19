package sukkiri.lesson03.practice.practice_print02.practice06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 入力
		Scanner scan = new Scanner(System.in);
		System.out.print("整数値を入力：");
		int a = scan.nextInt();
		
		if(a == 0) {
			System.out.println("その値は0です。");
		}else {
			System.out.println("その値は０ではありません");
		}
		scan.close();
		
	}

}
