package sukkiri.lesson05.practice_print05.practice09;

import java.util.Scanner;

public class Main2 {
	/*メソッド名： average
	引数：double[] array
	戻り値の型：double
	処理の内容： 引数で受け取る配列の要素の平均値を返し表示する。
　　　　　　	 配列の要素数、各値はキーボード入力とします*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("配列の要素数：");
		int arrayNum = scan.nextInt();
		double[] array = new double[arrayNum];
		System.out.printf("配列の値を%3d回入力してください。\n",arrayNum);
		
		for(int i =0; i < arrayNum; i++) {
			array[i] = scan.nextDouble();
		}
		scan.close();
		
		System.out.println(average(array));

	}
	
	public static double average(double[] array) {
		double sum =0;
		for(double i : array) {
			sum += i; 
		}
		
		double average = sum /array.length;
		return average;
		
	}

}
