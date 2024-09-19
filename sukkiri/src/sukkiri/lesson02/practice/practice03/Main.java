package sukkiri.lesson02.practice.practice03;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//Scanner,Randomインスタンスの生成
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		
		//①画面に文字を表示
		System.out.println("ようこそ占いの館へ");
		
		 System.out.println();
		//名前の入力を指示
		System.out.print("あなたの名前を入力してください＞");
		
		//入力値の受付
		String name = sc.nextLine();
		
		//String name = new java.util.Scanner(System.in).nextLine();
		
		
		//年齢の入力を指示
		System.out.print("あなたの年齢を入力してください＞");
		
		//入力値の受付
		String ageString = sc.nextLine();
		
		
	    //String ageString = new java.util.Scanner(System.in).nextLine();
	    //入力された年齢をint型に変更
	    int age = Integer.parseInt(ageString);
	    
	    
	    //乱数の発生
	    
	    int fortune = rand.nextInt(4);
	    
	    //int fortune = new java.util.Random().nextInt(4);
	    //乱数に+1
	    fortune += 1;
	    
	    sc.close();
	    //占いの結果を表示
	    System.out.println("占いの結果がでました！");
	    System.out.println(age + "歳の" + name + "さんの、あなたの運気番号は" + fortune +"です");
	    /*%変数  指定した変数の順番に入る。文字列は%s、整数値は%d
	    　改行したい場合は\nを入れる*/
	    System.out.printf("%d歳%sさん、あなたの運気番号は%dです\n",age,name,fortune);
	    
	    
	    
		
	}

}
