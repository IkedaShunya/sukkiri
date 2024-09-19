package sukkiri.lesson03.practice.practice_print02.practice02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//キーボードの入力
		Scanner scan = new Scanner(System.in);
		
		System.out.print("整数値を入力：");
		
		int num = scan.nextInt();
		
		if(num > 5) {
			System.out.println("5より大きい値です。");
			
		}else if (num <= 5) {
			System.out.println("5以下の値です");
		}
		scan.close();
	}

}
