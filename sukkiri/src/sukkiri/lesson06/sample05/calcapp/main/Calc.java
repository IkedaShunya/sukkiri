package sukkiri.lesson06.sample05.calcapp.main;


public class Calc {
	public static void main(String[] args) {
		int a =10;
		int b =2;
		
		//パッケージの指定(Full qualified Class Name)を実施
		int total =sukkiri.lesson06.sample05.calcapp.logics.CalcLogic.tasu(a,b);
		int delta =sukkiri.lesson06.sample05.calcapp.logics.CalcLogic.hiku(a,b);
		
		
		System.out.println("足すと" + total + "、引くと" + delta);
		
	}
	

}

