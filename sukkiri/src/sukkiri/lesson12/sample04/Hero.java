package sukkiri.lesson12.sample04;

public class Hero extends Character{
	public void attack(Mantango m) {
	    System.out.println(this.name + "の攻撃！");
	    System.out.println("敵に10ポイントのダメージをあたえた！");
	    m.hp -= 10;
	  }


}
