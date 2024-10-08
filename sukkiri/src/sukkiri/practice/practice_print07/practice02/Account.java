package sukkiri.practice.practice_print07.practice02;

public class Account {
	private String name;
	private String num;
	private int balance;
	private Day day;
	
	public Account(String name,String num,int balance,int year,int month,int day) {
		this.name =name;
		this.num = num;
		this.balance = balance;
		this.day = new Day(year,month,day);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(int year,int month,int day) {
		this.day.setYear(year);
		this.day.setMonth(month);
		this.day.setDay(day);
	}
	
	
	//balanceに引数で受け取った値を加算する。
	public void deposit(int deposit) {
		this.balance += deposit;
	}
	
	//balanceに引数で受け取った値を加算する。
		public void withdraw(int withdraw) {
			this.balance -= withdraw;
		}
		
	
	public void showAccount() {
		System.out.println("口座名義：" + name);
		System.out.println("口座番号：" + num);
		System.out.println("預金額：" + balance);
		day.showCreateDate();
	}
	
	

}
