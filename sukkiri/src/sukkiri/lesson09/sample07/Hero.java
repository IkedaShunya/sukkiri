package sukkiri.lesson09.sample07;

public class Hero {
	//属性の定義
	String name;
	int hp;
	Sword sword;
	
	
	//コンストラクタ初期値に設定
	public Hero(String name) {
		this.hp =100;
		this.name = name;
	}
	
	//引数なしのコンストラクタ オーバーロード
	public Hero() {
		this.hp = 100;
		this.name = "ダミー";
	}
	
	
	//操作の定義
	public void attack() {
		System.out.println(this.name + "は攻撃した!");
	}
	
	public void sleep() {
		
		this.hp =100;
		System.out.println(this.name +"は、眠って回復した！");
	}
	
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" +sec +"秒座った！");
		System.out.println(this.name + "は、" + sec +"ポイント回復した");
		
	}
	
	public void slip() {
		this.hp -=5;
		System.out.println(this.name +"は、転んだ！" );
		System.out.println("5のダメージ！");
		
	}
	
	public void run() {
		System.out.println(this.name +"は逃げ出した!");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
	


}
