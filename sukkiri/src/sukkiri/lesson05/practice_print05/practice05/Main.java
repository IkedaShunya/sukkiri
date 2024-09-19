package sukkiri.lesson05.practice_print05.practice05;

public class Main {
	/*メソッド名： printMin
	引数： double a, double b, double c
	戻り値：なし
	処理の内容： 引数で渡された a, b, c の値のうち、最小値を出力する*/


	public static void main(String[] args) {
		double a = 5.3;
		double b = 2.9;
		double c = 7.9;
		printMin(a,b,c);

	}
	
	//
	public static void printMin(double a, double b, double c) {
		double min = a;
		/*
		 * double min = Math.min(Math.min(a,b),c)
		 */
		if(min > b) {
			min =b;
		}
		if(min > c) {
			min =c;
		}
		System.out.println(String.valueOf(a) +"と"+String.valueOf(b) + "と"+ String.valueOf(c) +"の最小値は"+min);
	}

}
