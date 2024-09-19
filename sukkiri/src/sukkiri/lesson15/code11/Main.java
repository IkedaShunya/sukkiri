package sukkiri.lesson15.code11;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//現在の日時を取得
		Date now = new Date();
		
		System.out.println(now);
		//Long型で取得
		System.out.println(now.getTime());
		
		//現在日時を取得するのは簡単だがある特定の日時情報の取得するのは難しい
		
		Date past = new Date(1694984000000L);
		System.out.println(past);
		
		
		
		
	}

}
