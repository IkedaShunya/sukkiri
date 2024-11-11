package sukkiri.lesson12.sample03;

public class Main {
	public static void main(String[] args) {
		Slime s = new Slime();
		
		//メソッドの中身をインスタンス型（中身の型）によって決まります。
		Monster m = new Slime();
		s.run();
		m.run();
	}

}
