package sukkiri.lesson04.code12;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] seq = new int[10];
		
		Random random = new Random();
		
		
		//塩基配列をランダムに生成
		for(int i = 0; i < seq.length; i++) {
			seq[i] = random.nextInt(4);
			System.out.println("seq[" +i + "]は"+ seq[i] +"です。");
		}
		
		//生成した塩基配列の記号を表示
		for (int i = 0; i < seq.length; i++) {
			switch(seq[i]) {
				case 0 -> {
					System.out.print("A ");
				}
				case 1 -> {
					System.out.print("T ");
				}
				case 2 -> {
					System.out.print("G ");
				}
				case 3 -> {
					System.out.print("C ");
				}
			}
		}
		
		// TODO 自動生成されたメソッド・スタブ

	}

}
