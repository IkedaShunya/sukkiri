package sukkiri.lesson11.sample02;

public class Main {
	public static void main(String[] args) {
		Fool f = new Fool();
		f.name = "遊び人";
		Mantango m = new Mantango();
				
		f.attack(m);
		f.talk();
		f.watch();
		f.hear();
		f.run();
	}

}
