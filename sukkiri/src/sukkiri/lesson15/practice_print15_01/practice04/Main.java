package sukkiri.lesson15.practice_print15_01.practice04;

public class Main {
	/*下の方法で定義されたString型変数sに対し 1) ~ 5) の内容を実行するプログラムを作成してください。
	 * String s = " Let it go. " ;  // 「空白Let空白it空白go.空白」になっている
	 * 1)  s の先頭と末尾の空白文字の塊を取り除いたものを表示する。
	 * 2)  s に「t」の文字が何個存在しているか数を表示する。
	 * 3)  s に含まれる単語を取り出して、String 型配列に格納し、要素数を表示する。
	 * 4)  StringBuilder を使って、3)の配列の中の単語を連結し、表示する
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// 「空白Let空白it空白go.空白」になっている
		// 1)  s の先頭と末尾の空白文字の塊を取り除いたものを表示する。
		String s = " Let it go. " ; 
		String b ="　Let it go.　" ; 
		
		String sTrim = s.trim();
		
		System.out.println(sTrim);
		//全角スペースは取り除けない
		System.out.println(b.trim());
		
		
		//2)  s に「t」の文字が何個存在しているか数を表示する。
		
		String[] array = sTrim.split(" ");
		System.out.println(sTrim.length());
		
		int count = 0;
		for(int i= 1; i <array.length ;i++) {
//			if(array[i].equals("t")) {
//				count++;
//			}
			
			char a = sTrim.charAt(i);
			if(a == 't') {
				count++;
			}
		}
		System.out.println("tが入っているのは"+count +"個");
		
		
		//s に含まれる単語を取り出して、String 型配列に格納し、要素数を表示する。
		System.out.println(array.length + "個");
		
		//StringBuilder を使って、3)の配列の中の単語を連結し、表示する
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < array.length; i++) {
			sb.append(array[i]);
		}
		
		String conect = sb.toString();
		
		System.out.println(conect);
		
		String a = "abcde";
		System.out.println(a.substring(1,3));
		
		int[] n = {1,2,3};
		String i =String.valueOf(n);
		System.out.println(i);
	}

}
