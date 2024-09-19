package sukkiri.lesson03.practice.practice_print02.practice05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 入力
		Scanner scan = new Scanner(System.in);
		System.out.print("整数値を入力：");
		int a = scan.nextInt();
		System.out.print("整数値を入力：");
		int b = scan.nextInt();
		System.out.print("整数値を入力：");
		int c = scan.nextInt();
		
		
		/*int型の最小値
		int max = Integer.MIN_VALUE;
		System.out.println(max);*/
		
		
		//数値の比較
		int max = a;
		
		if(b > max) {
			max = b;
			
		}
		if(c > max) {
			max = c;
			
		}
		
		
		
		System.out.println(max);
		scan.close();
	}
	
	

}
