package sukkiri.lesson02.practice.practice_print01.practice12;

public class Main {

	public static void main(String[] args) {
		/*上底xが2cm、下底yが3cm、高さhが4cmの台形の面積をコンソール画面に表示しましょう。
		変数はint型を使用して下さい。*/
		int x = 2;
		int y = 3;
		int h = 4;
		
		//面積
		int area = (x + y) * h / 2;
		
		System.out.printf("面積＝ %dcm^2\n",area);

	}

}
