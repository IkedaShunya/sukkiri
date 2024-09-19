package sukkiri.lesson05.practice_print05.addition.practice01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		処理の内容：①int型変数aとbを用意し、キーボードから入力を行う
		Scanner sc = new Scanner(System.in);
		System.out.print("a = ");
		int a = sc.nextInt();
		System.out.print("b = ");
		int b = sc.nextInt();
//		②addメソッドを呼び出し、戻り値を表示する
//		「a + b = (戻り値)」の形で出力する。
		System.out.println("a + b = " + add(a,b));
//		③subメソッドを呼び出し、戻り値を表示する。
		System.out.println("a - b = " + sub(a,b));
//		「a - b = (戻り値)」の形で出力する。
//		④mulメソッドを呼び出し、戻り値を表示する。
//		「a × b = (戻り値)」の形で出力する。
		System.out.println("a * b = " + mul(a,b));
//		⑤divメソッドを呼び出し、戻り値を表示する。
//		「a ÷ b = (戻り値)」の形で出力する。
		System.out.println("a ÷ b = " + div(a,b));
		
		sc.close();

		

	}
//	メソッド名：add
//	引数：int a , int b
//	戻り値の型：int
//	処理：引数で受け取った変数aと変数bを足し算した値を返す
	public static int add(int a, int b) {
		int addNum =a+b;
		return addNum;
	}

//	メソッド名：sub
//	引数：int a, int b
//	戻り値の型：int
//	処理：引数で受け取った変数aを変数bで引き算した値を返す。
	public static int sub(int a,int b) {
		int sumNum = a - b;
		return sumNum;
	}

//	メソッド名：mul
//	引数：int a, int b
//	戻り値の型：int
//	処理：引数で受け取った変数aと変数bを乗算した値を返す。
	public static int mul(int a, int b) {
		int mulNum = a*b;
		return mulNum;
	}

//	メソッド名：div
//	引数：int a, int b
//	戻り値の型：int
//	処理：引数で受け取った変数aを変数bで除算した値を返す。	
	public static int div(int a, int b) {
		int divNum = a/b;
		return divNum;
	}

}
