package sukkiri.lesson06.sample03;


public class Calc {
	public static void main(String[] args) {
		int a =10;
		int b =2;
		
		//明示的に所属クラス（CalcLogic.）を記載する必要がある
		int total =CalcLogic.tasu(a,b);
		int delta =CalcLogic.hiku(a,b);
		
		System.out.println("足すと" + total + "、引くと" + delta);
	}
	

}

