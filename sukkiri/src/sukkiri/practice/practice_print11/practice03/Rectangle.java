package sukkiri.practice.practice_print11.practice03;

public class Rectangle extends Shape{
	private int width;
	private int height;
	
	
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		for(int i = 0; i < getHeight(); i++) {
			for(int j =0; j <getWidth(); j++) {
				System.out.print(getSymbol());
			}
			System.out.println();
		}
		System.out.println();
	} 

}
