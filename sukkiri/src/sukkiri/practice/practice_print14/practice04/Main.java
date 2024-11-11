package sukkiri.practice.practice_print14.practice04;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("PI:"+MathUtility.PI);
		
		double result;
		
		result = MathUtility.add(3, 5);
		System.out.println("3 + 5 =" + result);
		result = MathUtility.substract(10, 4);
		System.out.println("10 - 4 =" + result);
		result = MathUtility.multiply(2, 6);
		System.out.println("2 * 6 = =" + result);
		result = MathUtility.divide(8, 0);
		System.out.println("8 / 2 =" + result);
		
		
		
		
		
	}

}
