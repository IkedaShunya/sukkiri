package sukkiri.lesson04.practice.print04.addition.practice01;

public class Main {
	public static void main(String args[]) {
		/*次のint型変数の中身を、下記以外の変数を１つ用いて入れ替えて表示してください。
　　　   *この知識は問２で使います。
         *int x = 3,  int y = 5; 
		 */
		int x = 3;
		int y = 5;
		
		//int x→z , y →x  z→y
		
		int z =x;
		x = y;
		y = z;
		
		System.out.println("int x =" + x);
		System.out.println("int y =" + y);
		
	}

}
