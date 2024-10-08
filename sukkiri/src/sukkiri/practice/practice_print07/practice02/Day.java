package sukkiri.practice.practice_print07.practice02;

public class Day {
	private int year;
	private int month;
	private int day;
	
	public Day(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	//ゲッターとセッター
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	public void set(int year,int month,int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	
	//表示用
	public void showCreateDate() {
		System.out.printf("口座作成日は%d年%d月%d日です。",getYear(),getMonth(),getDay());
	}
	
	
	
	

}
