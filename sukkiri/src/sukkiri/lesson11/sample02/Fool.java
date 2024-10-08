package sukkiri.lesson11.sample02;

public class Fool extends Character implements Human{
	//Characterからhpやnameなどのフィールドを継承している
	//Characterから継承した抽象メソッドattack()を実装
	@Override
	public void attack(Mantango m) {
		System.out.println(this.name + "は戦わず遊んでいる");
	}
	
	//Humanから継承した4つの抽象メソッドを実装
	public void talk() {
		System.out.println("話す");
	}
	
	public void watch() {
		System.out.println("見る");
	}
	
	public void hear() {
		System.out.println("聞く");
	}
	
	public void run() {
		System.out.println("走る");
	}

}
