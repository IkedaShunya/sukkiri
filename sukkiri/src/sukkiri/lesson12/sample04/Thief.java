package sukkiri.lesson12.sample04;

public class Thief extends Character{
	public void attack(Mantango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に7ポイントのダメージをあたえた！");
		m.hp -= 7;
	}


}
