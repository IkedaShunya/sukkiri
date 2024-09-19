package sukkiri.lesson15.code04;

public class Main {
	
	public static void main(String[] args) {
		String a ="abc";
		
		System.out.println(a.replace("a","A"));
		//Stringメソッドは不変のため変数aは上で置き換わらない（置き換え処理は発生する）
		System.out.println(a);
		
		
		
		
		StringBuilder sb = new StringBuilder();
		
		//append(String s) メソッド　sをバッファに追加し連携させる
		//="Java"を10000回バッファ追加し連携させる
		for (int i=0; i < 10000; i++) {
			sb.append("Java");
		}
		
		//toString()　String型に変換
		String s =sb.toString();
		
		System.out.println(s);
	}
	
	

}
