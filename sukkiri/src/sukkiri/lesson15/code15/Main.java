package sukkiri.lesson15.code15;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
	
	public static void main(String[] args) {
		//LocalDateTimeの生成方法
		//現在日時を持つインスタンスを取得
		LocalDateTime l1 = LocalDateTime.now();
		System.out.println("l1 = " + l1);
		//2024年１月１日９時５分を指定
		LocalDateTime l2 = LocalDateTime.of(2024, 1,1,9,5,0,0);
		System.out.println("l2 = " + l2);
		
		//LocalDateTime⇔ZonedDateTimeの相互変換
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		System.out.println("z1 = " + z1);
		LocalDateTime l3 = z1.toLocalDateTime();
		System.out.println("l3 = " + l3);
		
		
		System.out.println("z1 = " + z1);
		System.out.println("l3 = " + l3);
		
		
	}

}
