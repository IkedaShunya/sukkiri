package sukkiri.lesson09.sample03;

public class Main {
//staticなし、インスタンスメソッドインスタンスを作らないと呼び出せない
	//static クラスに付随するメソッド　インタンス化せずに使える(インスタンスを付けなくてもよい)
	public static void main(String[] args) {
		
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 100;
		Wizard w =new Wizard();
		w.name = "スガワラ";
		w.hp =50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		Wizard.aaa();
		w.aaa();

	}

}
