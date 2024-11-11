package db_operation.practice_print08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Kakeibo {
	Date colDate;
	String colItem;
	String colMemo;
	int colDeposit;
	int colWithdrawal;
	
	
	public Kakeibo(Date colDate,String colItem,String colMemo,int colDeposit,int colWithdrawal) {
		setColDate(colDate);
		this.colItem =colItem;
		this.colMemo =colMemo;
		this.colDeposit =colDeposit;
		this.colWithdrawal =colWithdrawal;
	}
	
	public String formatter(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(date);
	}
	
	public void show() {
		System.out.println("日付　：" +formatter(getColDate()) );
		System.out.println("費目　：" +getColItem() );
		System.out.println("メモ　：" +getColMemo());
		System.out.println("入金額：" +getColDeposit() );
		System.out.println("出金額：" +getColWithdrawal() );
		
	}

	public Date getColDate() {
		return colDate;
	}

	public void setColDate(Date colDate) {
		this.colDate = colDate;
	}

	public String getColItem() {
		return colItem;
	}

	public void setColItem(String colItem) {
		this.colItem = colItem;
	}

	public String getColMemo() {
		return colMemo;
	}

	public void setColMemo(String colMemo) {
		this.colMemo = colMemo;
	}

	public int getColDeposit() {
		return colDeposit;
	}

	public void setColDeposit(int colDeposit) {
		this.colDeposit = colDeposit;
	}

	public int getColWithdrawal() {
		return colWithdrawal;
	}

	public void setColWithdrawal(int colWithdrawal) {
		this.colWithdrawal = colWithdrawal;
	}
	
	

}
