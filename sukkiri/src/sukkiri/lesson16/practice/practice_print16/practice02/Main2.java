package sukkiri.lesson16.practice.practice_print16.practice02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
//		①	キーボードから入力する回数を変数nに代入。
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
//		②	 for文を使い、n回キーボードから数値の入力を繰り返し、ArrayListに追加していく。
		List<Integer> numList = new ArrayList<Integer>();
		
		for(int i =0; i < n; i++) {
			numList.add(scan.nextInt());
			
		}
//		③	 for文を再度使い、if文を使って最小値を求める。
		int min = numList.get(0);
		for(int num : numList) {
			if(min > num) {
				min =num;
			}
		}
//		④	 求めた最小値を表示する。
		System.out.println("最小値："+min);
		
		scan.close();
	}

}
