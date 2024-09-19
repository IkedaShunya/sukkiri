package sukkiri.lesson15.practice04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//①現在の日付をDate型で取得する。
		Date d = new Date();
		System.out.println("d；　" + d);
		
		//②取得した日付情報をCalendarにセットする
		Calendar c  = Calendar.getInstance();
		System.out.println("c；　" + c);
		c.setTime(d);
		System.out.println("c；　" + c);;
		
		
		//③Calendarから「日」の数値を取得
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		//④取得した値に100を足した値をCalendarの「日」セットする
		c.set(Calendar.DAY_OF_MONTH,day +100);
		
		//⑤Calendarの日時情報をDate型に変換数
		Date pulsD =c.getTime();
		
		
		//⑥SimpleDateFromatを用いて、指定された形式でDateインスタンスの内容を表示する
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
		String pulsDayStr = f.format(pulsD);
		System.out.println(pulsDayStr);
		
	}

}
