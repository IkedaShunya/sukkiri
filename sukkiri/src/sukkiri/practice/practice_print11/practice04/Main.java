package sukkiri.practice.practice_print11.practice04;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
		Rectangle rectangle = new Rectangle(4.0,6.0);
		
		double circleArea =circle.calculateArea();
		double rectangleArea =rectangle.calculateArea();
		
		System.out.println("Circle Area   : " + circleArea);
		System.out.println("Rectangle Area   : " + rectangleArea);
	}

}
