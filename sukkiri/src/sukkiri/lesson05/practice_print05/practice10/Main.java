package sukkiri.lesson05.practice_print05.practice10;

import java.util.Scanner;

public class Main {
	// 次のプログラムの ３つ領域 （キー入力部分、処理部分、表示部分）を
	//それぞれメソッド化し、
	//これらのメソッドを使ったプログラムに書き直してください。
	//キー入力部分、処理部分、表示部分のメソッド名は、
	//それぞれ、inputNumber、numberToMessage、showMessage とします。

	public static void main(String[] args) {
		int inNumber = key_input();
		String msg = message_input(inNumber);
		message_display(msg);


	}

	//キー入力部分
	public static int key_input() {
		int  inNumber ;
		Scanner sc = new Scanner( System.in );
		System.out.print(" Input no. : ");
		inNumber = sc.nextInt();
		sc.close();
		return inNumber;
	}

	//処理部分
	public static String message_input(int inNumber) {
		String msg = "" ;
		switch( inNumber ){
		case 1 :
			msg = "Good Morning" ; 
			break ;
		case 2 :
			msg = "Good Afternoon" ; 
			break ;
		case 3 : 
			msg = "Good Evening" ; 
			
		}
		return msg;
	}
	
	//表示部分
	public static void message_display(String msg) {
	System.out.println( msg ) ;
	}
}