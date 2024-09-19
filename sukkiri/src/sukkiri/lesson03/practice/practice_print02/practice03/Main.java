package sukkiri.lesson03.practice.practice_print02.practice03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//キーボード入力した整数を変数に格納
		Scanner scan = new Scanner(System.in);
		
		System.out.print("整数値を入力：");
		int a = scan.nextInt();
		System.out.print("整数値を入力：");
		int b = scan.nextInt();
		
		if(a == b) {
			System.out.print("aとbの値は等しいです。");
			
		}else if(a != b) {
			System.out.print("aとbの値は等しくないです。");
		}
		scan.close();
		
	}

}
