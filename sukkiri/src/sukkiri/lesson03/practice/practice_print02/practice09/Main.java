package sukkiri.lesson03.practice.practice_print02.practice09;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 自分の手を入力
		Scanner scan = new Scanner(System.in);
		System.out.print("数値（グー：０、チョキ：１、パー：２）を入力してください:");
		int myNum = scan.nextInt();

		//入力値が正常かどうかx
		if(myNum != 0 && myNum != 1 && myNum != 2) {
			System.out.println("入力が不正です");

		}else{
			Random ran = new Random();	
			int opponent = ran.nextInt(3);

			//自分のじゃんけん
			if (myNum == 0) {
				System.out.println("あなたの手はグーです");

			}else if(myNum == 1){
				System.out.println("あなたの手はチョキです");

			}else if(myNum == 2) {
				System.out.println("あなたの手はパーです");
			}


			//相手のじゃんけん
			if (opponent == 0) {
				System.out.println("コンピュータの手はグーです");

			}else if(opponent == 1){
				System.out.println("コンピュータの手はチョキです");

			}else if(opponent == 2) {
				System.out.println("コンピュータの手はパーです");
			}

			//じゃんけん結果
			int result = (opponent - myNum + 3) % 3;
			System.out.println(result);			
			
			
			if(result == 0) {
				System.out.println("あいこです。");

			}else if(result == 1) {
				System.out.println("あなたの勝ちです。");

			}else if(result == 2) {
				System.out.println("あなたの負けです");

			}

		}

		scan.close();

	}
	
	// 自分の手を入力
	//Scanner scan = new Scanner(System.in);
//	System.out.print("数値（グー：０、チョキ：１、パー：２）を入力してください:");
//	int myNum = scan.nextInt();
//	
//	
//	//入力値が正常化(true)か不正（false）か
//	System.out.println(myNum);
	
	//
//	
//	if(myNum == 0 || myNum == 1 || myNum == 2) {
//		Random ran = new Random();	
//		int opponent = ran.nextInt(3);
//
//		//自分のじゃんけん
//		if (myNum == 0) {
//			System.out.println("あなたの手はグーです");
//
//		}else if(myNum == 1){
//			System.out.println("あなたの手はチョキです");
//
//		}else if(myNum == 2) {
//			System.out.println("あなたの手はパーです");
//		}
//
//
//		//相手のじゃんけん
//		if (opponent == 0) {
//			System.out.println("コンピュータの手はグーです");
//
//		}else if(opponent == 1){
//			System.out.println("コンピュータの手はチョキです");
//
//		}else if(opponent == 2) {
//			System.out.println("コンピュータの手はパーです");
//		}
//
//		//じゃんけん結果
//		int result = (opponent - myNum + 3) % 3;
//		System.out.println(result);
//		if(result == 0) {
//			System.out.println("あいこです。");
//
//		}else if(result == 1) {
//			System.out.println("あなたの勝ちです。");
//
//		}else if(result == 2) {
//			System.out.println("あなたの負けです");
//
//		}
//
//	}else{
//		System.out.println("入力が不正です");
//
//	}
//
//	scan.close();




}


