package sukkiri.lesson04.practice04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//int型の配列numbersの定義
		int[] numbers = {3,4,9};
		
		//数値の入力
		Scanner scan = new Scanner(System.in);
		System.out.println("１桁の数字を入力してください：");
		int input = scan.nextInt();
		
		for(int i = 0; i < numbers.length; i++) {
			if(input == numbers[i]) {
				System.out.println("アタリ！");
			}
		}
		
		
		//ｎ=numbers[x]の値を代入し続ける
		for(int n: numbers) {
			if (input == n){
				System.out.println("アタリ！");
			}
		}
			scan.close();
		
		

	}

}
