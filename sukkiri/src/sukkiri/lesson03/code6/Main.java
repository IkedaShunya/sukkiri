package sukkiri.lesson03.code6;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		Random random = new Random();
		int fortune = random.nextInt(5) + 1;

		switch(fortune) {

		case 1,2:
			System.out.println("いいね!");
		break;

		case 3:
			System.out.println("普通です");
			break;

		case 4,5:
			System.out.println("うーん...");

		}
	}

}
