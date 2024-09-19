package sukkiri.lesson01.code05;

public class Main {
	public static void main(String[] args) {
		final double PI = 3.14; //円周率を入れた変数
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
		System.out.println("パイの半径を倍にします");
//		PI = 10; //誤り！代入すべき変数はpie
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
	}

}
