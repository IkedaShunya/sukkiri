package sukkiri.lesson15.practice_print15_02.practice03;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] city = {"Tokyo","Canberra","Washington","Anchorage","Whitehorse"};
		double[] temperature = {4.9,21.44,0.35,-8.34,-15.3};
		
		final String FORMAT = "%-11s：%6.2f\n";
		for(int i =0; i <city.length; i++) {
			System.out.printf(FORMAT,city[i],temperature[i]);
		}
	}

}
