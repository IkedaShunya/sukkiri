package sukkiri.lesson10.practice;


public class Mantango {
	int hp =50;
	char suffix;
	
	public Mantango(char suffix) {
		this.suffix = suffix;
	}
	
	public void attack(Hero h) {
		System.out.println("キノコ" +this.suffix +"の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}
}
