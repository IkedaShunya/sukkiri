package sukkiri.lesson04.code9;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] scores = {20,30,40,50,80};
		int sum =0;
		
		//.length要素数だけループさせることができる
		for(int i =0 ; i < scores.length; i++) {
			sum += scores[i];
			System.out.println(sum);
		}
		
		int avg = sum / 5;
		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + avg);
	}

}
