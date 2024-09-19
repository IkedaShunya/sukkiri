package sukkiri.lesson03.practice.addition.practice01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*（if文、for文）
		整数を５回キーボードから入力し最小値及び最大値を求めるプログラムを作りましょう。
		　最小値を持たせるための変数をint型minとする。
		ｍinの初期値については、int型の持てる最大値になるInteger.MAX_VALUEを使うこと。
		最大値を持たせるための変数をint型maxとする。
		maxの初期値については、int型の持てる最小値になるInteger.MIN_VALUEを使うこと。*/
		
		
		Scanner scan = new Scanner(System.in);
		
		int[] nums = new int[5];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		
		for(int i= 0; i <5; i++) {
			
			System.out.print("入力：");

			
			nums[i] = scan.nextInt();
			
			if(nums[i] < min) {
				min = nums[i];
			}
			if(nums[i] > max) {
				max = nums[i];
			}
			System.out.print("");
		}
		scan.close();
		
		System.out.printf("最小値は%dです。\n",min);
		System.out.printf("最大値は%dです。\n",max);


	}

}
