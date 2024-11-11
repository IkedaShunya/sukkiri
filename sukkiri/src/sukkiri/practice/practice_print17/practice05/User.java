package sukkiri.practice.practice_print17.practice05;

public class User {
//	フィールド：id、name
	private int  id;
	private String name;
	
	
	
	
public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//コンストラクタ：id(int)、name（String）を引数に持つコンストラクタ
	//コンストラクタでid、nameに値を設定する場合、以下の条件の時には
	//IllegalArgumentExceptionをスローするようにしてください。
	//idが負の場合、「idが負の数です。」を表示
	//nameがnullまたは空の場合、「nameがnullまたは空です。」を表示
	public User(int id, String name) {
		if(id < 0) {
			throw new IllegalArgumentException("idが負の数です");
		}
		if(name.isEmpty() || name ==null) {
			throw new NullPointerException("nameがnullまたは空です。");
		}
		this.id = id;
		this.name = name;
	}
	
	//メソッド：toStringのオーバーライド（idとnameを文字列で返す）
	@Override
	public String toString() {
		return getId() +": " + getName();
	}
	

	
}
