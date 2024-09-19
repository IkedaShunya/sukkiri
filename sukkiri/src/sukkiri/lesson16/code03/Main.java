package sukkiri.lesson16.code03;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		
		//重複しているため、追加されない
		colors.add("赤");
		
		System.out.println(colors);
		System.out.println(colors.size());
	}

}
