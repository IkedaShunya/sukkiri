package sukkiri.lesson16.practice.practice_print16.practice01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
//		(1)整数値を扱うArrayListを宣言してください。変数名はnumList
		List<Integer> arrayNum = new ArrayList<Integer>();
//		(2)文字列を扱うArrayListを宣言してください。変数名はstrList
		List<String> arrayStr = new ArrayList<String>();

		
//		(3)変数 numListに（1,10,100,200,5,50,500）の順番に値を追加してください。
		arrayNum.add(1);arrayNum.add(10);arrayNum.add(100);arrayNum.add(200);arrayNum.add(5);arrayNum.add(50);arrayNum.add(500);

		
//		(4)変数strListに「のび太」「すねお」「ジャイアン」「しずかちゃん」「出木杉君」を順番に追加してください。
		arrayStr.add("のび太");arrayStr.add("すねお");arrayStr.add("ジャイアン");arrayStr.add("しずかちゃん");arrayStr.add("出木杉君");
//		(5)for文を使い変数numListの中身を順番に表示してください。（要素数はsizeを使う。P584参照） 
		for(int num:arrayNum) {
			System.out.println(num);
		}
		
//		(6)イテレータを使い変数strListの中身を順番に表示してください。（テキストP588参照）
		Iterator<String> it = arrayStr.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

//		(7)for文を使い変数numListの中身の値が100以上の要素を削除してください。
		for(int i=0; i <arrayNum.size(); i++) {
			if(arrayNum.get(i) > 100) {
				System.out.println();
				arrayNum.remove(i);
				i--;
				
			}
		}
		
		
		
		
//		(8)拡張for文を使い変数numListの中身を順番に表示してください。(P585参照)
		for(int num:arrayNum) {
			System.out.println(num);
		}

	}

}
