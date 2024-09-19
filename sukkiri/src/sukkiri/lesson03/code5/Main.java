package sukkiri.lesson03.code5;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		Random random = new Random();
		int fortune =  random.nextInt(5) + 1;

		switch (fortune) {
		//if( fortune ==1 || fortune ==2)
		case 1, 2 ->{
			System.out.println("いいね！");
		}
		case 3 ->{
			System.out.println("普通です");
		}
		case 4,5 ->{
			System.out.println("うーん...");
		}

		}

	}
}