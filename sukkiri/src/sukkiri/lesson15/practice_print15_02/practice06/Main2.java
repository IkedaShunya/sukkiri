package sukkiri.lesson15.practice_print15_02.practice06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main2 {

	public static void main(String[] args) {
		//LocalDateTimeクラスを使用して
		//現在の日時を実行結果の形式で表示してください。
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:ss:mm");
		String nowSt = now.format(dtf);
		System.out.println(nowSt);
	}

}
