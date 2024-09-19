package sukkiri.lesson04.practice.addition.practice01;

import java.util.Random;

public class Main {
	
	
	public static void main(String[] args) {
	Random rand = new Random();
//	(1)5×5の形の二次元配列を宣言してください。（int型配列 変数名a)
		int[][] a = new int[5][5];
		
//	(2)二重for文でaの配列の各要素に、乱数を用いて1～50の範囲で値をセットしてください。
//	　a[2][2]の時は0を代入し、それ以外のときは乱数の値を代入するようにif文を使って記述すること。
		for(int i =0; i<a.length; i++) {
			for(int j =0; j<a.length; j++) {
				if(i ==2 && j==2) {
					a[2][2] = 0;
				}else {
					a[i][j] = rand.nextInt(50)+1;
				}
				
			}
			
		}
		
//	(3)二重for文を使い、aの配列をprintfを使い3桁指定で表示してください。
//	　if文を使って要素の値が0のときは☆を表示するようにしてください。
		for(int i =0; i<a.length; i++) {
			for(int j =0; j<a.length; j++) {
				if(a[i][j] == 0) {
					System.out.printf("%2s","☆");
				}else {
					System.out.printf("%3d",a[i][j]);
				}
				
				
			}
			System.out.println("");
			
		}
		
		
		
//	整数値を表示はSystem.out.printf(“%3d”,a[][]);//a[][]には配列の添え字（インデックス）が入る
//	☆を表示時は、System.out.printf(“%2s”,”☆”);と書く
//	※表示の形を綺麗にするため、今回System.out.printfを使っていますが15章の内容になります。


	}

}
