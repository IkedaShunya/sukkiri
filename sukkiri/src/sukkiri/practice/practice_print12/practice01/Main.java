package sukkiri.practice.practice_print12.practice01;

public class Main {
	public static void main(String[] args) {
		Shape[] shape = new Shape[2];
		
		shape[0] = new Circle(5.0);
		shape[1] = new Rectangle(4.0, 6.0);
		
		String[] shapeName = {"Circle Area   : ","Rectangle Area: "};
		
		for(Shape display : shape) {
			System.out.println(display.calculateArea());
		}
		
	}

}
