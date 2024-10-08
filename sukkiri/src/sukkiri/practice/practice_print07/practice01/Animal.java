package sukkiri.practice.practice_print07.practice01;

public class Animal {
	//フィールド
	private String kind;
	private String name; 
	private String cry;
	private int age;
	
	//コンストラクタ
	public Animal() {
		
	}
	public Animal(String kind,String name,int age,String cry) {
		this.kind = kind;
		this.name= name;
		this.cry = cry;
		this.age = age;
	}
	
	//セッター
	public void setKind(String kind) {
		this.kind = kind;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCry(String cry) {
		this.cry = cry;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//表示メソッド
	public void show() {
		System.out.println(this.name+ "は" + this.kind +"で、年齢は" + 
				this.age +"歳、鳴き声は" +this.cry);
	}

	

}
