package sukkiri.lesson05.code07;

public class Main {
	
	//int型で変数ansを返す
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}
	

	public static void main(String[] args) {
		int ans = add(100,10);
		System.out.println("100 + 10" +"=" +ans);

	}

}
