package sukkiri.lesson14.sample05;



public class Hero {
	String name;
	int hp;
	static int money;
	
	@Override
	public String toString() {
		return "名前：" + this.name +"/HP" +this.hp;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this ==o) {
			return true;
		}
		
		System.out.println("a");
		if(o instanceof Hero h) {
			System.out.println("b");
			if(this.name.equals(h.name)) {
				System.out.println("c");
				return true;
			}
			
			//下記でエラーが出る理由はObjectクラスのnameはないため
//			if(this.name.equals(o.name)) {
//				System.out.println("c");
//				return true;
//			}
			
		}
		
		
		System.out.println("d");
		return false;

	}
	
	public static void setRandomMoney() {
		Hero.money = (int)(Math.random() * 1000);
	}
	


}
