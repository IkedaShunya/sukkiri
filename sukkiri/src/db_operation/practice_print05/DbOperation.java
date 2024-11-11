package db_operation.practice_print05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbOperation {
	String url;
	String user;
	String password;
	Connection conn;


	public DbOperation() {
		this.url = "jdbc:postgresql://localhost:5432/postgres";
		this.user = "postgres";
		this.password = "postgrestest";
	}


	public void connect() {
		try{
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// SQLException の例外処理
			e.printStackTrace();
		}
	}

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
	public List<Kakeibo> select() {
		List<Kakeibo> kakeiboList = new ArrayList<>();
		String sql = "select * from 家計簿";
		
		try(PreparedStatement pstmt = conn.prepareStatement(sql);){
			ResultSet result = pstmt.executeQuery();
			// 実行結果からデータを取得
			while (result.next()) {
				// 日付、費目、メモ、入金額、出金額を取得
				Kakeibo kakeibo = new Kakeibo(result.getTimestamp("日付"), 
						result.getString("費目"),result.getString("メモ"),
						result.getInt("入金額") ,result.getInt("出金額"));
				kakeiboList.add(kakeibo);
				
			}
			

		}catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return kakeiboList;
	}


}
