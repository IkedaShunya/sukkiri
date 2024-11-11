package sukkiri.lesson14.sample04;

public class Hero {
	String name;
	int hp;
	static int money;
	
	@Override
	public String toString() {
		return "名前：" + this.name +"/HP" +this.hp;
	}
	
	public boolean equals(Object o) {
		if(this ==o) {
			return true;
		}
		if(o instanceof Hero h) {
			return true;
		}
		return false;

	}
	


}
