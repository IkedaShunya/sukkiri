package sukkiri.practice.practice_print11.practice04;

public class Rectangle implements Shape{
	double width;
	double height;
	
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	
	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	@Override
	public double calculateArea() {
		double area = getHeight()*getWidth();
		return area;
	}
	

}
