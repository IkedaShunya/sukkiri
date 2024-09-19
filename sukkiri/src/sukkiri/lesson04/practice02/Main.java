package sukkiri.lesson04.practice02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//配列moneyListの宣言
		int[] moneyList = {121902, 8302, 55100};
		
		//moneyListの取り出し（for文）
		for(int i = 0; i > moneyList.length;  ) {
			System.out.println(moneyList[i]);
		}
		

		
		//moneyListの取り出し（拡張for文
		for(int numbers:moneyList) {
			System.out.println(numbers);
		}

	}

}
