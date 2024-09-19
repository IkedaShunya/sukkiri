package sukkiri.lesson05.practice_print05.practice10;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		int inNumber = key_input();
		String smg = message(inNumber);
		display(smg);
		
		
		
	}
	
	public static int key_input() {
		int  inNumber ;
		Scanner sc = new Scanner( System.in );
		System.out.print(" Input no. : ");
		inNumber = sc.nextInt();
		
		sc.close();
		
		return inNumber;
	}
	
	public static String message(int inNumber) {
		String msg = "" ;
		switch( inNumber ){
		case 1 :
			msg = "Good Morning" ; 
			break ;
		case 2 :
			msg = "Good Afternoon" ; 
			break ;
		case 3 : 
			msg = "Good Evening" ; 
		}
		
		return msg;
		
	}
	
	public static void display(String msg) {
		System.out.println(msg);
	}


}
