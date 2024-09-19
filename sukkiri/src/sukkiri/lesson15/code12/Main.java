package sukkiri.lesson15.code12;
import java.util.Calendar;
import java.util.Date;


public class Main {
	public static void main(String[] args) {
		//カレンダークラスのインスタンは
		//カレンダー型の現在時刻が入っている
		Calendar c = Calendar.getInstance();
		System.out.println("c = "+ c);
		//Calendar型変数cに特定の日時を代入
		c.set(2023,8,18,5,53,20);
		System.out.println("c = "+ c);
		//月を9（１０月）に変更
		c.set(Calendar.MONTH,9);
		
		//getTime()メソッドでCalendar型の変数c の時間をDate型で返す
		Date d = c.getTime();
		System.out.println(d);
		
		//Dateインスタンスからint値を生成
		Date now = new Date();
		//Date型で現在時刻情報をカレンダー型変数ｃにセットする
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");
		
		
	}

}
