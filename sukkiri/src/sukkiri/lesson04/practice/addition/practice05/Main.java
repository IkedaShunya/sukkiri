package sukkiri.lesson04.practice.addition.practice05;

public class Main {

	public static void main(String[] args) {
		//次の条件のとき、10秒後に頂点Aにいる確率を求めるコードを配列、for文を用いて作成しましょう。
		// [条件]
		//		・四面体ABCDの頂点を移動する点がある
		//		・1秒ごとに隣り合う頂点へ1/3の確率で移動する
		//		・n秒後に点が頂点Aにいる確率を Pn とする
		//		・はじめ（0秒）のときには点は頂点A (P0=1)


		int n = 10; // 時刻n秒後
		double[] probA = new double[n + 1]; // 頂点Aにいる確率の配列
		double[] probB = new double[n + 1]; // 頂点Bにいる確率の配列
		double[] probC = new double[n + 1]; // 頂点Cにいる確率の配列
		double[] probD = new double[n + 1]; // 頂点Dにいる確率の配列

		// 初期条件: 0秒後は点が必ずAにいる
		probA[0] = 1.0;
		probB[0] = 0.0;
		probC[0] = 0.0;
		probD[0] = 0.0;

		// 1秒ごとに各頂点にいる確率を更新
		for (int t = 1; t <= n; t++) {
			// 時刻tにおける頂点A, B, C, Dの確率を計算
			double nextA = (probB[t-1] + probD[t-1]) / 3;
			double nextB = (probA[t-1] + probC[t-1]) / 3;
			double nextC = (probB[t-1] + probD[t-1]) / 3;
			double nextD = (probA[t-1] + probC[t-1]) / 3;

			// 現在の確率を更新
			probA[t] = nextA;
			probB[t] = nextB;
			probC[t] = nextC;
			probD[t] = nextD;
		}

		// 10秒後の頂点Aにいる確率を表示
		System.out.println("10秒後に頂点Aにいる確率: " + probA[10]);
	}





}
