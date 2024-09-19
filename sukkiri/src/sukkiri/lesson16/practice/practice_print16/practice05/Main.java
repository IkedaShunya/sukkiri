package sukkiri.lesson16.practice.practice_print16.practice05;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("乱数の個数を入力してくだいさい：");
		int radamNum = scan.nextInt();



		ArrayList<Integer> randamList =  new ArrayList<Integer>();
		randamList = getListData(radamNum);
		showListData(randamList);

		scan.close();

	}

	static ArrayList<Integer> getListData(int radamNum){
		Random rand = new Random();
		ArrayList<Integer> bingoNum =  new ArrayList<Integer>();
		while(true) {
			bingoNum.add(rand.nextInt(100));
			//3.Setのサイズが24になったときに無限ループからbreakで抜ける。
			if(bingoNum.size() ==radamNum) {
				break;
			}
		}

		return bingoNum;
	}

	static void showListData(ArrayList<Integer> randamList) {

		for(int num:randamList) {
			System.out.println(num);
		}



	}

}
