package sukkiri.lesson10.sample04;

//基本はHeroクラスと同じ
public class SuperHero extends Hero{
	boolean flying;
	
	public SuperHero() {
		System.out.println("SuperHeroのコンストラクタが動作");
	}
	
	public void attack(Mantango m) {
		//親インスタンスの呼び出し
		super.attack(m);
		if(this.flying) {
			super.attack(m);
			
		}
	}
	
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}

	public void land() {
		this.flying =false;
		System.out.println("着地した！");
	}

	//再定義
	@Override
	public void run() {
		System.out.println(this.name + "は撤退した");
	}
	


}
