package sukkiri.object_oriented.sample01;

public class Animal {
	//①フィールド(属性)の設定
	//＝変数の宣言
	//インスタンスフィールド　個々のインスタンスが備わっている変数
	//スタティックフィールド　
	private String name;
	private int age;
	
	
	//②コンストラクタ
	//インスタンスが生成時に実施される
	//getterではインスタンスが生成できない
	//特殊なメソッド
	//戻り値がない　voidも書かない
	//引数　を与えられる
	//フィールドに値を設定するもの
	//名前がクラス名と一緒
	public Animal(String name, int age) { //引数が 2 つのコンストラクタ
		this.name = name;
		this.age = age;
	}
	public Animal() {} //引数がないコンストラクタ
	
	
	//④その他メソッド
	//static 
	public void show() {
		System.out.println("吾輩は"+this.name+"である。");
		System.out.println(this.age+"歳である。");
	}
	
	
	//③getter, setter メソッド
	//getter フィールドをゲットする
	//setter フィールドをセットする
	//privateでフィールドが隠ぺいされる　他のクラスからアクセスできない
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
