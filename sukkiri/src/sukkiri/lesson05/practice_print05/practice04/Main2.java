package sukkiri.lesson05.practice_print05.practice04;

public class Main2 {
	/*メソッド名： printArea
	引数： double height, double width
	戻り値：なし
	処理の内容： 高さが height, 横幅が width の長方形の面積を出力する*/

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double height =3.5;
		double width =4.0;
		printArea(height,width);

	}
	
	public static void printArea(double height, double width) {
		double area = height*width/2;
		System.out.println(area);
	}

}
