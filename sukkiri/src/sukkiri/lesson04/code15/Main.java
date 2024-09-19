package sukkiri.lesson04.code15;

public class Main {

	public static void main(String[] args) {
		int[] arrayA = {1,2,3};
		int[] arrayB;
		
		//値ではなくアドレスのコピーをしている
		arrayB = arrayA;
		arrayB[0] = 100;
		System.out.println(arrayA[0]);
		
		//arrayAのアドレスが表示される
		System.out.println(arrayA);
		

	}

}
