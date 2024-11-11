package sukkiri.practice.practice_print17.practice05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		do {

			try{
				//入力指示
				System.out.print("id：");
				int id =Integer.parseInt(scan.nextLine());
				System.out.print("name：");
				String name =scan.nextLine();
				User user = new User(id, name);
				System.out.println(user.toString());

				break;
			}catch(NumberFormatException e) {
				System.err.println("数値を入力してください");
				System.out.println(e.getMessage());

			}catch(IllegalArgumentException | NullPointerException  e) {
				System.out.println(e.getMessage());

			}
		}while(true);

	}

}
