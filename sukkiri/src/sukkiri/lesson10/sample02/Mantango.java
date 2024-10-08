package sukkiri.lesson10.sample02;

public class Mantango {
	int hp;
	//フィールド宣言の先頭にfinalを付けると、
	//値を書きかえれない定数フィールドになる（大文字にする）
	final int LEVEL =10;
	
	char suffix;
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した");
		
	}

}
