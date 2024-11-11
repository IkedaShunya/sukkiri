package sukkiri.practice.practice_print14.practice04;

public class MathUtility {
	public static final double PI =3.14159265359;

	
	public static double add(int input1,int input2) {
		return input1+ input2;
	}
	
	public static double substract(int input1,int input2) {
		
		return input1- input2;
	}
	
	public static double multiply(int input1,int input2) {
		return input1* input2;
	}
	
	public static double divide(int input1,int input2) {
		if(input2 ==0) {
			throw new IllegalArgumentException("Division by zero is not allowed.");
		}		
		return input1/ input2;
	}
	
	

}
