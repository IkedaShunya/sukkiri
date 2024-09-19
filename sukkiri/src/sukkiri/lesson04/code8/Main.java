package sukkiri.lesson04.code8;

public class Main {

	public static void main(String[] args) {
		// 配列を用いた点数管理プログラム（エラー）
		int[] scores = {20,30,40,50,80};
		int sum = scores[1] + scores[2] + scores[3] + scores[4] + scores[5];
		//int sum = scores[1] + scores[2] + scores[3] + scores[4] + scores[0];
		int avg = sum / 5;
		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + avg);

	}

}
