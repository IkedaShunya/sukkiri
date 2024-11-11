package sukkiri.practice.practice_print17.practice04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do{
			try {
				System.out.println("整数を入力してください。");
				String str = sc.nextLine();
				int num = Integer.parseInt(str);
				System.out.println("入力された整数は" + num + "です。");
				break;
			}catch(NumberFormatException e) {
				System.err.println("整数を入力してください。");
				e.printStackTrace();
			}
		}while(true);



	}


}
