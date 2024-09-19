package sukkiri.lesson16.practice.practice_print16.practice02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Integer型(整数)でArrayListを宣言し、キーボードから数値を複数回入力し、
		//ArrayListに入力した値を追加していってください
		//(入力する回数は別途キーボードから回数を指定する)
		//その後、ArrayListの中にある数値から最小値を表示するように
		//プログラムを作成してください。
		//処理手順：
		//①キーボードから入力する回数を変数nに代入。
		Scanner scan = new Scanner(System.in);
		System.out.print("キーボードから入力する回数 :");
		int inputNum  = scan.nextInt();
		
		//②for文を使い、n回キーボードから数値の入力を繰り返し、ArrayListに追加していく。
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(int i =0; i < inputNum; i++) {
			numbers.add(scan.nextInt());
		}
		
		
		//③for文を再度使い、if文を使って最小値を求める。
		int min = numbers.get(0);
		
		
		for(int num :numbers) {
			if(num < min) {
				min = num;
			}
			
		}
		
		//④求めた最小値を表示する。
		System.out.println("最小値は" + min);
		
		
		scan.close();
		


	}

}
