package sukkiri.lesson15.practice_print15_01.practice03;

public class Main {
	/*「にほんむかしばなし」という文字列を前から７番目に
	 * ある文字を切り出して表示しましょう。
     *また、「むかし」の文字列だけを切り出して表示するプログラムを書きましょう。
	 * 
	 * 
	 */
	public static void main(String[] args) {
		String str = "にほんむかしばなし";
		System.out.println(str.charAt(6));
		
		System.out.println(str.substring(3,6));

	}

}
