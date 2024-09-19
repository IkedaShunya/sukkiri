package sukkiri.lesson05.practice_print05.practice05;

public class Main2 {
	/*メソッド名： printMin
	引数： double a, double b, double c
	戻り値：なし
	処理の内容： 引数で渡された a, b, c の値のうち、最小値を出力する*/
	
	public static void main(String[] args) {
		double a= 3.0;
		double b = 5.0;
		double c =2.0;
		printMin(a,b,c);

	}
	
	public static void printMin(double a, double b, double c) {
		double min =a;
		if(min  > b) {
			min =b;
		}
		if(min >c) {
			min =c;
		}
		System.out.println(min);
	}

}
