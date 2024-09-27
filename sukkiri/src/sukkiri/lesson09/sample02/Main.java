package sukkiri.lesson09.sample02;

public class Main {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name ="炎の件";
		s.damage = 10;
		
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		
		//swordフィールドに生成済みの剣インスタンスを代入
		h.sword = s;
		System.out.println("現在の武器は" + h.sword.name);

//		s.name ="炎の件";
//		s.damage = 10;
	}

}
