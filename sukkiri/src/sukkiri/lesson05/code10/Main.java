package sukkiri.lesson05.code10;

public class Main {
	//引数が異なれば同じ名前のメソッドを複数定義することができる
	
	
	// 1つ目のaddメソッド
	public static int add(int x,int y) {
		return x + y;
	}
	
	// 2つ目のaddメソッド
	public static double add(double x,double y) {
		return x + y;
	}
	
	// 3つ目のaddメソッド
	public static String add(String x,String y) {
		return x + y;
	}

	public static void main(String[] args) {
		//引数int,int のため 1つ目のaddメソッド
		System.out.println(add(10, 20));
		
		//引数double,double のため 2つ目のaddメソッド
		System.out.println(add(3.5,2.7));
		
		//引数String,String のため 3つ目のaddメソッド
		System.out.println(add("Hello","World"));
		
		

	}

}
