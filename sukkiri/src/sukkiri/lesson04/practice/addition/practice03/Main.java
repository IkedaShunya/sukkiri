package sukkiri.lesson04.practice.addition.practice03;

public class Main {

	public static void main(String[] args) {
		// 次のint型変数の中身を、下記以外の変数を１つ用いて入れ替えて表示してください。
		//※この知識は問４で使います。
	    int x = 3;  int y = 5;
		
		int z = x;
		x = y;
		y = z;
		
		System.out.println("x:" + x );
		System.out.println("y:" + y );


	}

}
