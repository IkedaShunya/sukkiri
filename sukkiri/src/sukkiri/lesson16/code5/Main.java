package sukkiri.lesson16.code5;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		words.add("Dog");
		words.add("あ");
		words.add("1");




		//自然順序(辞書順)付けで表示
		for(String s: words) {
			System.out.println(s);
		}

		Set<String> words2 = new LinkedHashSet<String>();
		words2.add("dog");
		words2.add("cat");
		words2.add("wolf");
		words2.add("panda");


		//値を格納した順で表示
		for(String s: words2) {
			System.out.println(s);
		}

	}

}
