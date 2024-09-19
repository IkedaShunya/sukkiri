package sukkiri.lesson05.code09;

public class Main {
	
	public static int sample() {
		return 1;
		
		/*return文は値を戻すだけではなく、メソッドの終了も行うため、
		return文の後の処理（下記）はエラーになる。*/
		
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			到達不能コード*/
	//	int x = 10;
	}

	public static void main(String[] args) {
		
		sample();

	}

}
