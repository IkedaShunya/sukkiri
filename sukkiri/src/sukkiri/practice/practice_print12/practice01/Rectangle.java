package sukkiri.practice.practice_print12.practice01;

public class Rectangle extends Shape{
	double width;
	double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		
	}

	@Override
	public double calculateArea() {
		double rectangle = this.width* this.height;
		return rectangle;
	}
	
	

}
