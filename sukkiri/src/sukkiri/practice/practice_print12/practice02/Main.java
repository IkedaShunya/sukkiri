package sukkiri.practice.practice_print12.practice02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Animal animals[] = new Animal[4];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i =0 ;i < animals.length ; i++) {
			System.out.println("動物を指定してください。１：猫　２：犬");
			
			int kind = Integer.parseInt(scan.nextLine());
			
			System.out.print("名前：");
			String name = scan.nextLine();
			
			System.out.print("年齢：");
			int age = Integer.parseInt(scan.nextLine());
			
			
			if(kind == 1) {
				System.out.print("体重：");
				int weight = Integer.parseInt(scan.nextLine());
				
				animals[i] = new Cat(name,age,weight);
			
			}else if(kind == 2) {
				animals[i] = new Dog(name,age);
				
				
			}
			
			
			
		}
		
		for(int i =0 ;i < animals.length ; i++) {
			animals[i].showProfile();
			animals[i].speak();
			
			if(animals[i] instanceof Dog d) {
				 d.run();
			
			}else if(animals[i] instanceof Cat c) {
				c.sleep();
			}
			
			
		}
	}

}
