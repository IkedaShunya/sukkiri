package sukkiri.lesson04.practice.print04.practice10;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		//(1)5×5の形の二次元配列を宣言してください。（int型配列 変数名numbers)
		int[][] numbers = new int[5][5]; 


		/*(2)二重for文で配列numbersの各要素に、
		乱数を用いて1～50の値をセットしてください。
		numbers[2][2]の時は0を代入し、それ以外のときは乱数の
		値を代入するようにif文を使って記述すること。*/
		Random rand = new Random();
		System.out.println(numbers.length);
		System.out.println(numbers[0].length);

		//各要素の値に代入
		for(int i =0; i < numbers.length; i++) {
			for(int j =0; j < numbers[0].length; j++) {
				if(i ==2 && j ==2) {
					numbers[i][j] = 0;

				}else {
					numbers[i][j] = rand.nextInt(50)+1;
				}

			}
		}

		//(3)二重for文を使い、numbersの配列をprintfを使い
		//3桁指定で表示してください。
		//if文を使って要素の値が0のときは☆を表示するようにしてください。
		//整数値を表示はSystem.out.printf(“%3d”,a[][]);
		//a[][]には配列の添え字（インデックス）が入る
		//☆を表示時は、System.out.printf(“%2s”,”☆”);と書く

		for(int i =0; i < numbers.length; i++) {
			for(int j =0; j < numbers[0].length; j++) {
				if(numbers[i][j] == 0) {
					System.out.printf("%2s","☆");
				}else {
					System.out.printf("%3d",numbers[i][j]);
				}		

			}
			System.out.println();
		}

	}

}
