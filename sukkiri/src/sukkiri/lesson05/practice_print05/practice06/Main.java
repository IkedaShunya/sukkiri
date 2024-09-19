package sukkiri.lesson05.practice_print05.practice06;

public class Main {
	/*メソッド名：getMin
	 引数：double a, double b
	戻り値の型：double　return文で三項条件演算子を使用して下さい (テキストp122参照)
	処理の内容： 引数で受け取る2つの値のうち、小さい方の値を返す*/

	public static void main(String[] args) {
		double a = 3.1;
		double b =3.2;
		
		double min = getMin(a,b);
		
		System.out.println("a = " +a +"\nb = " +b +"\nの値のうち小さい方は" +min );

	}
	//三項条件演算子（公式）条件式 ? 式1 : 式2
	public static double getMin(double a, double b) {
		double min = a < b ? a :b;
		return min;
	}

}
