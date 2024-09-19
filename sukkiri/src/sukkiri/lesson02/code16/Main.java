package sukkiri.lesson02.code16;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("あなたの名前を入力してください。");
		
		Scanner sc = new Scanner(System.in);//②インスタンス化し、変数scに代入
		String name = sc.nextLine();//③インスタンス変数を使いnextLine()メソッドを代入
		
		sc.close();
		//String name = new java.util.Scanner(System.in).nextLine();
		
		System.out.println("あなたの年齢を入力してください。");
		System.out.println("1:大吉 2:吉 3:中吉 4:凶");
		
		int age = sc.nextInt();
		
		//int age = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ、" + age + "歳の" + name + "さん");
			
	}

}
