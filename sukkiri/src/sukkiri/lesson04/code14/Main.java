package sukkiri.lesson04.code14;

public class Main {

	public static void main(String[] args) {
		// 拡張for文
		
		
		//値を順番に取り出したい配列やコレクションと、
		//取り出した値を格納する変数を:(コロン)で区切って記述します。
		int[] scores = { 20, 30, 40, 50, 80};
		for (int value : scores) {
			System.out.println(value);
		}

	}

}
