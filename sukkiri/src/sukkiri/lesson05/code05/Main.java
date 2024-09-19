package sukkiri.lesson05.code05;

public class Main {

	public static void main(String[] args) {
		add(100, 20);
		add(200, 50);

	}
	
	//引数の値を+するメソッド
	public static void add(int x, int y) {
		int ans = x +y;
		System.out.println(x + "+" + y + "=" + ans );
	}

}
