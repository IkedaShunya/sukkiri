package sukkiri.lesson15.practice_print15_02.practice05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// Calendarクラスを使用して現在の日時を実行結果の形式で表示してください。
		
		Calendar nowC = Calendar.getInstance();
		//Date型に変更
		Date nowD = nowC.getTime();
		
		//書式を設定
		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日（E）HH時mm分ss秒");
		//String型に変更（上で設定して書式）
		String nowTime = f.format(nowD);
		
		//時間の表示
		System.out.println(nowTime);

	}

}
