package sukkiri.practice.practice_print11.practice03;

public abstract class AbstLine extends Shape{
	private int length;
	
	public AbstLine(int length) {
		setLength(length);
	}
	
	public int getLength() {
		return this.length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
}
