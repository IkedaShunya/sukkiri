package sukkiri.lesson06.sample07.calcapp.main;
//下記階層のクラスの明示しなくてよくなる
//「sukkiri.lesson06.sample06.calcapp.logics」配下の所属するすべてのクラスをインポートしなさい
import sukkiri.lesson06.sample06.calcapp.logics.*;

public class Calc {
	public static void main(String[] args) {
		int a =10;
		int b =2;
				
		//int total =sukkiri.lesson06.sample05.calcapp.logics.CalcLogic.tasu(a,b);
		int total =CalcLogic.tasu(a,b);
		
		
		//int delta =sukkiri.lesson06.sample05.calcapp.logics.CalcLogic.hiku(a,b);
		int delta =CalcLogic.hiku(a,b);
		
		
		System.out.println("足すと" + total + "、引くと" + delta);
		
	}
	

}

