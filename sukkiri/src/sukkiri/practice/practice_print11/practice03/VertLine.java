package sukkiri.practice.practice_print11.practice03;

public class VertLine extends AbstLine{
	
	public VertLine(int length) {
		super(length);
	}
	
	@Override
	public void draw() {
		for(int i =0; i < getLength(); i++) {
			System.out.println(getVertline());
		}
		System.out.println();
		
	}

}
