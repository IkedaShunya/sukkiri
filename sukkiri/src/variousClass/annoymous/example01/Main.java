package variousClass.annoymous.example01;

interface Calculator {
	int calculate(int a, int b);
}
public class Main {
	public static void main(String[] args) {
		// Calculator インタフェースを実装した匿名クラスのインスタンスを生成
		//インターフェイスの抽象メソッドの実装かつインスタンス化が実装されている
		Calculator addition = new Calculator() {
			@Override
			public int calculate(int a, int b) {
				return a + b;
			}
		};
		// 匿名クラスを使用して計算を実行し、表示
		int result = addition.calculate(10, 5);
		System.out.println("Addition result : " + result);
	}
}