package sukkiri.lesson16.practice03;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Hero saito = new Hero("saito",3);
		Hero suzuki = new Hero("suzuki",7);
		
		List<Hero> list = new ArrayList<Hero>();
		
		list.add(saito);
		list.add(suzuki);
		
		for(Hero hero :list) {
			System.out.println(hero.getName()+"が倒した敵＝" +hero.getEnemyNum());
		}

	}

}
