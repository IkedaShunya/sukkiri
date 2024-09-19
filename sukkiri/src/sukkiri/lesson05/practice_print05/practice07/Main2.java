package sukkiri.lesson05.practice_print05.practice07;

import java.util.Random;

public class Main2 {
	/*
	 ※配列を使ってください	 
	メソッド名： weather
	引数：なし
	戻り値の型： String
	処理の内容： 天気予報メッセージをランダムに生成して、そのメッセージを返す。
	天気予報メッセージは、次の中からランダムに組み合わせて作り出すものとする。
	{今日・明日・明後日}の天気は{晴れ・曇り・雨・雪}でしょう。 
	例：明日の天気は雨でしょう。
	*/
	public static void main(String[] args) {
		
		System.out.println(weather());

	}
	public static String weather() {
		String[] weathers = {"晴れ","曇り","雨","雪"};
		String[] days = {"今日","明日","明後日"};
		
		Random rand = new Random();
		
		int weatherNum = rand.nextInt(4);
		int dayNum = rand.nextInt(3);
		
		return days[dayNum]+"の天気は"+ weathers[weatherNum] + "でしょう";
		
		}

}
