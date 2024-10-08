package sukkiri.practice.practice_print07.practice01;

import java.util.Scanner;

public class AnimalTester {

	public static void main(String[] args) {
		//インスタンス化
		Animal dog = new Animal("犬","ポチ",3,"ワンワン");
		Animal cat = new Animal("猫","たま",5,"にゃーにゃー");
		
		//表示
		dog.show();
		cat.show();
		
		
		//
		Animal dog2 = new Animal();
		//入力指示
		Scanner scan = new Scanner(System.in);
		System.out.print("名前：");
		dog2.setName(scan.nextLine());
		System.out.print("種類：");
		dog2.setKind(scan.nextLine());
		System.out.print("年齢：");
		dog2.setAge(Integer.parseInt(scan.nextLine()));
		System.out.print("鳴き声：");
		dog2.setCry(scan.nextLine());
		
		dog2.show();
		
		scan.close();
		
	}

}
