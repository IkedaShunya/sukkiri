package sukkiri.lesson16.code8;

import java.util.ArrayList;
import java.util.List;

class Hero{
	public String name;
}

public class Main {
	


	public static void main(String[] args) {
		Hero h = new Hero();
		System.out.println(h.name);
		h.name = "ミナト";
		
		
		
		List<Hero> list = new ArrayList<Hero>();
		
		
		list.add(h);
		System.out.println(list.get(0).name);
		h.name ="スガワラ";
		System.out.println(list.get(0).name);

	}

}
