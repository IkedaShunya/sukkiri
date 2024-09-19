package sukkiri.lesson04.practice.print04.practice09;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		/*以下の値を要素の値として持つ配列omikuziを作り、
		乱数を用いておみくじ結果を表示しましょう
		要素の中身は以下の通り。
		if文、for文を使用せずに結果を表示すること。*/
		
		//Randomクラスのインスタンス化
		Random rand =new Random();
		
		String[] omikuzi = {"[0] 凶","[1] 吉","[2] 中吉","[3] 大吉"};
		
		int result = rand.nextInt(4);
		
		System.out.print(omikuzi[0] );
		System.out.print(omikuzi[1] );
		System.out.print(omikuzi[2] );
		System.out.println(omikuzi[3]);
		
		System.out.println("あなたの結果は"+ omikuzi[result] +"です。");
		
		
		


	}

}
