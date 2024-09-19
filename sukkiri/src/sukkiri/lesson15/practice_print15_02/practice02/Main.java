package sukkiri.lesson15.practice_print15_02.practice02;

public class Main {

	public static void main(String[] args) {
		/*下記表は各国の人口です。
		各国を要素の値に持つString型の配列countryと、
		各人口を要素の値に持つint型の配列populationを作り、
		実行結果のような表示をしてください。*/
		
		String[] country = {"Japan","Australia","United States","China","Brazil"};
		int[] population = {126500000,25500000,331000000,1448500000,215400000};
		
		
		for(int i =0; i <country.length; i++) {
			System.out.printf("%-15s : %,14d \n",country[i],population[i]);
		}


	}

}
