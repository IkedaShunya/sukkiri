package sukkiri.lesson02.code14;

public class Main {
	public static void main(String[] args) {
		
		String age = "31";
		
		//文字列のint型に変更する。IntegerクラスのparseIntメソッド
		int n = Integer.parseInt(age);
		System.out.println("あなたは来年" +(n + 1) + "歳になりますね。");
	}

}
