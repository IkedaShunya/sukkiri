package sukkiri.lesson10.sample03;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.run();
		SuperHero sh = new SuperHero();
		sh.run();
		sh.slip();
		
		Mantango m = new Mantango();
		sh.fly();
		sh.attack(m);

	}

}
