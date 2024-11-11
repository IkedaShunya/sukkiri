package sukkiri.practice.practice_print17.practice02;

public class Main {
	public static void main(String[] args) {
		String str = null;
		try {
			int length = str.length();
			System.out.println(length);
		}catch(NullPointerException e) {
			System.err.println("null参照があります");
			e.printStackTrace();
			
		}
		
	}

}
