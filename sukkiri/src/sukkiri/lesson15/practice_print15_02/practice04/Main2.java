package sukkiri.lesson15.practice_print15_02.practice04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main2 {
	
	//Dateクラスを使用して現在の日時を実行結果の
	//形式で表示してください。
	
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyy/MM/dd(E) HH時mm分ss秒" );
		
		String strNow = sdf.format(now);
		
		System.out.println(strNow);
	}

}
