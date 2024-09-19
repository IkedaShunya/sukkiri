package sukkiri.lesson05.practice04;

import java.util.Scanner;

public class Main {
	
	public static double calcTriangleArea(double bottom,double height) {
		double trianglearea = bottom * height /2;
		return trianglearea;
	}
	
	public static double calcCircleArea(double radius) {
		double circleArea = Math.pow(radius,2) *3.14;
		return circleArea;
	}
	

	public static void main(String[] args) {
		
		//三角形の高さ、底辺の入力し、triangleareaメソッドの呼び出し
		Scanner scan = new Scanner(System.in);
		System.out.print("三角形の底辺（cm）：");
		double bottom = scan.nextDouble();
		System.out.print("三角形の高さ（cm）：");
		double height = scan.nextDouble();
		
		String trianglearea = String.format("%.1f",calcTriangleArea(bottom,height));
		
		System.out.println("三角形の面積は" + trianglearea +"平方cmです。");
		
		
		//円の半径を入力し、calcCircleAreaメソッドの呼び出し
		System.out.print("円の半径（cm）：");
		double radius = scan.nextDouble();
		
		String circleArea = String.format("%.1f",calcCircleArea(radius));
		
		System.out.println("円の面積は" + circleArea +"平方cmです。");
		
		scan.close();
	}

}
