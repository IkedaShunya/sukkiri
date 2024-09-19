package sukkiri.lesson02.practice.practice_print01.addition.practice02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// double型の変数pにキーボードから円周率(3.14)を代入し、表示しましょう。
		//その後変数pを、int型にキャストして、再度表示しましょう。
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("pの値を入力：");
		double p = scan.nextDouble();
		
		System.out.print("円周率は" + p+ "です");
		
		
		System.out.println("円周率は" +(int) p+ "です");
		
		scan.close();

	}

}
