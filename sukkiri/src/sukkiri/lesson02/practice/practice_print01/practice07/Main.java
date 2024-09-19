package sukkiri.lesson02.practice.practice_print01.practice07;

public class Main {

	public static void main(String[] args) {
		/*double型の変数ｘに数値5.0を代入して、ｘの値を2乗、3乗した結果をコンソール画面に表示しましょう。
		double z = Math.pow(①,②);を使う。
		①	繰り返し掛け算する数。　②何回掛け合わせたかを表す数*/
		double x = 5.0;
		double z = Math.pow(x , 2);
		System.out.println("ｘの2乗："+z);
		z = Math.pow(x , 3);
		System.out.println("ｘの3乗："+z);

	}

}
