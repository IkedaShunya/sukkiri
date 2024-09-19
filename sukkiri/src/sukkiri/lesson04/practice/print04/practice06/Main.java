package sukkiri.lesson04.practice.print04.practice06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*問5と同じようにString型配列subjects、
		int型配列scoresを作りましょう。
		for文を使い配列scoresにキーボードより点数を入力し、
		実行結果のようにＢ君の点数を表示してください。
		（ループ条件にはlengthを利用すること）*/
		
		//Scannerクラスをインスタンス化
		Scanner scan = new Scanner(System.in);
		
		String[] subjects = {"英語","国語","数学","社会","理科"};
		//int[] scores = new int[subject.length];
		int[] scores = new int[5];
		
		//キーボード入力からScoreに代入するループ
		for(int i =0; i < scores.length; i++) {
			System.out.print(subjects[i] +": ");
			scores[i] = scan.nextInt();
		}

		System.out.print("B君：" + subjects[0] +" "+ scores[0]  +"点、" );
		System.out.print( subjects[1] +" "+ scores[1]  +"点、");
		System.out.print( subjects[2] +" "+ scores[2]  +"点、");
		System.out.print( subjects[3] +" "+ scores[3]  +"点、");
		System.out.println( subjects[4] +" "+ scores[4]  +"点");
		
		/*上記の実行結果例を元にB君の点数を表示後、
		 *Ｂ君の追試が必要な科目数を求めて表示する
		 *プログラムを続けて作りましょう。
		 * 50点以下の科目を追試とします。
		 * ※　int型配列scores、for文、if文を使ってください。
         *（ループ条件にはlengthを利用すること）
		 */
		//追試が必要な科目数用の変数を用意
		
		int count = 0;
		
		ArrayList<String> faildtest = new ArrayList<String>();
		
		
		for(int i =0; i < scores.length; i++) {
			if(scores[i] <= 50) {
				faildtest.add(subjects[i]) ;
				
				count++;
			}
		}
		
		System.out.println("B君は" +count + "科目追試が必要です。");
		System.out.print("赤点科目名は");
		System.out.print(faildtest);
		
		for(int i =0 ; i < faildtest.size();i++) {

			
			if(i == faildtest.size()-1) {
				System.out.println("です。");
			}
		}
		scan.close();
		
	}

}
