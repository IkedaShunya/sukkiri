package sukkiri.object_oriented.inheritance.sample01;

//①extends
//複数クラスを継承できない
class Dog extends Animal { 
	//コンストラクタ ②コンストラクタ(super(引数リスト))
	//親クラスのコンストラクタがあれば、絶対super()で呼び出す必要がる
	public Dog(String name) { super(name); }
	//差分フィールド ③差分メンバ
	private int age;
	//差分メソッド(showAge(), getter, setter) ③差分メンバ
	public void showAge() { System.out.println(this.age+"歳"); }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	//親クラスの run メソッドをオーバーライド ④オーバーライド
	//オーバーライド（再定義）の宣言をしないと、できていないときにエラーが発生しなくなってしまう
	//例えば引数をつけわたりしてもエラーができなくなってしまう
	@Override
	public void run() { System.out.println(getName()+"は走りました"); }
}