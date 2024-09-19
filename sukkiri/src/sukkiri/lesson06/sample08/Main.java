package sukkiri.lesson06.sample08;

public class Main {

	public static void main(String[] args) {
		int[] heights = {172,149,152,191,155};
		
		//java.util（標準パッケージ）からArraysクラスのsortメソッドを使っている。
		
		
		java.util.Arrays.sort(heights);
		for(int h : heights) {
			System.out.println(h);
		}

	}

}
