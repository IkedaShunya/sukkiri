package sukkiri.lesson12.sample02;

public class Main {
	public static void main(String[] args) {
		Wizard w = new Wizard();
		Character c = w;
		Mantango m = new Mantango();
//		w.name = "アサカ";
//		w.attack(m);
//		w.fireball(m);
		c.name = "アサカ";
		c.attack(m);
		
		//この行でエラー発生
		/*c.fireball(m);*/
	}
		
  

}
