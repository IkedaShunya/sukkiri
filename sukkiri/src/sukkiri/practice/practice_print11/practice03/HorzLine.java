package sukkiri.practice.practice_print11.practice03;

public class HorzLine extends AbstLine{
	public HorzLine(int length) {
		super(length);
	}
	
	@Override
	public void draw() {
		for(int i =0; i < getLength();i++) {
			System.out.print(getHorzline());
		}
		System.out.println();
		System.out.println();
	}
	

}
