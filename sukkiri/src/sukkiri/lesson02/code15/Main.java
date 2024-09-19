package sukkiri.lesson02.code15;

public class Main {
	public static void main(String[] args) {
		
		//newするとインスタンスを作ることができる
		//インスタンスを代入することがことができる
		//インスタンス化し、その変数を使いまわす。
		
		//「ctrl +shiht + o」でインポートできる
		//Random rand = new Random(); //②インスタンス化し、変数randに代入 
		//int rr = rand.nextInt(90) ;//③インスタンス変数を使い、nextInt()メソッド使用
		//int rrr = rand.nextInt(200);//複数回使いたい場合は②、③を使う
		
		
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたはたぶん" + r +"歳ですね。");
		
		
	}

}
