package sukkiri.lesson15.code16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	
	public static void main(String[] args) {
		//LocalDateTimeの生成方法
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		//Date型の場合は、＝の後は書式の変数名だが、LocalDate型はLocalDateの後で第二引数で書式を書く
		LocalDate ldate = LocalDate.parse("2020/09/22" ,fmt);
		System.out.println(ldate);
		
		//1000日後を計算する
		LocalDate ldatep = ldate.plusDays(1000);
		
		//SimpleDateFormatの場合はfmt.format(引数：データ型の日付)になる
		//LocalDateの場合はldatep.format(fmt)
		String str = ldatep.format(fmt);
		System.out.println("1000日後は" + str);
		
		
		//現在日時との比較
		LocalDate now = LocalDate.now();
		System.out.println();
		if(now.isAfter(ldatep)) {
			System.out.println("本日は、その日より未来です。");
		}
	}

}
