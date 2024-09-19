package sukkiri.lesson03.practice.addition.practice07;

import java.util.Random;
import java.util.Scanner;

public class Main {

	  public static void main(String[] args){
	      /*  do-while文、switch文、乱数を使い、おみくじのプログラムを作成してください。
	　　　　 乱数値は0～3の範囲になるようにしてください。
	　　　　 値が０のときは凶、１のときは吉、２のときは中吉、３のときは大吉を表示。
	　　　　 結果を表示後、再度おみくじを行うか確認を求め、入力値がyの場合は再度おみくじを、nの場合はおみくじを終了させてください。*/
	        Random rand = new Random();
	        Scanner scan = new Scanner(System.in);


	        String s = null;

	        do{
	            int num = rand.nextInt(4);
	            switch(num){
	                case 0 -> {
	                    System.out.println("凶");
	                }
	                case 1 -> {
	                    System.out.println("吉");
	                }
	                case 2 -> {
	                    System.out.println("中吉");
	                }
	                case 3 -> {
	                    System.out.println("大吉");
	                }
	            }

	            do{
	                System.out.print("再度おみくじを行いますか？(y/n): ");
	                s = scan.nextLine();
	                if(s.equals("n") || s.equals("y") ){
	                    break;
	                }else{
	                    System.out.println("正しく入力してくだい");
	                }
	            }while(true);

	        }while(s.equals("y"));


	        scan.close();
	    }
	  

}
