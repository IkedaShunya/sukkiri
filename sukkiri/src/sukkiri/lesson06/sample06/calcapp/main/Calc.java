package sukkiri.lesson06.sample06.calcapp.main;
//CalcLogicとかいていたら「sukkiri.lesson06.sample06.calcapp.logics.CalcLogic」と解釈しなさいという意味
//下記階層のクラスの明示しなくてよくなる
import sukkiri.lesson06.sample06.calcapp.logics.CalcLogic;

public class Calc {
	public static void main(String[] args) {
		int a =10;
		int b =2;
				
		//int total =sukkiri.lesson06.sample05.calcapp.logics.CalcLogic.tasu(a,b);
		int total =CalcLogic.tasu(a,b);
		int c = CalcLogic.test;
		System.out.println(c);
		
		//int delta =sukkiri.lesson06.sample05.calcapp.logics.CalcLogic.hiku(a,b);
		int delta =CalcLogic.hiku(a,b);
		
		
		System.out.println("足すと" + total + "、引くと" + delta);
		
	}
	

}

