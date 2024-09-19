package sukkiri.lesson16.practice.practice_print16.practice06;

import java.util.Random;
import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
	        //じゃんけんを繰り返すかどうかの判定を持つboolean型変数boolを用意する
	        // boolがtrueの時は繰り返す、falseの時は繰り返さない。

	        boolean bool = true;
	        Scanner scan = new Scanner(System.in);
	        Random rand = new Random();
	        int num = 0;
	        int com = 0;
	        String s = null;
	        //じゃんけんを繰り返す処理はwhile文を使う（boolを条件式に使う）
	        //do-while文を使い、「グー：０，チョキ：１，パー：２」以外の値が入力された場合、再度入力を求めるようにする。
	        while (bool) {
	            do {
	                System.out.print("あなたの手を入力してください（グー：０，チョキ：１，パー：２）:");
	                num = scan.nextInt();
	                scan.nextLine();
	                if (((num == 1) || (num == 2) || (num == 3))) {
	                    break;
	                }

	            } while (true);

	            com = rand.nextInt(3) ;
	            switch (num) {
	                case 0 -> {
	                    System.out.println("あなたの手はグーです");
	                }
	                case 1 -> {
	                    System.out.println("あなたの手はチョキです");
	                }
	                case 2 -> {
	                    System.out.println("あなたの手はパーです");
	                }
	            }
	            switch (com) {
	                case 0 -> {
	                    System.out.println("NPCの手はグーです");
	                }
	                case 1 -> {
	                    System.out.println("NPCの手はチョキです");
	                }
	                case 2 -> {
	                    System.out.println("NPCの手はパーです");
	                }
	            }

	            //勝敗判定はif-else if-elseを使い、「あなたの勝ち」「あなたの負け」「あいこ」を表示する

	            if ((num - com + 3) % 3 == 0) {
	                System.out.println("あいこです");
	            } else if ((num - com + 3) % 3 == 1) {
	                System.out.println("あなたの負けです");
	            } else if ((num - com + 3) % 3 == 2) {
	                System.out.println("あなたの勝ちです");
	            }

	            do {
	                System.out.print("再度対戦しますか？(y/n) : ");
	                s = scan.nextLine();

	                if (s.equals("n") ) {
	                    bool = false;
	                    break;

	                } else if(s.equals("y")){
	                    break;
	                }else {
	                    System.out.println("正しく入力してくだい");
	                }
	            } while (true);


	        }
	        scan.close();
	    }

}
