package sukkiri.lesson05.practice_print05.practice07;

import java.util.Random;

public class Main {
	/*
	 ※配列を使ってください	 
	メソッド名： weather
	引数：なし
	戻り値の型： String
	処理の内容： 天気予報メッセージをランダムに生成して、そのメッセージを返す。
	天気予報メッセージは、次の中からランダムに組み合わせて作り出すものとする。
	{今日・明日・明後日}の天気は{晴れ・曇り・雨・雪}でしょう。 
	例：明日の天気は雨でしょう。
	ヒント：引数なしなので、メソッド呼び出し時に渡す値はありません。
	配列の宣言はweatherメソッドの中で行います。
	 */


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String randomWheather = weather();
		System.out.println(randomWheather);

	}
	//処理；ランダム変数（dayNumber,weatherNumber）を作成し、int型に格納
	//		下記処理を実施。
	//		①もし、dayNumberが0の場合「今日」、1の場合「明日」、2の場合「明後日」を
	//		　String型変数「day」に格納
	//		②もし、weatherNumberが0の場合「晴れ」、1の場合「曇り」、2の場合「雨」、
	//　　　　3の場合「雪」をString型変数「weather」に格納
	//		③①と②の変数を足したものを「randomWheather」に格納

	public static String weather() {
		Random rand = new Random();
		//int dayNumber =rand.nextInt(3);
		//int weatherNumber =rand.nextInt(4);
		String[] day = {"今日","明日","明後日"};
		String[] weather ={"晴れ","曇り","雨","雪"};
		String randomWheather =day[rand.nextInt(3)] + "の天気は" + weather[rand.nextInt(4)] +"でしょう。";
		
		
		/*if(dayNumber == 0) {
			day = "今日";
		}else if(dayNumber == 1) {
			day = "明日";
		}else {
			day = "明後日";
		}

		if(weatherNumber == 0) {
			weather = "晴れ";
		}else if(weatherNumber == 1) {
			weather = "曇り";
		}else if(weatherNumber == 2) {
			weather = "雨";
		}else {
			weather = "雪";
		}

		System.out.println(""+dayNumber +";"+weatherNumber);*/

		// String randomWheather =day + "の天気は" + weather +"でしょう。";
		

		return randomWheather;
	}

}
