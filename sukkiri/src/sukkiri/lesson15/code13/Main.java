package sukkiri.lesson15.code13;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws  Exception{
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/DD HH:mm:ss") ;
		
		//文字列からDateインスタンスを作成
		//書式が合わない（yyyy/MM/DD HH:mm:ss）場合はエラーが発生Exceptionに投げる
		Date d = f.parse("2023/09/18 05:53:00");
		System.out.println(d);
		
		
		//Dateインスタンスから文字列生成
		Date now = new Date();
		String s = f.format(now);
		System.out.println("現在は" + s +"です。");
		
		
		
	}

}
