package db_operation.practice_print06;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class Main {
	//	formatterメソッド(staticメソッド)
	//	：引数は文字列を受け取り、java.util.Date型を返す
	//	受け取った文字列を「yyyy-MM-dd」の書式のjava.util.Date型に変換する
	//	変換する際、例外処理が必要であり、変換成功時は成功したものを返し、失敗時は現在日時のjava.util.Date型を返す

	static Date formatter(String strDate) throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse(strDate);

		return date;
	}

	public static void main(String[] args) throws ParseException {
//		：DbOperationインスタンス、Kakeibo型ArrayListインスタンス、Scannerインスタンスを生成する。
//		出力結果例のように入力を受け取り、それらをKakeiboコンストラクタに渡し、Kakeiboインスタンスを生成する。
		DbOperation dbOperation = new DbOperation();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("日付");
		String strDate = scan.nextLine();
		Date date = formatter(strDate);
		System.out.print("費目");
		String colItem = scan.nextLine();
		System.out.print("メモ");
		String colMemo = scan.nextLine();
		System.out.print("入金額");
		int colDeposit = Integer.parseInt(scan.nextLine());
		System.out.print("入出金額");
		int colWithdrawal = Integer.parseInt(scan.nextLine());
		
		
		Kakeibo kakeibo = new Kakeibo(date,colItem,colMemo,colDeposit,colWithdrawal);
		
		dbOperation.connect();
		int count = dbOperation.insert(kakeibo);
		if(count ==0) {
			System.out.println("追加できませんでした");
		}else if(count ==1) {
			System.out.println("追加しました");
		}
		dbOperation.disconnect();
		dbOperation.connect();
		List<Kakeibo> kakeiboList = dbOperation.select();
		
		for(Kakeibo kakeiboo : kakeiboList) {
			System.out.println("======================");
			kakeiboo.show();
		}
		
		
		dbOperation.disconnect();
	
		


	}

}
