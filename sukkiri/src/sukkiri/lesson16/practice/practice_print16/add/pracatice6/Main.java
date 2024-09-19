package sukkiri.lesson16.practice.practice_print16.add.pracatice6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// メソッド名： main
		//引数：String[] args
		//戻り値：void
		/*処理の内容： 
		1.スキャナを使えるようにし、乱数を作成する個数を入力させる。
		2.getListDataメソッドに入力した値を引数で渡した後、戻り値を受け取る。
		3.showListDataメソッドにArrayListを引数に入れて渡す。*/
		
		Scanner scan =new Scanner(System.in);
		Random rand = new Random();
		
		
		System.out.print("Randomインスタンスを作成する数を指定してください：");
		int inputNum = Integer.parseInt(scan.nextLine());
		int randNum = rand.nextInt(inputNum) + 1;
		System.out.println(randNum);
		
		ArrayList<Random> list = getListDate(randNum);
		showListData(list);
		
		scan.close();
	}
	/*メソッド名： getListData
	引数：int型
	戻り値：ArrayList<Random>
	処理の内容： 
	1.	ArrayListを変数名listとし宣言する
	2.	引数で受け取った整数の回数だけRandomインスタンスを生成し、listに加える。
	3.	listを戻り値として返す。*/
	
	public static ArrayList<Random> getListDate(int randNum){
		ArrayList<Random> list = new ArrayList<>();
		
		for(int i = 0; i < randNum; i++) {
			list.add(new Random());
			//System.out.println(list.get(i));
		}
		
		return list;
		
		
	}
	
	/*メソッド名： showListData
	引数：ArrayList
	戻り値：なし
	処理の内容： 引数で受け取ったリストを、for文を使い中身を表示する。*/
	
	public static void showListData(ArrayList<Random> list) {
		for(Random rand : list) {
			System.out.println(rand);
			
		}
	}


	

}
