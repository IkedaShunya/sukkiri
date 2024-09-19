package sukkiri.lesson02.practice.practice_print01.practice15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//変数name 、ageを使用してキーボードから入力した下記の名前と年齢を表示してください。
		Scanner scan = new Scanner(System.in);
		
		System.out.print("名前を入力：");
		String name = scan.nextLine();
		
		System.out.print("年齢を入力：");
		String stringAge = scan.nextLine();
		
		int age = Integer.parseInt(stringAge);
		
		scan.close();
		
		System.out.printf("%sさんの年齢は%d歳です。\n",name,age);
		
		
		

	}

}
