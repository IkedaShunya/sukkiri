package sukkiri.lesson15.code07;

public class Main {
	
	public static void main(String args[]) {
		String s = "abc,def:ghi";
		
		//「,」と「:」のところで分割する
		String[] words = s.split("[,:]");
		
		
		for(String w : words) {
			System.out.println(w + "->");
		}
		
		String[] words2 = s.split("[cf]");
		for(String g : words2) {
			System.out.println(g + "->");
		}
		
	}

}
