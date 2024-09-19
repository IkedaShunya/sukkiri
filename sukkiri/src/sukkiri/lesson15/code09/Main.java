package sukkiri.lesson15.code09;

public class Main {
	public static void main(String args[]) {
		Hero hero = new Hero();
		hero.name = "minato";
		hero.job = "hero";
		hero.gold = 280000000;
		
		//一文字目：「-」左寄せ、「0」空き容量を０埋め、「,」3桁ごとにカンマを入れる、「+」符号を強制表示（※省略可）
		//二文字目：「数字」は桁数、n,m形式で指定した場合、全体n桁、小数点以下m桁での表示（※省略可）
		//三文字目：「d」整数、「s」文字列、「f」少数、「b」真偽値
		
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		String s = String.format(FORMAT, hero.getName(),hero.getJob(),hero.getGold());
		System.out.println(s);
	}

}
