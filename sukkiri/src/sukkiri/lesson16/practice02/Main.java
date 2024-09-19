package sukkiri.lesson16.practice02;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Hero saito = new Hero("saito");
		Hero suzuki = new Hero("suzuki");
		
		List<Hero> list = new ArrayList<Hero>();
		
		list.add(saito);
		list.add(suzuki);
		
		for(Hero hero :list) {
			System.out.println(hero.getName());
		}

	}

}
