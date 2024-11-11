package db_operation.sample02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DbOperation {

	// 接続文字列の設定
	// DB の URL
	String url = "jdbc:postgresql://localhost:5432/postgres";
	// DB のユーザー名
	String user;
	// DB のパスワード
	String password;
	//日付の型フォーマットの設定(家計簿テーブルに日付があるため)
	SimpleDateFormat df;
	// SQL 文の作成
	String sql;
	Connection conn;


	public DbOperation() {
		url = "jdbc:postgresql://localhost:5432/postgres";
		user = "postgres";
		password = "postgrestest";
		df = new SimpleDateFormat("yyyy-MM-dd");
		sql = "select * from 家計簿";
	}

	//	connectメソッド
	//	：戻り値、引数なしで、フィールド変数connに値を代入する
	//	※例外処理が必要
	public void connect() {

		try{
			conn = DriverManager.getConnection(url, user, password);


		} catch (SQLException e) {
			// SQLException の例外処理
			e.printStackTrace();

		}

	}

	//	：戻り値、引数なしで、フィールド変数connがnullでないなら
	//	connのcloseメソッドを呼び出す
	//	※例外処理が必要

	public void disconnect() {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
	
	
	//selectメソッド
	public void select() {
		try(PreparedStatement pstmt = conn.prepareStatement(sql);){
			ResultSet result = pstmt.executeQuery();
			// 実行結果からデータを取得
			while (result.next()) {
				// 日付、費目、メモ、入金額、出金額を取得
				Date colDate = result.getTimestamp("日付");
				String colItem = result.getString("費目");
				String colMemo = result.getString("メモ");
				int colDeposit = result.getInt("入金額");
				int colWithdrawal = result.getInt("出金額");
				// 表示
				System.out.println("======================");
				System.out.println("日付　：" + df.format(colDate));
				System.out.println("費目　：" + colItem);
				System.out.println("メモ　：" + colMemo);
				System.out.println("入金額：" + colDeposit);
				System.out.println("出金額：" + colWithdrawal);
			}

		}catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}




	}
}
