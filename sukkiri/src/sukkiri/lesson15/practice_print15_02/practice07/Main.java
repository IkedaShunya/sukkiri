package sukkiri.lesson15.practice_print15_02.practice07;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*LocalDateクラスとPeriodクラスを使用して、
		年月日を入力し、今日との差を表示してください。*/

		//入力を指示
		System.out.println("年月日を入力してください（yyyy/m/d形式）：");
		Scanner scan = new Scanner(System.in);
		String dayString = scan.nextLine(); 
		scan.close();

		//入力された文字の書式を設定
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy/M/d");
		//入力された文字をLocalDateクラスに変換
		LocalDate lDayDate = LocalDate.parse(dayString,dft);

		//現時点の日付情報を取得		
		LocalDate now = LocalDate.now();
		System.out.println(now);


		//Periodクラスで差を取得
		Period  p1 = Period.between(lDayDate,now);

		
		//Periodクラスで差をint型で取得
		
		int year = p1.getYears();
		int month = p1.getMonths();
		int day = p1.getDays();

		System.out.printf("今日との差：%d年%dか月%d日",year,month,day);

	}

}
