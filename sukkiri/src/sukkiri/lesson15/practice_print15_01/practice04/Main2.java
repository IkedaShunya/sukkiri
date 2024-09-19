package sukkiri.lesson15.practice_print15_01.practice04;

public class Main2 {
	/*下の方法で定義されたString型変数sに対し 1) ~ 5) の内容を実行するプログラムを作成してください。
	 * String s = " Let it go. " ;  // 「空白Let空白it空白go.空白」になっている
	 * 1)  s の先頭と末尾の空白文字の塊を取り除いたものを表示する。
	 * 2)  s に「t」の文字が何個存在しているか数を表示する。
	 * 3)  s に含まれる単語を取り出して、String 型配列に格納し、要素数を表示する。
	 * 4)  StringBuilder を使って、3)の配列の中の単語を連結し、表示する
	 */
	public static void main(String[] args) {
		String s = " Let it go. " ;
		String s2 = s.trim();
		System.out.println(s);
		System.out.println(s2);
		
		String[] s2Array = s2.split("");
		int count =0;
		for(String str : s2Array) {
			if(str.contains("t")) {
				count++;
			}
		}
		System.out.println(count);
		
		String[] sArray = s.split("");
		for(String a :sArray) {
			System.out.println(a);
		}
		System.out.println(sArray.length);
		
		StringBuilder sb = new StringBuilder();
		
		for(String str :sArray) {
			sb.append(str);
		}

		System.out.println(sb);


	}
	
}
