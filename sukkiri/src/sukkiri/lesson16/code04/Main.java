package sukkiri.lesson16.code04;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		
		//順番が保証されない
		for(String color : colors) {
			System.out.println(color);
		}
	}

}
