package sukkiri.lesson04.code7;

public class Main {

	public static void main(String[] args) {
		// 配列の場合は自動的に初期化される
		int[] x = new int[5];
		System.out.println(x[0]);
		
		String s[] = new String[5];
		System.out.println(s[4]);
		
		int[] y = new int[] {4,6,7,8};
		System.out.println(y[3]);
		
		int[] z = {1,2,3,4};
		System.out.println(z[3]);

	}

}
