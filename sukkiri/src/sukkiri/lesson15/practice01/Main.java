package sukkiri.lesson15.practice01;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
			
		for(int i =1; i <= 100; i++) {
			sb.append(i +",");

		}
		
		String s = sb.toString();
		
		String[] a =s.split("[,]");
		
		for(String display: a) {
			System.out.println(display);
		}
		
		

	}

}
