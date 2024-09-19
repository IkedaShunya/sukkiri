package sukkiri.lesson15.practice_print15_02.practice04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// Dateクラスを使用して現在の日時を実行結果の形式で表示してください。
		
		Date now = new Date();
		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日（E）HH時mm分ss秒");
		
		String s = f.format(now);
		
		System.out.println(s);

	}

}
