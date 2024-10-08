package sukkiri.practice.practice_print07.practice02;

import java.util.Scanner;

public class AccountTester {

	public static void main(String[] args) {
		//Accountクラスの配列を３つ用意
		Account person[] = new Account[3];
		
		Scanner scan =new Scanner(System.in);
		
		for(int i=0; i<person.length ;i++) {
			System.out.print("口座名義:");
			String name = scan.nextLine();
			System.out.print("口座番号:");
			String num = scan.nextLine();
			System.out.print("預金額：");
			int balance =Integer.parseInt(scan.nextLine());
			System.out.print("口座作成年：");
			int year = Integer.parseInt(scan.nextLine());
			System.out.print("口座作成月：");
			int month =Integer.parseInt(scan.nextLine());
			System.out.print("口座作成日：");
			int day =Integer.parseInt(scan.nextLine());
			
			person[i] = new Account(name,num,balance,year,month,day);
			person[i].showAccount();
			System.out.println();
			//person[0]のbalanceを1000加算する
			if(i == 0) {
				person[i].deposit(1000);
			}
			//person[1]のbalanceを500減算する。
			if(i == 1) {
				person[1].withdraw(500);
			}
			//person[2]の口座作成日を「2000年10月20日」に変更する
			if(i == 2) {
				person[i].setDay(2000,10,20);
			}
			
				
		}
			
		
		
		
		System.out.printf("%sの預金額は%dです\n",person[0].getName(),person[0].getBalance());
		System.out.printf("%sの預金額は%dです\n",person[1].getName(),person[1].getBalance());
		person[2].getDay().showCreateDate();
		scan.close();
	}

}
