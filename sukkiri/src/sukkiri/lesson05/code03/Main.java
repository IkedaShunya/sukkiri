package sukkiri.lesson05.code03;

public class Main {

	//呼び出し用メソッドA
	public static void methodA() {
		System.out.println("methodA");
		methodB();
		//mainメソッドに戻る
	}

	//呼び出し用メソッドA
	public static void methodB() {
		System.out.println("methodB");
		//methodA（）に戻る
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		methodA();

	}

}
