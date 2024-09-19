package sukkiri.lesson03.practice.practice_print03.practice07;

public class Main {
	public static void main(String[] args) {
		// while文を使い、5～1の順に数字を表示するプログラムを作りましょう。
		
		//表示用の変数の宣言
		int num = 5;
		
		//numを表示し、繰り返し事にnumを-1する
		while(num > 0) {
			System.out.println(num);
			num -=1;
		}
	}

}
