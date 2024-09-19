package sukkiri.lesson15.practice05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		//現在の日付をDate型で取得する。
		
		LocalDate now = LocalDate.now();
		
		
		//取得した値に100を足す
		//immutable(不変性)なものは新しい変数に置き換える必要がある。（）
		LocalDate future = now.plusDays(100);
		
		
		
		//DateTimeFormatterを用いて、指定された形式でDateインスタンスの内容を表示する
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String pulsDayStr = f.format(future);
		System.out.println(future);
		System.out.println(pulsDayStr);
		
		
		
	}

}
