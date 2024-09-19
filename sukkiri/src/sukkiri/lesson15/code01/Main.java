package sukkiri.lesson15.code01;

public class Main {

	public static void main(String[] args) {
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		
		
		//a.equals(b)  aとｂの内容が等しいことを確認（boolean）
		if(s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		
		//a.equalsIgnoreCase(b)  aとｂの内容(大文字と小文字を区別せず)が等しいことを確認（boolean）
		if(s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とｓ3はケースを区別しなければ等しい");
		}
		
		
		//a.length() aの文字列の長さ　(int)
		System.out.println("s1の長さは" + s1.length() + "です");
		
		
		//a.isEmpty()　aが空文字（０文字）か調べる　(boolean)
		if(s1.isEmpty()) {
			System.out.println("s1は空文字です");
		}

	}

}
