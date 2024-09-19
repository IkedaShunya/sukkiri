package sukkiri.lesson16.practice.practice_print16.practice04;
/*
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		//		ビンゴカードを作成しましょう。
		//	　　処理手順は以下の通りになります。
		//	    1.	コレクションのSetをInteger型で宣言
		Set<Integer> set = new HashSet<Integer>(); 

		Random rand = new Random();
		//	    2.	While文を使い無限ループさせ、その中で乱数０～９９の値を繰り返し取得する。
		while(true) {
			set.add(rand.nextInt(100));
			if(set.size() == 24) {
				break;
			}
		}
		System.out.println(set);

		Iterator it = set.iterator();

		for(int i =0; i < 5; i++) {
			for(int j =0; j < 5; j++) {
				if(i ==2&&j ==2) {
					System.out.printf("%s ","☆");
				}else if(it.hasNext()) {
					System.out.printf("%2s ",it.next());
				}
				
			}
			System.out.println();
		}
		//	    初めて取得した値ならSetに格納していく。
		//	    3.	Setのサイズが24になったときに無限ループからbreakで抜ける。
		//	    4.	最後に表示処理を行う。


	}

}
*/