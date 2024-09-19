package sukkiri.lesson16.practice_print16.addition.practice03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//多項式の文字列を作るプログラムの作成

/*＜手順＞
①　次数を受け付け
②　係数、定数項を受け付け
③　①②からxの多項式の文字列を生成

＜注意事項＞
※入力値はすべて整数とする
※次数は「^(ハット)」で表す
　例えば「xの2乗」は「x^2」とする
※xの(各次の)係数が1なら、1は表示せずxだけ表示する
※最高次の係数は0以外を入力する
※すべてmainメソッド内に記述
※StringBuilder、ArrayListを用いる
*/

//次数入力：3
/*
 *3次：4
 *2次：3
 *1次：2
 */

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("次数入力：");
		int input = Integer.parseInt(scan.nextLine());
		
		List<Integer> inputNums = new ArrayList<>();
		
		for(int i=input ;i > 0 ; i--) {
			System.out.print(i+ "次:");
			int inputNum = scan.nextInt();
			inputNums.add(inputNum);
		}
		
		System.out.print("定数項:");
		int constantNum = scan.nextInt();
		inputNums.add(constantNum);
		
		for(int i = 0; i < inputNums.size(); i++) {
			if(inputNums.get(i) == 0) {
			}else if( (i+2) ==inputNums.size()) {
				System.out.println("x");
				break;
			}
			else if(inputNums.get(i) == 1 ) {
				System.out.print("x^" + (input-i));
			}else{
				System.out.print("+"+inputNums.get(i) +"x^" + (input-i));
			}
		}
		
		if(inputNums.get(inputNums.size()-1) == 0) {
			System.out.print("");
		}else {
			System.out.print("+" + inputNums.get(inputNums.size()-1));
		}
		

	}
	
	

}
