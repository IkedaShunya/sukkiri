package sukkiri.lesson16.practice.practice_print16.practice03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
//		下記表は東京の過去5年の１２月の平均気温です。
//		HashMap＜String,String＞で宣言し、下記のデータをキーボードから入力し、
//		Mapに追加していってください。
//		（入力は、年と気温を一行で入力し、半角スペースで区切ってください。）
//		次に、Mapのキーを全件表示してください。
//		最後にキーボードから表示したい年を入力し、その入力されたものがMapのキーと一致した場合、気温を表示するプログラムを作成しましょう。
		
		Scanner scan = new Scanner(System.in);
		System.out.println("年と気温を一行で入力し、半角スペースで区切ってください。");
		
		
		
		Map<String, String> temps = new  HashMap<String, String>();
		
		for(int i =0; i < 5; i++) {
			String input = scan.nextLine();
			String[] splitIn = input.split(" ");
			temps.put(splitIn[0], splitIn[1]);
		}
		System.out.println("入力された年は" + temps.keySet());
		
		String inputDisplay = scan.nextLine();
		
		String s =temps.get(inputDisplay);
		System.out.println(s);
		scan.close();
	}

}
