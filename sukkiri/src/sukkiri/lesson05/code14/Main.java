package sukkiri.lesson05.code14;
//引数でも戻り値でも配列を使える


public class Main {
	
	//int型の配列を作成して戻すメソッド
	public static int[] makeArray(int size) {
		int[] newArray = new int[size];
		for(int i = 0; i  < newArray.length; i++) {
			newArray[i] = i;
		}
		
		return newArray;
	}

	public static void main(String[] args) {
		int[] array = makeArray(3);
		
		for(int i :array) {
			System.out.println(i);
		}

	}

}
