package sukkiri.lesson04.practice.print04.addition.practice02;

import java.util.Random;

public class Main {
	public static void main(String args[]) {
		//int型配列aryを要素数20で宣言してください
		int[] ary = new int[20];
		
		//aryの各要素に、乱数を用いて０～９９の値をセットしてください。
		Random rand = new Random();
		
		for(int i=0; i < ary.length; i++) {
			ary[i] = rand.nextInt(100);
			//aryの要素を全部表示してください
			System.out.print(ary[i] +" " );
		}
		System.out.println();
		
		//aryを二重for文、if文を使い昇順で並び替えてください。
		int[] sort = new int[ary.length];
		int temp;
		
		for(int i = 0; i < ary.length; i++) {
			sort [i] = ary[i];
			for(int j=0; j < i ;j++) {
				if(sort[j] < sort[i]) {
					temp =sort[i];
					sort[i] = sort[j];
					sort[j] = temp;
				}
				
			}
			
		
		}
		for(int i=0; i < ary.length; i++) {
			ary[i] = rand.nextInt(100);
			//aryの要素を全部表示してください
			System.out.print(sort[i] +" " );
		}
		
		
	}

}
