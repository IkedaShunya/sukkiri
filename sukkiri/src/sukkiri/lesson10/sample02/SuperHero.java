package sukkiri.lesson10.sample02;

//基本はHeroクラスと同じ
public class SuperHero extends Hero{
	boolean flying;
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
