package sukkiri.lesson02.practice.practice_print01.addition.practice04;

import java.util.Random;

public class Main {
	/*―５～５までのランダムな数値を発生させて
	（、変数randに発生させた乱数値を代入し）表示してください。
	実行結果
	乱数値：-2  //値はー５～５のいずれか 
	*/



	public static void main(String[] args) {
		Random rand = new Random();
		int a =rand.nextInt(11)-5;
		
		System.out.println("乱数値：" + a);

	}

}
