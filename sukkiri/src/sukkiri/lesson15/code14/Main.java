package sukkiri.lesson15.code14;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {
		// Instantoの取得
		//現在日時を取得
		
		Instant i1 = Instant.now();
	
		//i1 = 2024-08-26T04:42:46.189982400Z
		System.out.println("i1 = " + i1);
		
		
		//Instantとlong値と相互変換
		//インスタント型のインスタンスを作っている
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		System.out.println("i2 = " +i2);
		
		//インスタント型をLong型に変換
		long l = i2.toEpochMilli();
		
		//l = 1600705425827
		System.out.println("l = " +l);
		
		
		//ZonedDateTimeの生成
		ZonedDateTime z1 = ZonedDateTime.now();
		//z1 = 2024-08-26T13:42:46.267426600+09:00[GMT+09:00]
		System.out.println("z1 = " + z1);
		
		ZonedDateTime z2 = ZonedDateTime.of(2023, 1, 2, 3 ,4, 5, 6, ZoneId.of("Asia/Tokyo"));
		//z2 = 2023-01-02T03:04:05.000000006+09:00[Asia/Tokyo]
		System.out.println("z2 = " + z2);
		
		
		//InstantとZonedDateTimeの相互変換
		//ZonedDateTime型 z2をInstant型に変換している
		Instant i3 = z2.toInstant();
		System.out.println("i3 = " + i3);
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
		System.out.println("z3 = " + z3);
		
		//ZoneeDateTimeの利用方法
		System.out.println("東京：" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth() );
		
		System.out.println("ロンドン：" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
		
		//同じ瞬間の判定はには、equals()ではなくisEqual()を使う
		//時差を考慮して＝になっているか判断している
		if(z2.isEqual(z3)) {
			System.out.println("これらは同じ瞬間を指しています。");
		}
		
		

	}

}
