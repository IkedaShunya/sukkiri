package sukkiri.lesson15.practice_print15_02.practice06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		/*LocalDateTimeクラスを使用して現在の日時を
		 実行結果の形式で表示してください。
		 */
		
		//LocalDateTime型の現在の日時を取得
		LocalDateTime now = LocalDateTime.now();
		
		//書式の設定
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy年MM月dd日（E）HH時mm分ss秒");
		//上で決めた書式でString型に変換
		String nowString = now.format(fmt);
		
		System.out.println(nowString);
	}

}
