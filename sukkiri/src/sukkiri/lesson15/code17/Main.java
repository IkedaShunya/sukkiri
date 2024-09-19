package sukkiri.lesson15.code17;

import java.time.LocalDate;
import java.time.Period;

public class Main {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2023,1,1);
		LocalDate d2 = LocalDate.of(2023,1,4);
		System.out.println(d1);
		System.out.println(d2);
		
		
		//3日間を表すPeriodを２通りの方法で生成
		Period p1 = Period.ofDays(3);
		Period p2 = Period.between(d1,d2);
		System.out.println(p1);
		System.out.println(p2);
		
		
		//d2のさらに３日後を計算する
		LocalDate d3 = d2.plus(p2);
		
		//timeAPIはimmutable（不変）のためもとが変化しない
		System.out.println("d2:" + d2);
		System.out.println(d3);
		
	}

}
