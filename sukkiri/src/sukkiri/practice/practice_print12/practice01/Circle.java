package sukkiri.practice.practice_print12.practice01;

public class Circle extends Shape{
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		double circleArea = radius*radius*Math.PI;
		return circleArea;
	};

}
