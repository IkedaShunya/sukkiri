package sukkiri.lesson15.code06;

public class Main {
	public static void main(String[] args) {
		String name1 ="MINATO01";
		String name2 ="M0NATO01";
		String name3 ="M0000000";
		String name4 ="m0000000";
		
		System.out.println(isValidPlayerName(name1));
		System.out.println(isValidPlayerName(name2));
		System.out.println(isValidPlayerName(name3));
		System.out.println(isValidPlayerName(name4));
		System.out.println(isValidPlayerName2(name4));
	}
	
	public static boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
	
	public static boolean isValidPlayerName2(String name) {
		return name.matches("[A-Za-z][A-Z0-9]{7}");
	}
	/*正規表現のルール
	 * ①通常の文字、その文字でなければならない
	 * パータン内に記述されたアルファベットや数字、ひらがな、かたかな、漢字のような
	 * 一般的な文字は、基本的にそれと同じ文字を表します。
	 * 例）「Java」という文字列であれば、「J」「a」「v」「a」の順でマッチ（大文字小文字文字数も一致）していることを確認
	 *Java　//true 
	 *JAVA //false
	 *JavaJava //false 
	 * 
	 * 
	 * ②ピリオド　任意の１文字であればいい
	 * 例）J.va　１文字目が「J」、２文字目はなんでもいい、３文字目は「a」４文字目は「v」となる
	 * "Java".matches("J.va") //true
	 * 
	 * 
	 * ③アスタリスク　直前の文字の０回以上の繰り返し
	 * 例）"AB*"  １文字目はA、２文字目以降は０回以上Bの繰り返し
	 * A　//true
	 * AB　//true
	 * ABBBBBBBBBBBBBB　　//true
	 * "Jaaaaaaaaava".matches("Ja*va") //true
	 * "あいうxx019".matches(".*")//true
	 * 
	 * s.matches("Ma.*") //Maで始まる任意の文字
	 * s.matches(".*ful") //fulで終わる任意の文字
	 * 
	 * 
	 * ④波カッコ　指定回数の繰り返し
	 * 例）"HEL{3｝O" = HELLLO　
	 * 
	 * ⑤角カッコ　いずれかの文字
	 * 例）"UR[LIN]" １文字目が「U」、２文字目が「R」、３文字目が「Ｌ」「Ｉ」「Ｎ」のいずれかの文字
	 * 
	 * ⑥角カッコ内のハイフン　指定範囲のいずれかの文字
	 * 例）[a-z]というパターンはa~zのいずれかの文字（つまり小文字のアルファベット）
	 * 
	 * 
	 * ⑦ハットとダラー：先頭と末尾
	 * 例）"^j.*p$"　先頭文字がjで、最後の文字がｐの任意の長さの文字列
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
