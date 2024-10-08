package sukkiri.lesson11.sample01;

public class Dancer extends Character{
	
	public void dance() {
		System.out.println(this.name + "は情熱敵に踊った");
	}
	
	public void attack(Mantango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
	}

}
