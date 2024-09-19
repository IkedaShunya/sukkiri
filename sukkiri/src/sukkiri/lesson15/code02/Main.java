package sukkiri.lesson15.code02;

public class Main {

	public static void main(String[] args) {
		String s1 = "Java and JavaScript";
		
		
		//s1.contains("Java")　s1に文字列"Java"が含まれているか　boolean
		if(s1.contains("Java")) {
			System.out.println("文字列s1は、Javaを含んでいます");
		}
		
		
		//s1.endsWith("Java")　s1が文字列"Java"でおわっているか。
		if(s1.endsWith("Java")) {
			System.out.println("文字列s1は、Javaが末尾にあります");
		}
		
		// s1.indexOf("java") s1で文字列"Java"出てくるのは何番目か　(int)
		System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
		
		// s1.indexOf("java") s1で文字列"Java"出てくるのは後ろから何番目か　(int)
		System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.lastIndexOf("Java"));		

	}
	


}
