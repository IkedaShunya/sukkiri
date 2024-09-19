package sukkiri.lesson15.practice_print15_01.practice03;

public class Main2 {
	/*「にほんむかしばなし」という文字列を前から７番目に
	 * ある文字を切り出して表示しましょう。
     *また、「むかし」の文字列だけを切り出して表示するプログラムを書きましょう。
	 */
	public static void main(String[] args) {
		String str = "にほんむかしばなし";
		//charAt(int i) i-1番目のメソッドを切り出す
		char str2 = str.charAt(6);
		System.out.println(str2);
		
		//subString(int i) もしくは　（int i, int j）
		//i番目から最後までもくは　i-1番目からj-2番目まできりとり
		System.out.println(str.substring(3,6));

	}

}
