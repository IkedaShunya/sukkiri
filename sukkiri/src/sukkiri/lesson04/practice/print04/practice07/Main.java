package sukkiri.lesson04.practice.print04.practice07;

public class Main {
	
	public static void main(String[] args) {
		/* 下記値を要素の値として持つ配列scoresを作り、
		最大値と最小値を取得し表示しましょう。
	     ループ条件にはlengthを利用すること。*/
		
		int[] scores = {25,94,89,10,3,14,11,67};
		
		int min = scores[0];
		int max = scores[0];
		
		//最小値、最大値であれば、変数に代入するループ
		for(int i=0; i <scores.length; i++) {
			if(min > scores[i]) {
				min =scores[i];
				
			}else if(max < scores[i]) {
				max = scores[i];
			}
		}
		
		System.out.println("最大値："+ min);
		System.out.println("最小値："+ max);

	}
}
