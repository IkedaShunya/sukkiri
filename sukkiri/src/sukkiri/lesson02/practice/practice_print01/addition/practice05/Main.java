package sukkiri.lesson02.practice.practice_print01.addition.practice05;

import java.util.Random;

/*
 * 0.0から1.0(1.0含まず)までのランダムな数値を発生させて
 * （、変数randに発生させた乱数値を代入し）表示してください。
 */

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		double a = rand.nextDouble(1.0);
		System.out.printf("%1.1f\n",a);
		
		

	}

}
