package sukkiri.lesson04.practice.addition.practice04;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		//（１）	int型配列aryを要素数20で宣言してください
		int[] ary = new int[20];
		
		//（２）	aryの各要素に、乱数を用いて０～９９の値をセットしてください。
		//（３）	aryの要素を全部表示してください
		for(int i =0; i <ary.length; i++) {
			ary[i] = rand.nextInt(100);
			System.out.print(ary[i]+ " ");
		}
		
		//（４）	aryを二重for文、if文を使い昇順で並び替えてください。
		int temp = ary[0];
		
		for(int i =0; i < ary.length;i++) {
			for(int j = i+1; j < ary.length;j++) {
				if(ary[i] > ary[j]) {
					temp = ary[i];
					ary[i] = ary[j];
					ary[j] = temp;
				}
			}
		}
		System.out.println();
		//（５）	aryの要素を再度全部表示してください
		for(int i =0; i <ary.length; i++) {
			System.out.print(ary[i]+ " ");
		}

	}

}
