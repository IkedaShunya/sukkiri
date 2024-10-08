package sukkiri.practice.practice_print11.practice03;

public  abstract class Shape {
	private final String SYMBOL ="+";
	private final String HORZLINE ="-";
	private final String VERTLINE ="|";
	
	public abstract void draw();
	
	public String getSymbol() {
		return this.SYMBOL;
	}
	
	public String getHorzline() {
		return this.HORZLINE;
	}
	
	public String getVertline() {
		return this.VERTLINE;
	}

}
