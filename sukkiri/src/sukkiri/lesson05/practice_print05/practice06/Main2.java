package sukkiri.lesson05.practice_print05.practice06;

public class Main2 {
	/*メソッド名：getMin
	 引数：double a, double b
	戻り値の型：double　return文で三項条件演算子を使用して下さい (テキストp122参照)
	処理の内容： 引数で受け取る2つの値のうち、小さい方の値を返す*/

	public static void main(String[] args) {
		double a = 3.4;
		double b = 3.5;
		double min = getMin(a,b);
		System.out.println(min);

	}
	
	public static double getMin(double a, double b) {
		
		//参考条件式　変数　= 条件式　? trueの値 : falseの値:
		double min = a <= b ? a  : b; 
		
		return min;
	}

}
