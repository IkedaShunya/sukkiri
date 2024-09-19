package sukkiri.lesson05.code13;

public class Main {

	// int型配列を受け取り、
	//配列内の要素すべてに1を加えるメソッド
	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}



	public static void main(String[] args) {
		int[] array = { 1, 2, 3};
		
		//incArrayメソッド実行前の配列arrayの中身（1,2,3）
		for (int i : array) {
			System.out.println(i);
		}
		
		incArray(array);
		
		
		//incArrayメソッド実行後の配列arrayの中身（2,3,4）
		for (int i : array) {
			System.out.println(i);
		}
	}

}
