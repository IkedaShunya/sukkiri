package sukkiri.lesson08;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "生み出しました!");
//		h.sit(5);
//		h.slip();
//		h.sit(25);
//		h.run();
//		
		Mantango m1 = new Mantango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Mantango m2 = new Mantango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		h.slip();
		m1.run();
		m2.run();
		h.run();
		
		

	}

}
