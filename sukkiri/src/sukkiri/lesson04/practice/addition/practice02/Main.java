package sukkiri.lesson04.practice.addition.practice02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// (1)9×９の形の二次元配列を宣言してください。（int型配列　変数名MulTable）
		//(2)二重for文を使い、MulTableに九九の値をセットしてください
		//（配列のインデックスと九九の桁が異なるため、配列の要素に値を入れるときは少し工夫が必要。）
		
		
		
		Scanner scan = new Scanner(System.in);
		int[][] mulTable = new int[9][9];
		
		for(int i = 0;i < mulTable.length;i++) {
			for(int j = 0;j < mulTable.length;j++) {
				mulTable[i][j] = (i+1)*(j+1);
				System.out.printf("%3d",mulTable[i][j]);
			}
			System.out.println("");
		}
		//二重for文とif文を使い、入力値が存在する場合は全ての組み合わせと件数を表示する。
		//存在しない場合は、「入力値が九九の表には存在しません」と表示する
		int count =0;
		System.out.print("整数値を入力：");
		int num = scan.nextInt();
		for(int i = 0;i < mulTable.length;i++) {
			for(int j = 0;j < mulTable.length;j++) {
				if(num == mulTable[i][j]) {
					System.out.println((i+1) +"Ｘ" + (j+1));
					count++;
				}
			}

		}
		if(count == 0) {
			System.out.println("入力値が九九の表には存在しません");
		}else {
			System.out.println(count +"件見つかりました。");
		}
		scan.close();
	}

}
