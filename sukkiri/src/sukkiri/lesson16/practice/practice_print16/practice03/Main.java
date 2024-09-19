package sukkiri.lesson16.practice.practice_print16.practice03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//下記表は東京の過去5年の１２月の平均気温です。
		//HashMap＜String,String＞で宣言し、下記のデータをキーボードから入力し、
		//Mapに追加していってください。
		//（入力は、年と気温を一行で入力し、半角スペースで区切ってください。）
		//次に、Mapのキーを全件表示してください。
		//最後にキーボードから表示したい年を入力し、
		//その入力されたものがMapのキーと一致した場合、気温を表示するプログラムを作成しましょう。
		//2021年	2020年	2019年	2018年	2017年
		//7.9℃	7.7℃	8.5℃	8.3℃	6.6℃
		
		//HashMap＜String,String＞で宣言し、データをキーボードから入力し、
		Map<String,String> inputTemps = new HashMap<String,String>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("年・気温の入力（年と気温を一行で入力し、半角スペースで区切ってください）:");
		
		for(int i = 0; i < 5 ;i++) {
			String inputtemp  = scan.nextLine();
			String[] inputstr = inputtemp.split(" ");
			inputTemps.put(inputstr[0],inputstr[1]);
		}
		
		for(String year :inputTemps.keySet()) {
			System.out.println(year);
		}
		
		System.out.println("表示したい年を入力してください。");
		String  displayNum= scan.nextLine();
		System.out.println(inputTemps.get(displayNum));
		
		scan.close();


	}

}
