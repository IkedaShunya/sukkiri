package sukkiri.lesson03.practice.practice_print03.practice08;

public class Main {
	
	//// while文を使い、１～１０までの整数の合計を表示する
	//プログラムを作りましょう。
	public static void main(String[] args) {
		
		//結果表示用の変数を宣言
		int result =0;
		
		//繰り返し用の変数
		int i = 0;
		
		//10までの数値を足す
		while(i < 10) {
			result +=(i+1);
			i++;
		}
		
		System.out.println(result);
	}

}
