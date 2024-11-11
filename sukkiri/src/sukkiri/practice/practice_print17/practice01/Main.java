package sukkiri.practice.practice_print17.practice01;

public class Main {

	public static void main(String[] args) {
		int x = 5;
        int y = 0;
        try {
        	 int result = x / y;
        	 System.out.println(result);
        }catch(ArithmeticException e) {
        	System.err.println("0で割ることができません");
        	e.printStackTrace();
        	System.out.println();
        }
        
        
        
       
       
        
        
        

	}

}
