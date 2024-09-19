package sukkiri.lesson15.code10;

//メリット：コンピュータにとっては扱いやすい
//デメリット：人間が読むことができない

public class Main {

	public static void main(String[] args) {
		//currentTimeMillis()メソッド　現在日時をlong型で表す
		long start = System.currentTimeMillis();
		
		
		
		System.out.println(start);
		StringBuilder sb = new StringBuilder();
		for(int i =0; i < 10000; i++) {
			sb.append("");
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end);
		
		
		
		
		System.out.println("処理にかかった時間は…" + (end - start) + "ミリ秒でした。");

	}

}
