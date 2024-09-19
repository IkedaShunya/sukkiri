package sukkiri.lesson03.practice.practice_print03.practice03;

public class Main {

	public static void main(String[] args) {
		// for文を使い、１～１０までの整数の合計を表示するプログラムを作りましょう。
		int num =0;
		
		for(int i = 0; i < 10; i++) {
			num += i+1;
			
		}
		System.out.println(num);

	}

}
