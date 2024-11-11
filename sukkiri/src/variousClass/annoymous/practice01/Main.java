package variousClass.annoymous.practice01;

public class Main {
	public static void main(String[] args) {
		double radius = 5.0;
		
		
		Shape shape = new Shape() {
			@Override
			public double getArea() {
				double area = radius* radius*Math.PI;
				return area;
			}; 
			@Override
			public double getPerimeter() {
				double circumference = radius*2*Math.PI;
				return circumference;
			};
		};
		
		System.out.println("Circle Area: " +shape.getArea());
		System.out.println("Circle Perimeter:  " +shape.getPerimeter());
	}

}
