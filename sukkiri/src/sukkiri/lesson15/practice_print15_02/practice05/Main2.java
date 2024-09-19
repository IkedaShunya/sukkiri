package sukkiri.lesson15.practice_print15_02.practice05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main2 {

	public static void main(String[] args) {
		//Calendarクラスを使用して
		//現在の日時を実行結果の形式で表示してください。
		
		Calendar cal = Calendar.getInstance();
		Date now = cal.getTime();
		
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd(E) HH時mm分ss秒");
		String strNow = sdf.format(now);
		System.out.println(strNow);
		
		
	}

}
