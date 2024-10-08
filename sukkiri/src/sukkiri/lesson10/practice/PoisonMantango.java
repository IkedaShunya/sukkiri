package sukkiri.lesson10.practice;

public class PoisonMantango extends Mantango{

	int poisonMp= 5;
	
	public PoisonMantango(char suffix) {
		super(suffix);
	}
	@Override
	public void attack(Hero h) {
		super.attack(h);
		if(poisonMp== 0) {
			System.out.println("さらに毒の胞子をまいた");
			int  damage = h.hp /5;
			h.hp -= damage;
			System.out.println(damage + "ポイントのダメージ");
			this.poisonMp --;
		}
		
	}

}
