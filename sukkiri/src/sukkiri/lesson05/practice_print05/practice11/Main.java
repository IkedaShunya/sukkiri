package sukkiri.lesson05.practice_print05.practice11;

public class Main {


	public static void main(String[] args) {
		System.out.println(function(10));

	}

	public static int function(int n) {
		if(n==1) {
			return 1;
		} else {
			return n+function(n-1);
		}
	}

}
