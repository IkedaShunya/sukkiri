package sukkiri.practice.practice_print11.practice04;

public class Circle implements Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		double area = radius*radius*Math.PI;
		return area;
	}
	

}
