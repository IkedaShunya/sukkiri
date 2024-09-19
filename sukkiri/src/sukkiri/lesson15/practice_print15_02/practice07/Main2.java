package sukkiri.lesson15.practice_print15_02.practice07;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// LocalDateクラスとPeriodクラスを使用して、
		//年月日を入力し、今日との差を表示してください。
		System.out.println("年月日を入力してください（yyyy/m/d形式）：");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/M/d");
		
		LocalDate inputDate = LocalDate.parse(input, dtf);
		
		scan.close();
		LocalDate now = LocalDate.now();
		
		Period period = Period.between(now,inputDate);
		
		
		int year = period.getYears();
		int month = period.getMonths();
		int day = period.getDays();
		
		System.out.printf("本日との差：%d年%d月%d日\n",year,month,day);
		

	}

}
