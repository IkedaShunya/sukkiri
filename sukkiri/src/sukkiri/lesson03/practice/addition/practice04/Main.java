package sukkiri.lesson03.practice.addition.practice04;

public class Main {
	public static void main(String[] args) {
		//while文とif文を使い、１～１００までのうち３の倍数の値を
		//表示させるプログラムを作成しましょう。
		int count = 1;
		
		while(count <= 100) {
			if(count % 3 ==0) {
				System.out.println(count);
			}
			count++;
		}
		
		
		
	}

}
