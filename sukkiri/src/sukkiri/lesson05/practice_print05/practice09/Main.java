package sukkiri.lesson05.practice_print05.practice09;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// 配列の要素数、各値はキーボード入力とします。
		Scanner scan = new Scanner(System.in);
		System.out.print("配列の要素数を入力してください:");
		double[] array = new double[scan.nextInt()];


		//// 配列の要素分、値をキーボード入力とします。
		for(int i =0; i < array.length ;i++) {
			System.out.print((i+1) +"つめの値を入力してください：");
			array[i] = scan.nextDouble();
		}

		scan.close();
		double ave = average(array);

		System.out.println("ave = "+ ave);

	}




	/*メソッド名： average
	引数：double[] array
	戻り値の型：double
	処理の内容： 引数で受け取る配列の要素の平均値を返し表示する。
	　　　　　　 配列の要素数、各値はキーボード入力とします。
	 */

	public static double average(double[] array) {
		double sum = array[0];

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		double ave = sum / array.length;

		return ave;

	}

}
