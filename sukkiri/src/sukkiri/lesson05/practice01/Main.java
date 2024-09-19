package sukkiri.lesson05.practice01;

public class Main {
	/**
	 * 戻り値：なし
	 * 引数：なし
	 * 処理：変数を初期化して、コンソールに表示
	 * 
	 */
	public static void introduceOneself() {
		String name = "湊雄輔";
		int age = 22;
		double height = 169.8;
		char zodiac = '辰';
		
		System.out.printf("私の名前は%sです。歳は%dです。身長は%.1fです。"
				+ "\n十二支は%cです。",name,age,height,zodiac);
	}
	
	public static void main(String[] args) {
		introduceOneself();
	}

}
