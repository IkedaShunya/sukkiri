package sukkiri.lesson02.practice.practice_print01.addition.practice03;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// int型変数nにキーボードから値を入力させ、
		//０～ｎまでのランダムな数値を発生させて値を表示してください。
		
		Scanner scan = new Scanner(System.in);
		System.out.print("整数n：");
		int n = scan.nextInt();
		
		Random rand = new Random();
		int r = rand.nextInt(n+1);
		
		System.out.println("乱数値：" +r);
		
		scan.close();

	}

}
