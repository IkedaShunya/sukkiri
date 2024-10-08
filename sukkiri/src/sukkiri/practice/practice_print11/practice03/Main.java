package sukkiri.practice.practice_print11.practice03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Shape shapes[] = new Shape[4];
		
		shapes[0] = new Point();
		
		System.out.print("width（幅）:");
		int width =Integer.parseInt(scan.nextLine());
		System.out.print("height（高さ）:");
		int height =Integer.parseInt(scan.nextLine());
		shapes[1] = new Rectangle(width,height);
		
		
		System.out.print("horzLength（水平直線の長さ）:");
		int length =Integer.parseInt(scan.nextLine());		
		shapes[2] = new HorzLine(length);
		
		
		
		System.out.print("vertLength（垂直直線の長さ）:");
		int vertLength =Integer.parseInt(scan.nextLine());	
		shapes[3] = new VertLine(vertLength);
		
		for(int i =0; i <shapes.length; i++) {
			shapes[i].draw();
		}
		
	

	}

}
