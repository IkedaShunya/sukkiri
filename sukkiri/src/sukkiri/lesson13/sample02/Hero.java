package sukkiri.lesson13.sample02;

public class Hero {
	//同じクラスでしか呼び出しできない
	private int hp;
	private String name;
	
	//Heroクラス：コード13-10を追記・・・setterの追加
	public void setName(String name) {
		this.name = name;
	}
	//Heroクラス：コード13-8を追記・・・getterの追加
	public String getName() {
		return name;
	}

	private Sword sword;

	public void bye() {
		System.out.println("勇者は別れを告げた");
	}
	//他クラスからは参照できず、attack（）で呼び出される
	private void die() {
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME OVERです。");
	}
	//他のパッケージからの呼び出しはできない
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した！");
	}
	
	//いろいろなクラスから呼び出される場合はpublicになる
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		/* … */
		System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
		this.hp -= 2;
		if (this.hp <= 0 ) {
			this.die();
		}
	}
	
	
}
