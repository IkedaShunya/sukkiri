package sukkiri.lesson05.practice_print05.practice08;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int[] array = new int[5];
		
		for(int i =0; i < array.length ;i++) {
			System.out.print((i+1) +"つめの値を入力してください：");
			array[i] = scan.nextInt();
		}
		
		scan.close();
		int min = minValue(array);
		
		System.out.println("min = "+ min);

	}
	
	/*メソッド名： minValue
	引数：int[]型 array
	戻り値の型：int
	処理の内容：引数で受け取る配列の要素のうち、最も小さい値を返し表示する。
		　　　 配列の要素数は5で固定、各値はキーボード入力とします。*/
	
	public static int minValue(int[] array) {
		
		int min = array[0];
		for(int i =0; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		
		return min;
	}


}
