package sukkiri.lesson04.practice.print04.practice03;

public class Main {

	public static void main(String[] args) {
		/*配列namesの各要素を下記の値で初期化し、
		ループ文を使用して順番に表示しましょう。
		配列の要素数の取得のlengthを利用すること。*/
		
		String[] names = {"のび太","すねお","ジャイアン","しずかちゃん","出木杉君"};
		
		for(int i =0; i <names.length; i++ ) {
			System.out.println("names[ " + i +" ] :" +names[i] );
		}
 
	}

}
