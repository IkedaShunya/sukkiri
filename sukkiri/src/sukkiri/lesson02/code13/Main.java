package sukkiri.lesson02.code13;

public class Main {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 3;
		
		//２つの値（a,b）を比較して大きい方法あたいをmに代入
		//MathクラスはJavalangはJREシステムライブラリー（JREシステムライブラリーの中のjava.langにある）
		int m = Math.max(a, b);
		int n = Math.min(a, b);
		
		
		System.out.println("比較実験：" + 
		a + "と" + b + "とで大きいほうは…" + m 
		+"小さい方法は…" + n);
	}

}
