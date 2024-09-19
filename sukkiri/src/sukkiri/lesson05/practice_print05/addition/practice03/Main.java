package sukkiri.lesson05.practice_print05.addition.practice03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	private static Random rand = new Random();
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		/*メソッド名：main
		引数：String[] args
		戻り値：なし
		処理の内容：①int型変数nを宣言し、キーボードから入力を行う。
		②変数nをgetAryメソッドに引数として渡し、戻り値を受け取る。
		③getAverageメソッドに②で受け取った戻り値を引数として渡し、戻り値を受け取る。
		④「平均値は（③の戻り値）です」という形で表示する。*/
		
		System.out.println("変数ｎ:");
		int n = scan.nextInt();
		
		double[] d = getAry(n);
		double ave = getAverage(d);
		
		System.out.printf("平均値は%2.2fです" ,ave);

	}

	/**
	 * メソッド名： getAverage
	 *引数：double[] array
	 *戻り値の型：double
	 *処理の内容： 引数で受け取る配列の要素の平均値を呼び出し元のmainメソッドに返す。
	 */
	public static double getAverage(double[] array) {
		double ave = Arrays.stream(array).average().getAsDouble();
		return ave;
	}

	/*メソッド名：printAry
	引数：double[] d
	戻り値の型：なし
	処理の内容：引数で受け取った配列を拡張for文で全て表示する。
			　「乱数値は〇〇〇です」という形で出力表示する。*/

	public static void printAry(double[] d) {
		for(double num : d) {
			System.out.printf("乱数値は%2.1fです。\n",num);
		}

	}

	/*メソッド名：getAry
	引数：int a
	戻り値の型：double[]
	処理の内容：①引数で受け取ったint型変数aの要素数のdouble型配列を宣言する。
			　　②for文と乱数を使い、配列の各要素に0.0～1.0の間の値を代入する。
			　　③printAryメソッドに配列を引数として渡しメソッドを呼び出す。
	　　		④配列を戻り値として返す。
	 */

	public static double[] getAry(int a) {

		double[] d = new double[a];
		for(int i =0;i <d.length ;i++) {
			int c = rand.nextInt(11);
			d[i] = (double)c / 10;


			
		}

		printAry(d);


		return d;
	}




}
